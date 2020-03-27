package part_03.chap_03_circularList.unidirectional;

public class CircUniNode {

    public int info;
    public CircUniNode next;

    public CircUniNode(int info){this(info, null);}

    public CircUniNode(int info, CircUniNode next) {
        this.info = info;
        this.next = next;
    }
}