package part_06.chap_04_traversal;

public class BinTreeRecursiveTraversal {

    BinTreeRecursiveTraversal
            branchLeft,
            branchRight,
            localRoot;
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

    public void traversal() {
        if (this == null) ;


        System.out.println(getValue());
        if (branchLeft != null) branchLeft.traversal();
        if (branchRight != null) branchRight.traversal();
    }

//  getters & setters \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

//    @formatter:off

    public BinTreeRecursiveTraversal getBranchLeft() { return branchLeft; }
    public BinTreeRecursiveTraversal getBranchRight() { return branchRight; }
    public BinTreeRecursiveTraversal getLocalRoot() {return localRoot; }
    public int getValue() { return value;}

    public void setBranchLeft(BinTreeRecursiveTraversal branchLeft) { this.branchLeft = branchLeft; }
    public void setBranchRight(BinTreeRecursiveTraversal branchRight) { this.branchRight = branchRight; }
    public void setLocalRoot(BinTreeRecursiveTraversal localRoot) { this.localRoot = localRoot; }
    public void setValue(int value) { this.value = value; }

//    @formatter:on

    public static BinTreeRecursiveTraversal[] makeTree(int levels) {
        BinTreeRecursiveTraversal[]
                tree = new BinTreeRecursiveTraversal[2 << (levels - 1)];

/*
        for (int i = 0; i < 2 << (levels - 1); i++) {
            tree[i] = new BinTree_01(i+1);
        }
*/
        int i = 1;
        for(BinTreeRecursiveTraversal node : tree)
            node = new BinTreeRecursiveTraversal(i++);


        return tree;
    }

    public static void main(String[] args) {

        BinTreeRecursiveTraversal[] tree = makeTree(5);

//        System.out.println(tree[0]);

        for(BinTreeRecursiveTraversal node : tree) System.out.println(node.getValue());


    }


}
