package part_03.chap_02_doubleLinkedList;

public class DoubleLinkNode {

    public int info;
    public DoubleLinkNode next, prev;

    public DoubleLinkNode(int info){this(info, null, null);}

    public DoubleLinkNode(int info, DoubleLinkNode next, DoubleLinkNode prev){
        this.info = info;
        this.next = next;
        this.prev = prev;
    }
}