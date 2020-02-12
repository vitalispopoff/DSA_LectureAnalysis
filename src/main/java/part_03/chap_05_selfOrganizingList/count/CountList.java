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

    CountNode swap(CountNode node) {
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


        } else ;
        return node;
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
