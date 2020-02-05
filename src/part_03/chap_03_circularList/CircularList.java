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


    public int removeFromHead() /*throws NullPointerException*/{
//        if(isEmpty()) throw new NullPointerException();
//            if(isEmpty()) return Integer.MIN_VALUE; // returns the least expected values
        if(isEmpty()) return (int) Float.NEGATIVE_INFINITY;
        int element = tail.next.info;

//        tail.next

        return element;
    }


    public static void main(String[] args) {

        System.out.println((int) Float.NaN);
    }
}
