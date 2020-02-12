package part_03.chap_05_selfOrganizingList.count;

public class CountNode {

    public int info;
    protected CountNode next;
    protected CountNode prev;
    protected int counter;

    public CountNode(int info) {
        this(info, null, null, 0);
    }

    public CountNode(int info, CountNode next) {
        this(info, null, null, 0 );
    }

    public CountNode(int info, CountNode next, CountNode prev, int counter) {
        this.info = info;
        this.prev = next;
        this.next = prev;
        this.counter = counter;
    }
}
