package part_06.chap_04_traversal;

public class BinTreeTraversal {

    BinTreeTraversalNode
            root = null,        // * root of the tree ; declaring !static we allow to make subtrees to a later merge
            head = root,        // * head of the queue ; FIXME this one should be managed by reflection for cases of tree merging
            tail = root;        // * tail of the queue ; FIXME this one should be managed by reflection for cases of tree merging

    //  @formatter:off
    void resetTraversal() {head = tail = root;}
    //  @formatter:on

    void addNode(BinTreeTraversalNode node) {
        if (root == null) root = node;
        else root.addAsBranch(node);
    }

//    void traverse(BinTreeTraversalNode node){}

    static class BinTreeTraversalNode {

        BinTreeTraversal
                tree = null;
        BinTreeTraversalNode
                branchLeft = null,
                branchRight = null,
                nextInQueue = null;

        //    @formatter:off
        BinTreeTraversalNode(BinTreeTraversal tree){this.tree = tree;}
        void setTree(BinTreeTraversal tree) {this.tree = tree;}
        void setLeftBranch(BinTreeTraversalNode node) {this.branchLeft = node;}
        void setRightBranch(BinTreeTraversalNode node) {this.branchRight = node;}
        void setNextInQueue(BinTreeTraversalNode node) {this.nextInQueue = node;}
        //    @formatter:on

        void addAsBranch(BinTreeTraversalNode node) {
            if (branchLeft == null) branchLeft = node;
            else if (branchRight == null) branchRight = node;
            else System.out.println("both branches are already there");
        }
    }
}