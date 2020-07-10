//    @formatter:off

package part_06.chap_04_traversal;

public class BinTreeRecursiveTraversal implements Structured<BinTreeRecursiveTraversal>, Traversing {

    private BinTreeRecursiveTraversal
            branchLeft,
            branchRight;
    int
            value;

//  constructors

    public BinTreeRecursiveTraversal() { }

/*    public BinTreeRecursiveTraversal(int value) {
        setValue(value);
    }*/     //  overloaded constructor - currently unused

/*    public BinTreeRecursiveTraversal(BinTreeRecursiveTraversal left, BinTreeRecursiveTraversal right, int value) {
        setValue(value);
        setBranchLeft(left);
        setBranchRight(right);
    }*/     //  overloaded constructor - currently unused

//  overrides

    @Override
    public BinTreeRecursiveTraversal cloneIt(){
        return new BinTreeRecursiveTraversal();
    }

    @Override
    public void traverse() {

/*            if (branchLeft != null) this.branchLeft.traversal();
            if (branchRight != null) this.branchRight.traversal();
        System.out.println(getValue());*/
    }

//  getters & setters



    public BinTreeRecursiveTraversal getBranchLeft() { return branchLeft; }
    public BinTreeRecursiveTraversal getBranchRight() { return branchRight; }
    public int getValue() { return value;}

    @Override public void setBranchLeft(BinTreeRecursiveTraversal branchLeft) { this.branchLeft = branchLeft; }
    @Override public void setBranchRight(BinTreeRecursiveTraversal branchRight) { this.branchRight = branchRight; }
    @Override public void setValue(int value) { this.value = value; }

//    @formatter:on
}