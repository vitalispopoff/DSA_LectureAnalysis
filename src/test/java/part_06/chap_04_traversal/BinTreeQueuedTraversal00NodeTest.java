package part_06.chap_04_traversal;

import org.junit.*;
import part_06.chap_04_traversal.BinTreeQueuedTraversal_00.BinTreeTraversalNode;

public class BinTreeQueuedTraversal00NodeTest {

    @Test
    public void BinTreeTraversalNode_01() {

        BinTreeQueuedTraversal_00
                tree = new BinTreeQueuedTraversal_00();
        BinTreeTraversalNode
                node01 = new BinTreeTraversalNode(tree);

        Assert.assertSame(tree, node01.tree);
        Assert.assertNull(node01.branchLeft);
        Assert.assertNull(node01.branchRight);
        Assert.assertNull(node01.nextInQueue);
    }

    @Test
    public void addAsBranch_01() {

        BinTreeQueuedTraversal_00
                tree = new BinTreeQueuedTraversal_00();
        BinTreeTraversalNode
                node01 = new BinTreeTraversalNode(tree),
                node02 = new BinTreeTraversalNode(tree),
                node03 = new BinTreeTraversalNode(tree);

        node01.addAsBranch(node02);
        Assert.assertSame(node02, node01.branchLeft);

        node01.addAsBranch(node03);
        Assert.assertSame(node03, node01.branchRight);
    }

    @Test
    public void nextInQueue_01() {

        BinTreeQueuedTraversal_00
                tree = new BinTreeQueuedTraversal_00();
        BinTreeTraversalNode
                node01 = new BinTreeTraversalNode(tree),
                node02 = new BinTreeTraversalNode(tree);

        node01.setNextInQueue(node02);
        Assert.assertSame(node02, node01.nextInQueue);
    }

    @Test
    public void removeFromQueue_01() {

        BinTreeQueuedTraversal_00
                tree = new BinTreeQueuedTraversal_00();
        BinTreeTraversalNode
                node01 = new BinTreeTraversalNode(tree),
                node02 = new BinTreeTraversalNode(tree),
                node03 = new BinTreeTraversalNode(tree);

        node01.setNextInQueue(node02);
        node02.setNextInQueue(node03);

        Assert.assertSame(node02, node01.nextInQueue);
        Assert.assertSame(node03, node02.nextInQueue);
        node01.removeFromQueue();

        Assert.assertNull(node01.nextInQueue);
    }
}