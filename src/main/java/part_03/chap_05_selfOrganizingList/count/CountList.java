package part_03.chap_05_selfOrganizingList.count;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountList {

    CountNode head = null, tail = null;

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
        if (!isEmpty()){
         if (head == tail && head.info == element) return true;
        else {
             CountNode i = head;
             for (; i != null && i.info != element; i = i.next) ;
             if (i.info == element) result = true;
         }
        }
        return result;
    }

    public CountNode findElement(int element){
        CountNode result = null;
        for (result = head; result != null && result.info != element; result = result.next);
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

        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++));

        System.out.println(list.toString());
        System.out.println(list.findElement(2).info);

    }
}
