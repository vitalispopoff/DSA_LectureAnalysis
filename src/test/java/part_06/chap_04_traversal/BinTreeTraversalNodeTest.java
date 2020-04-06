package part_06.chap_04_traversal;

import org.junit.Assert;
import org.junit.Test;

public class BinTreeTraversalNodeTest {

    @Test
    public void BinTreeTraverswalNode_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode node01 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        Assert.assertSame(tree, node01.tree);
        Assert.assertNull(node01.branchLeft);
        Assert.assertNull(node01.branchRight);
        Assert.assertNull(node01.nextInQueue);
    }

    @Test
    public void addAsBranch_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode node01 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode node02 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode node03 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        node01.addAsBranch(node02);
        Assert.assertSame(node02, node01.branchLeft);
        node01.addAsBranch(node03);
        Assert.assertSame(node03, node01.branchRight);
    }

    @Test
    public void nextInQueue_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode node01 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode node02 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        node01.setNextInQueue(node02);
        Assert.assertSame(node02, node01.nextInQueue);
    }

    @Test
    public void removeFromQueue_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode node01 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode node02 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode node03 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        node01.setNextInQueue(node02);
        node02.setNextInQueue(node03);
        Assert.assertSame(node02, node01.nextInQueue);
        Assert.assertSame(node03, node02.nextInQueue);
        node01.removeFromQueue();
        Assert.assertNull(node01.nextInQueue);
    }
}