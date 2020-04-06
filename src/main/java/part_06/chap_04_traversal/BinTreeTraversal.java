package part_06.chap_04_traversal;

//  @formatter:off
public class BinTreeTraversal {

    int queueLength = 1;
    BinTreeTraversalNode
            root = null,        // * root of the tree ; declaring !static we allow to make subtrees to a later merge
            head = root,        // * head of the queue ; FIXME this one should be managed by reflection for cases of tree merging
            tail = root;        // * tail of the queue ; FIXME this one should be managed by reflection for cases of tree merging

    void resetTraversal() {head = tail = root;}

    void addNode(BinTreeTraversalNode node) {
        if (root == null) root = node;
        else root.addAsBranch(node);
    }

    BinTreeTraversalNode traverse() {
        BinTreeTraversalNode result = null;

        while (queueLength > 0) {
            if (head.branchLeft != null) addToQueue(head.branchLeft);
            if (head.branchRight != null) addToQueue(head.branchRight);
            result = removeFromQueue();
        }
        return result;
    }

    void addToQueue(BinTreeTraversalNode node) {
        tail.setNextInQueue(node);
        tail = node;
        queueLength++;
    }

    BinTreeTraversalNode removeFromQueue() {
        BinTreeTraversalNode result = head;

        if (queueLength > 1) {
            head = head.nextInQueue;
            result.removeFromQueue();
            queueLength--;
        }
        return result;
    }

    static class BinTreeTraversalNode {

        BinTreeTraversal
                tree = null;
        BinTreeTraversalNode
                branchLeft = null,
                branchRight = null,
                nextInQueue = null;

        BinTreeTraversalNode(BinTreeTraversal tree){this.tree = tree;}

        void setTree(BinTreeTraversal tree) {this.tree = tree;}

        void setLeftBranch(BinTreeTraversalNode node) {this.branchLeft = node;}
        void setRightBranch(BinTreeTraversalNode node) {this.branchRight = node;}

        void setNextInQueue(BinTreeTraversalNode node) {this.nextInQueue = node;}
        void removeFromQueue() {nextInQueue = null;}

        void addAsBranch(BinTreeTraversalNode node) {
            if (branchLeft == null) branchLeft = node;
            else if (branchRight == null) branchRight = node;
            else System.out.println("both branches are already there");
        }
    }
}
//    @formatter:on