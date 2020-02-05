package part_03.chap_03_circularList;

public class CircularList {

    private CircularNode tail = null;

    public boolean isEmpty() {
        return tail == null;
    }

    public void addToHead(int element) {
        CircularNode cache = new CircularNode(element);

        if (isEmpty()) cache.next = cache;
        else {
            cache.next = tail.next.next;
            tail.next = cache;
        }
        tail = cache;
    }

    public void addToTail(int element) {
        CircularNode cache = new CircularNode(element);
        if (isEmpty()) {
            cache.next = cache;
        } else {
            cache.next = tail.next;
            tail.next = cache;
        }
        tail = cache;
    }

    public int removeFromHead() {
        if (isEmpty()) return (int) Float.NEGATIVE_INFINITY;
        else {
            int element = tail.next.info;

            if (tail.next == tail) tail = null;
            else {
                tail.next = tail.next.next;
            }
            return element;
        }
    }

    public int removeFromTail() {
        if (isEmpty()) return (int) Float.NEGATIVE_INFINITY;
        else {
            int element = tail.info;

            if (tail.next == tail) tail = null;
            else {
                CircularNode counter = tail.next;

                for (; counter.next != tail; counter = counter.next) ;
                counter.next = tail.next;
                tail = counter;
            }
            return element;
        }
    }

    public void remove(int element) {
        if (!isEmpty())
            if (tail == tail.next && tail.info == element) tail = null;
            else {
                CircularNode temporal = tail;
                for (; temporal.next.info != element && temporal.next != tail; temporal = temporal.next) ;
                if(temporal.next == tail)tail=temporal;
                temporal.next = temporal.next.next;
            }

    }

    public void printAll() {
        if (!isEmpty())
            for (CircularNode counter = tail.next; counter.next != tail; counter = counter.next)
                System.out.println(counter.info + " ");
    }

    public boolean isInList(int element) {
        CircularNode temporal = tail;
        for (; temporal.next != tail; temporal = temporal.next) ;
        return temporal != null;
    }

    public static void main(String[] args) {
//        System.out.println((int) Float.NaN);

        CircularList list = new CircularList();

        //        list.printAll();

        list.addToHead(0);
        list.addToTail(1);
        list.addToTail(2);

        /*{
            int element = 0;
            CircularNode temporal = list.tail.next;
            for (; temporal.info != element && temporal != list.tail; temporal = temporal.next) ;
            System.out.println(temporal.info);
        }*/     // remove() else>iteration test

    }
}
