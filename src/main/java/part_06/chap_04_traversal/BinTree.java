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
    }*/     // constructor - unused

/*    public BinTree(int value) {
        this.value = value;
    }*/     // constructor - unused


//  @overrides

    @Override
    public void traverse() {
    }

    @Override
    public BinTree cloneIt() {
        return new BinTree();
    }

    @Override
    public void setBranchLeft(BinTree left) {
        left = branchLeft;
    }

    @Override
    public void setBranchRight(BinTree right) {
        right = branchRight;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public BinTree() {
    }

//    getters and setters

    public Structured getBranchLeft() {
        return branchLeft;
    }*/     // getBranchLeft - unused

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

}