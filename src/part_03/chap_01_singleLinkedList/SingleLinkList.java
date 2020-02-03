package part_03.chap_01_singleLinkedList;

public class SingleLinkList {

    protected SingleLinkNode_01 head, tail;

    public SingleLinkList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int element) {
        head = new SingleLinkNode_01(element, head);
        if (tail == null) tail = head;
    }

    public void addToTail(int element) {
        if (!isEmpty()) {
            tail.next = new SingleLinkNode_01(element);
            tail = tail.next;
        } else head = tail = new SingleLinkNode_01(element);
    }

    public int deleteFromHead() {
        int element = head.info;
        if (head == tail)
            head = tail = null;
        else head = head.next;
        return element;
    }

    public int deleteFromTail() {
        int element = tail.info;
        if (head == tail)
            head = tail = null;
        else {
            SingleLinkNode_01 temporal;
            for (temporal = head; temporal.next != tail; temporal = temporal.next)
                tail = temporal;
            tail.next = null;
        }
        return element;
    }

    public void printAll() {
        for (SingleLinkNode_01 temporal = head; temporal != null; temporal = temporal.next)
            System.out.print(temporal.info + " ");
    }

    public boolean isInList(int element) {
        SingleLinkNode_01 temporal = head;
        for (; temporal != null && temporal.info != element; temporal = temporal.next) ;
        return temporal != null;
    }

}
