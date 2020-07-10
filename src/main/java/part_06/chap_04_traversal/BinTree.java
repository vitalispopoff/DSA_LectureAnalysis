package part_06.chap_04_traversal;

public class BinTree implements Structured<BinTree>, Traversing {

    private BinTree
            branchLeft,
            branchRight;
    private int
            value;

//    constructors

    public BinTree() {}

/*    public BinTree(BinTree branchLeft, BinTree branchRight, int value) {
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

/*    public BinTree getBranchLeft() {
        return branchLeft;
    }*/     // getBranchLeft - unused

/*    public BinTree getBranchRight() {
        return branchRight;
    }*/     // getBranchRight - unused

    public int getValue() {
        return value;
    }

}