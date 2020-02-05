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

    public void printAll() throws NullPointerException{
        for(CircularNode counter = tail.next; counter.next != tail; counter = counter.next)
            System.out.println(counter.info+" ");
    }


    public static void main(String[] args) {

//        System.out.println((int) Float.NaN);

        new CircularList().printAll();

    }
}
