package main.java.part_03.chap_03_circularList.bidirectional;

import main.java.part_03.chap_03_circularList.Circumlistable;

public class CircBiList implements Circumlistable {

    private CircBiNode tail = null;

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public void addToHead(int element) {
        CircBiNode temporal = new CircBiNode(element);

        if (isEmpty()) tail = temporal;
        else {
            temporal.next = tail.next;
        }
        tail.next = temporal;
        temporal.prev = tail;

    }

    @Override
    public void addToTail(int element) {
        CircBiNode temporal = new CircBiNode(element);

        if (isEmpty()) tail = tail.next = tail.prev = temporal;
        else ;

    }

    @Override
    public int removeFromHead() {
        if (isEmpty()) return Integer.MIN_VALUE;
        else {
            int result = tail.prev.info;
            tail.next = tail.next.next;
            tail.next.prev = tail;
            return result;
        }
    }

    @Override
    public int removeFromTail() {
        if (isEmpty()) return Integer.MIN_VALUE;
        else {
            int result = tail.info;
            tail.prev.next = tail.next;
            tail.next.prev = tail = tail.prev;
            return result;
        }
    }

    @Override
    public void remove(int element) {
    }

    @Override
    public void printAll() {
        if (!isEmpty()) {
            CircBiNode counter = tail.next;
            do {
                System.out.println(counter.info + " ");
                counter = counter.next;
            } while (counter != tail.next);
        }
    }

    @Override
    public boolean isInList(int element) {
        if (isEmpty()) return false;
        else {
            CircBiNode temporal = tail;
            do {
                temporal = temporal.next;
            }
            while (temporal.info != element && temporal != tail);
            return temporal.info == element;
        }
    }

    public static void main(String[] args) {

        CircBiList list = new CircBiList();
        list.addToHead(2);
        list.addToHead(1);
        list.addToHead(0);

        list.printAll();


    }
}
