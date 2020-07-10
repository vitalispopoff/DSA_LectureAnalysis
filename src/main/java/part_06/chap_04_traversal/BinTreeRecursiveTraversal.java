package part_06.chap_04_traversal;

public class BinTreeRecursiveTraversal implements Structured, Traversing {

    Structured
            branchLeft,
            branchRight;
    int
            value;

    @Override
    public BinTreeRecursiveTraversal cloneIt(){
        return new BinTreeRecursiveTraversal();
    }

    public BinTreeRecursiveTraversal() {
    }

    public BinTreeRecursiveTraversal(int value) {
        setValue(value);
    }

    public BinTreeRecursiveTraversal(Structured left, Structured right, int value) {
        setValue(value);
        setBranchLeft(left);
        setBranchRight(right);
    }

    @Override
    public void traverse() {

/*            if (branchLeft != null) this.branchLeft.traversal();
            if (branchRight != null) this.branchRight.traversal();
        System.out.println(getValue());*/
    }

//  getters & setters \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

//    @formatter:off

    public Structured getBranchLeft() { return branchLeft; }
    public Structured getBranchRight() { return branchRight; }
    public int getValue() { return value;}

    @Override public void setBranchLeft(Structured branchLeft) { this.branchLeft = branchLeft; }
    @Override public void setBranchRight(Structured branchRight) { this.branchRight = branchRight; }
    @Override public void setValue(int value) { this.value = value; }

//    @formatter:on
}