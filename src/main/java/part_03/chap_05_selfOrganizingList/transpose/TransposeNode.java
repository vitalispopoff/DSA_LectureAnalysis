package part_03.chap_05_selfOrganizingList.transpose;

public class TransposeNode {

    public int info;
    TransposeNode
            next,
            prev = null;

    public TransposeNode(int i) {
        this(i, null);
    }

    public TransposeNode(int info, TransposeNode next) {
        this.info = info;
        this.next = next;
    }

    protected void swapInfo(TransposeNode that) {
        int swap = this.info;
        this.info = that.info;
        that.info = swap;
    }
}