package part_06.chap_04_traversal;

public class BinTree_01 {

    BinTree_01
            branchLeft,
            branchRight,
            localRoot;
    int
            value;

    public BinTree_01() {
    }

    public BinTree_01(int value) {
        setValue(value);
    }

    public BinTree_01(BinTree_01 left, BinTree_01 right, int value) {
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

    public BinTree_01 getBranchLeft() { return branchLeft; }
    public BinTree_01 getBranchRight() { return branchRight; }
    public BinTree_01 getLocalRoot() {return localRoot; }
    public int getValue() { return value;}

    public void setBranchLeft(BinTree_01 branchLeft) { this.branchLeft = branchLeft; }
    public void setBranchRight(BinTree_01 branchRight) { this.branchRight = branchRight; }
    public void setLocalRoot(BinTree_01 localRoot) { this.localRoot = localRoot; }
    public void setValue(int value) { this.value = value; }

//    @formatter:on

    public static BinTree_01[] makeTree(int levels) {
        BinTree_01[]
                tree = new BinTree_01[2 << (levels - 1)];

/*
        for (int i = 0; i < 2 << (levels - 1); i++) {
            tree[i] = new BinTree_01(i+1);
        }
*/
        int i = 1;
        for(BinTree_01 node : tree)
            node = new BinTree_01(i++);


        return tree;
    }

    public static void main(String[] args) {

        BinTree_01[] tree = makeTree(5);

//        System.out.println(tree[0]);

        for(BinTree_01 node : tree) System.out.println(node.getValue());


    }


}
