package part_06.chap_04_traversal;

import java.util.ArrayList;

public class BinTreeRecursiveTraversal implements Traversing{

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

    public void traversal() {
            System.out.println(getValue());
            if (branchLeft != null) branchLeft.traversal();
            if (branchRight != null) branchRight.traversal();
    }

//  getters & setters \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

//    @formatter:off

    public BinTreeRecursiveTraversal getBranchLeft() { return branchLeft; }
    public BinTreeRecursiveTraversal getBranchRight() { return branchRight; }
    public int getValue() { return value;}

    public void setBranchLeft(BinTreeRecursiveTraversal branchLeft) { this.branchLeft = branchLeft; }
    public void setBranchRight(BinTreeRecursiveTraversal branchRight) { this.branchRight = branchRight; }

    @Override
    public void setValue(int value) { this.value = value; }

//    @formatter:on

    public static BinTreeRecursiveTraversal makeTree(int levels) {
        ArrayList<BinTreeRecursiveTraversal>
                tree = new ArrayList<>();

        for (int i = 0; i < 2 << levels; i++)
            tree.add(i, new BinTreeRecursiveTraversal(i+1));

        for (int i = 1; i <= 2 << (levels - 1); i++) {
            BinTreeRecursiveTraversal
                    node = tree.get(i - 1 ),
                    left = tree.get((i<<1) - 2 ),
                    right = tree.get((i<<1) - 1);
            node.setBranchLeft(left);
            node.setBranchRight(right);
        }
        return tree.get(0);
    }

    public static void main(String[] args) {

        BinTreeRecursiveTraversal tree = makeTree(6);

        tree.traversal();

    }
}