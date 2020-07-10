package part_06.chap_04_traversal;

public class BinTreeRecursiveTraversal/*<T extends Structured>*/  implements Structured<BinTreeRecursiveTraversal>, Traversing {

    BinTreeRecursiveTraversal
            branchLeft,
            branchRight;
    int
            value;


    public BinTreeRecursiveTraversal() {
    }

    public BinTreeRecursiveTraversal(int value) {
        setValue(value);
    }

    public BinTreeRecursiveTraversal(BinTreeRecursiveTraversal left, BinTreeRecursiveTraversal right, int value) {
        setValue(value);
        setBranchLeft(left);
        setBranchRight(right);
    }

//    @Override
    /*public <T> T cloneIt(){
        return (T) new BinTreeRecursiveTraversal();
    }*/

    public BinTreeRecursiveTraversal cloneIt(){
        return new BinTreeRecursiveTraversal();
    }

    @Override
    public void traverse() {

/*            if (branchLeft != null) this.branchLeft.traversal();
            if (branchRight != null) this.branchRight.traversal();
        System.out.println(getValue());*/
    }

//  getters & setters \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

//    @formatter:off

    public BinTreeRecursiveTraversal getBranchLeft() { return branchLeft; }
    public BinTreeRecursiveTraversal getBranchRight() { return branchRight; }
    public int getValue() { return value;}

    @Override public void setBranchLeft(BinTreeRecursiveTraversal branchLeft) { this.branchLeft = branchLeft; }
    @Override public void setBranchRight(BinTreeRecursiveTraversal branchRight) { this.branchRight = branchRight; }
    @Override public void setValue(int value) { this.value = value; }

//    @formatter:on
}