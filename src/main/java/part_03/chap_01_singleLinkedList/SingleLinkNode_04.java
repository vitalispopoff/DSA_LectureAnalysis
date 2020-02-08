package main.java.part_03.chap_01_singleLinkedList;

public class SingleLinkNode_04 {

    public Object info;
    public SingleLinkNode_04 next = null;

    public SingleLinkNode_04(Object element) {
        info = element;
    }

    public SingleLinkNode_04 (Object element, SingleLinkNode_04 ptr){
        this(element);
        next = ptr;
    }

    public static void main(String[] args) {

        SingleLinkNode_04 p = new SingleLinkNode_04(10);
        p.next = new SingleLinkNode_04(8, new SingleLinkNode_04(50));
    }
}
