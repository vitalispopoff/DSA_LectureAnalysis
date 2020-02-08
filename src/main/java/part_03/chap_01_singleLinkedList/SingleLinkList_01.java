package main.java.part_03.chap_01_singleLinkedList;

public class SingleLinkList_01 {

    protected SingleLinkNode_01 head, tail;

    public SingleLinkList_01() {
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

    public void delete(int element){
        if(!isEmpty())
            if(head==tail && element==head.info)    //one-element list, the element is the one
                head=tail=null;
            else if(element==head.info)             // multi-element list, the head is the one
                head=head.next;
            else{                                   // multi-element list, the head ain't the one
                SingleLinkNode_01 pred, temp;

                for(pred = head, temp = head.next;
                    temp !=null && temp.info!=element;
                    pred = pred.next, temp = temp.next);

                if(temp !=null){
                    pred.next = temp.next;
                    if (temp == tail)
                        tail = pred;
                }
            }
    }

    public static void main(String[] args) {

        SingleLinkList_01 list = new SingleLinkList_01();

        for (int i = 0; i < 4; i++) {
            list.addToHead(i);
        }

        list.printAll();
        System.out.println("\n*deletes");
        list.delete(0);
        list.printAll();
    }
}
