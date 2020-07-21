//  @formatter:off

package part_06.chap_04_traversal;

public class BinTreeQueuedTraversal_00 /*implements Traversing*/{

    int
            queueLength = 1;
    BinTreeTraversalNode
            root = null,
            head = null,
            tail = null;

    void resetTraversal() {head = tail = root;}

    void addNode(BinTreeTraversalNode node) {
        if (root == null) root = node;
        else root.addAsBranch(node);
    }

    BinTreeTraversalNode traverse() {
        BinTreeTraversalNode
                result = null;

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
        BinTreeTraversalNode
                result = head;

        if (queueLength > 1) {
            head = head.nextInQueue;
            result.removeFromQueue();
            queueLength--;
        }
        return result;
    }

    static class BinTreeTraversalNode implements Structured<BinTreeTraversalNode> {

        BinTreeQueuedTraversal_00
                tree = null;
        BinTreeTraversalNode
                branchLeft = null,
                branchRight = null,
                nextInQueue = null;
        int
                value;

        BinTreeTraversalNode(){ }

        BinTreeTraversalNode(BinTreeQueuedTraversal_00 tree){this.tree = tree;}

        void setTree(BinTreeQueuedTraversal_00 tree) {this.tree = tree;}

        void setNextInQueue(BinTreeTraversalNode node) {this.nextInQueue = node;}

        void removeFromQueue() {nextInQueue = null;}

        void addAsBranch(BinTreeTraversalNode node) {
            if (branchLeft == null) branchLeft = node;
            else if (branchRight == null) branchRight = node;
            else System.out.println("both branches are already there");
        }

        public void setBranchLeft(BinTreeTraversalNode node) {this.branchLeft = node;}
        public BinTreeTraversalNode getBranchLeft(){ return branchLeft;}

        public void setBranchRight(BinTreeTraversalNode node) {this.branchRight = node;}
        public BinTreeTraversalNode getBranchRight(){ return branchRight;}

        public void setValue(int value){this.value = value;}
        public int getValue(){return value;}

        public BinTreeTraversalNode cloneIt(){return new BinTreeTraversalNode();}
    }
}

//    @formatter:on