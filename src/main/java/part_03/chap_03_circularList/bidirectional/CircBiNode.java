package part_03.chap_03_circularList.bidirectional;

public class CircBiNode {

    public int
        info;
    public CircBiNode
        next,
        prev;

    public CircBiNode(int info) {

        this(info, null, null);
    }

    public CircBiNode(int info, CircBiNode next, CircBiNode prev) {

        this.info = info;
        this.next = next;
        this.prev = prev;
    }
}