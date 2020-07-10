package part_06.chap_04_traversal;

public class BinTree implements Structured {

    private Structured
        branchLeft,
        branchRight;
    private int
        value;

    public BinTree(Structured branchLeft, Structured branchRight, int value) {
        this.branchLeft = branchLeft;
        this.branchRight = branchRight;
        this.value = value;
    }

//    constructors

    public BinTree(int value) {
        this.value = value;
    }

    public BinTree() {
    }

    @Override
    public Structured cloneIt(){
        return new BinTree();
    }

//    getters and setters

    public Structured getBranchLeft() {
        return branchLeft;
    }

    public void setBranchLeft(Structured branchLeft) {
        this.branchLeft = branchLeft;
    }

    public Structured getBranchRight() {
        return branchRight;
    }

    public void setBranchRight(Structured branchRight) {
        this.branchRight = branchRight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

//    @Override
    public void traversal() { }
}