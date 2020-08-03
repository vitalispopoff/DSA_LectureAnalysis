package part_03.chap_05_selfOrganizingList.moveToFront;

public class MoveToFrontNode {

    protected int
            info;
    public MoveToFrontNode
            next;

    public MoveToFrontNode(int info) {
        this(info, null);
    }

    public MoveToFrontNode(int info, MoveToFrontNode next) {

        this.info = info;
        this.next = next;
    }

    public void swap(MoveToFrontNode that){

        int
            swap = this.info;

        this.info = that.info;
        that.info = swap;
    }
}