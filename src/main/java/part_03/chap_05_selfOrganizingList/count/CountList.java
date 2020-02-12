package part_03.chap_05_selfOrganizingList.count;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountList {

    CountNode head = null, tail = null;

    public void add(int element) {
        CountNode temporal = new CountNode(element);

        if (isEmpty()) head = tail = temporal;
        else {
            temporal.prev = tail;
            tail = tail.next = temporal;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isInList(int element) {
        if (isEmpty()) return false;
        else if (head == tail & head.info == element) return true;
        else {
            CountNode i = head;
            for (; i != null && i.info != element; i = i.next) ;
            if (i == null) return false;
            else {
                i.counter++;
//                while(isPrevCounterMinor(i))swap(i);
                return true;
            }
        }
    }

    boolean isPrevCounterMinor(CountNode node) {
        if (head == node) return false;
        else return node.counter > node.prev.counter;
    }

    void swap(CountNode node) {
        if (node == head) return;
        else {
            CountNode cache1, cache2, cache3;
            if (node == head.next) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                head = node;
                node.next = node.prev;
                node.prev = null;

            } else if (node == tail) {
                node.prev.next = null;
                tail = node.prev;
                node.next = tail;
                node.prev = tail.prev;
                tail.prev = node.prev.next = node;


            } else {

            }
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
        for (int i = 0; i <= 2; list.add(i++)) ;

        System.out.println(list.toString());
        list.swap(list.tail);
        System.out.println(list.toString());

    }
}
