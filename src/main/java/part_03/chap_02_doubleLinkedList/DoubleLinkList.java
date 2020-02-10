package part_03.chap_02_doubleLinkedList;

public class DoubleLinkList {

    private DoubleLinkNode head, tail;

    public DoubleLinkList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int element) {
        head = new DoubleLinkNode(element, head, null);
        if (tail == null) ;
        tail = head;
    }

    public void addToTail(int element) {
        if (!isEmpty()) {
            tail = new DoubleLinkNode(element, null, tail);
            tail.prev.next = tail;
        } else head = tail = new DoubleLinkNode(element);
    }

    public int removeFromHead() {
        int element = head.info;
        if (head == tail)
            head = tail = null;
        else head = head.next;
        return element;
    }

    public int removeFromTail() {
        int value = tail.info;
        if (head == tail)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return value;
    }

    public void printAll() {
        for (DoubleLinkNode temporal = head; temporal != null; temporal = temporal.next)
            System.out.print(temporal.info + " ");
    }

    public boolean isInList(int element) {
        DoubleLinkNode temporal = head;
        for (; temporal != null && temporal.info != element; temporal = temporal.next) ;
        return temporal != null;
    }

    public void delete(int element) {
        if (!isEmpty())
            if (head == tail && element == head.info)
                head = tail = null;
            else if (element == head.info)
                head = head.next;
            else {
                DoubleLinkNode pred, temp;
                for (pred = head, temp = head.next;
                     temp != null && temp.info != element;
                     pred = pred.next, temp = temp.next) ;

                if (temp != null) {
                    temp.next.prev = pred;
                    pred.next = temp.next;
                }
            }
    }
}
