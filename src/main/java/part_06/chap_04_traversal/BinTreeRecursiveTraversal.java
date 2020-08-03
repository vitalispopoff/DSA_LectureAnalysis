//    @formatter:off

package part_06.chap_04_traversal;

public class BinTreeRecursiveTraversal implements Structured<BinTreeRecursiveTraversal>, Traversing {

    private BinTreeRecursiveTraversal
            branchLeft,
            branchRight;
    int
            value;

//  --------------------------------------------------------------------------------------------------------------------

    public BinTreeRecursiveTraversal() { }

//  --------------------------------------------------------------------------------------------------------------------


    @Override
    public BinTreeRecursiveTraversal cloneIt(){
        return new BinTreeRecursiveTraversal();
    }

    @Override
    public void traverse() { }  // TODO


    @Override
    public void setBranchLeft(BinTreeRecursiveTraversal branchLeft) { this.branchLeft = branchLeft; }
    public BinTreeRecursiveTraversal getBranchLeft() { return branchLeft; }


    @Override
    public void setBranchRight(BinTreeRecursiveTraversal branchRight) { this.branchRight = branchRight; }
    public BinTreeRecursiveTraversal getBranchRight() { return branchRight; }


    @Override
    public void setValue(int value) { this.value = value; }
    public int getValue() { return value;}

}

//    @formatter:on