package part_03.chap_03_circularList.bidirectional;

import part_03.chap_03_circularList.Circumlistable;

public class CircBiList /*implements Circumlistable*/ {

    private CircBiNode tail = null;

    //    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    //    @Override
    public void addToHead(int element) {
        CircBiNode temporal = new CircBiNode(element);

        if (isEmpty()) tail = temporal;
        else {
            temporal.next = tail.next;
        }
        tail.next = temporal;
        temporal.prev = tail;

    }

    //    @Override
    public void addToTail(int element) {
        CircBiNode temporal = new CircBiNode(element);

        if (isEmpty()) tail = tail.next = tail.prev = temporal;
        else ;

    }

    //    @Override
    public void printAll() {
        if (!isEmpty()) {
            CircBiNode counter = tail.next;
            do {
                System.out.println(counter.info + " ");
                counter = counter.next;
            } while (counter != tail.next);
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
