package part_06.chap_04_traversal;

public class BinTree implements Structured<BinTree> {

    private BinTree
        branchLeft,
        branchRight;
    private int
        value;



    public BinTree() {
    }

    public BinTree(BinTree branchLeft, BinTree branchRight, int value) {
        this.branchLeft = branchLeft;
        this.branchRight = branchRight;
        this.value = value;
    }



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

    public BinTree getBranchLeft() {
        return branchLeft;
    }

    @Override
    public void setBranchRight(BinTree right) {
        right = branchRight;
    }

    public BinTree getBranchRight() {
        return branchRight;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}