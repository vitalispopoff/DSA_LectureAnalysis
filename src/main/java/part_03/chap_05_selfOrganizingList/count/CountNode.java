package part_03.chap_05_selfOrganizingList.count;

public class CountNode {

    int
            counter = 0,
            info;
    CountNode
            next,
            prev;

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

    public CountNode(int info, CountNode next, CountNode prev, int counter) {
        this(info, next, prev);
        this.counter = counter;
    }
}