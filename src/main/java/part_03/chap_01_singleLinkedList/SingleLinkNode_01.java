package part_03.chap_01_singleLinkedList;

public class SingleLinkNode_01 {

    public int info;
    public SingleLinkNode_01 next;

    public SingleLinkNode_01(int i){
        this(i, null);
    }
    public SingleLinkNode_01(int info, SingleLinkNode_01 next){
        this.info = info;
        this.next = next;
    }

    public static void main(String[] args) {

        SingleLinkNode_01 p = new SingleLinkNode_01(10);
        p.next = new SingleLinkNode_01(8);
        p.next.next = new SingleLinkNode_01(50);

    }
}
