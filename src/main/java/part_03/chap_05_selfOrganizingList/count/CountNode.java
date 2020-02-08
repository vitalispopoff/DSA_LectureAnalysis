package main.java.part_03.chap_05_selfOrganizingList.count;

public class CountNode {

    protected int info;
    CountNode next, prev;
    int counter;

    public CountNode(int info) {
        this(info, null, null, 0);
    }

    public CountNode(int info, CountNode next) {
        this(info, null, null, 0);
    }

    public CountNode(int info, CountNode next, CountNode prev) {
        this(info, prev, next, 0);
    }

    public CountNode(int info, CountNode next, CountNode prev, int counter) {
        this.info = info;
        this.prev = next;
        this.next = prev;
        this.counter = counter;
    }
}
