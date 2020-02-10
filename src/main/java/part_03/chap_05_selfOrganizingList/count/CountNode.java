package part_03.chap_05_selfOrganizingList.count;

public class CountNode {

    public int info;
    protected CountNode next;
    protected CountNode prev;
    protected int counter = 0;

    public CountNode(int info) {
        this(info, null, null);
    }

    public CountNode(int info, CountNode next) {
        this(info, null, null);
    }

    public CountNode(int info, CountNode next, CountNode prev) {
        this.info = info;
        this.prev = next;
        this.next = prev;
    }
}
