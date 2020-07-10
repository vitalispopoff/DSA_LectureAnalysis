package part_06.chap_04_traversal;

public class BinTree implements Structured<BinTree>, Traversing {

    private BinTree
            branchLeft,
            branchRight;
    private int
            value;

    public BinTree(BinTree branchLeft, BinTree branchRight, int value) {
        this.branchLeft = branchLeft;
        this.branchRight = branchRight;
        this.value = value;
    }

//    constructors

    public BinTree() {}

    public BinTree(int value) {
        this.value = value;
    }


//  constructors

    @Override
    public BinTree cloneIt() {
        return new BinTree();
    }

    @Override
    public void traverse() {}

//    getters and setters

    public BinTree getBranchLeft() {
        return branchLeft;
    }

    public BinTree getBranchRight() {
        return branchRight;
    }

    public int getValue() {
        return value;
    }



    public void setBranchLeft(BinTree branchLeft) {
        this.branchLeft = branchLeft;
    }

    public void setBranchRight(BinTree branchRight) {
        this.branchRight = branchRight;
    }

    public void setValue(int value) {
        this.value = value;
    }
}