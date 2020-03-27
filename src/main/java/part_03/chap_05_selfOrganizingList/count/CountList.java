package part_03.chap_05_selfOrganizingList.count;

import java.util.*;

public class CountList {

    CountNode
            head = null,
            tail = null;

    public CountNode add(int element) {
        CountNode node = new CountNode(element);

        if (isEmpty()) head = tail = node;
        else {
            node.prev = tail;
            tail = tail.next = node;
        }
        return node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isInList(int element) {
        boolean result = false;
        if (!isEmpty()) {
            if (head == tail && head.info == element) return true;
            else {
                CountNode i = findElement(element);
                if (i != null)
                    if (i.info == element) {                  // second if not needed, but wanna be sure - just in case.
                        i.counter++;
                        result = true;
                        while (isPrevCounterMinor(i)) swap(i);
                    }
            }
        }
        return result;
    }

    public CountNode findElement(int element) {
        CountNode result = null;
        for (result = head; result != null && result.info != element; result = result.next) ;
        return result;
    }

    boolean isPrevCounterMinor(CountNode node) {
        if (head == tail || node == head) return false;
        else return node.counter > node.prev.counter;
    }

    public CountNode swap(CountNode node) {
        try {
            if (head != tail) {
                node.prev.next = node == tail ? null : node.next;           //  1
                if (node != tail) node.next.prev = node.prev;               //  2
                node.next = node.prev;                                      //  3
                if (node.prev != head) node.prev.prev.next = node;          //  4
                node.prev = node.next == head ? null : node.prev.prev;      //  5
                node.next.prev = node;                                      //  6
                if (node.next == head) head = node;                         //  head
                if (node == tail) tail = node.next;                         //  tail
            }
        } catch (NullPointerException e) {
            System.out.println("list is empty");
        } finally {
            return node;
        }
    }

    public CountNode remove(int element) {
        CountNode node = null;
        try {
            node = findElement(element);
            if (head == tail && node == head) head = tail = null;
            else {
                if (node != head) node.prev.next = node.next;
                if (node != tail) node.next.prev = node.prev;
                if (node == head) head = node.next;
                if (node == tail) tail = node.prev;
            }
        } catch (NullPointerException e) {
            System.out.println("element was not in the list");
        } finally {
            return node;
        }
    }

    @Override
    public String toString() {
        List<Integer> listing = toArray();
        return listing.toString();
    }

    public List<Integer> toArray() {
        List<Integer> listing = new ArrayList<>();

        if (head == tail)
            if (head == null) return listing;
            else {
                listing.add(head.info);
                return listing;
            }
        else {
            for (CountNode i = head; i != null; listing.add(i.info), i = i.next) ;
            return listing;
        }
    }

    public static void main(String[] args) {
    }
}