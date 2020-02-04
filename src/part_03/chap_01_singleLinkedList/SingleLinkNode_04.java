package part_03.chap_01_singleLinkedList;

public class SingleLinkNode_04 {

    public Object info;
    public SingleLinkNode_04 next;

    public SingleLinkNode_04() {
        next = null;
    }

    public SingleLinkNode_04(Object element) {
        info = element;
        next = null;
    }

    public SingleLinkNode_04 (Object element, SingleLinkNode_04 ptr){
        info = element;
        next = ptr;
    }
}
