package part_03.chap_03_circularList;

public class CircularNode {

    public int info;
    public CircularNode next;

    public CircularNode(int info){this(info, null);}

    public CircularNode(int info, CircularNode next) {
        this.info = info;
        this.next = next;
    }
}
