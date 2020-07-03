package part_06.chap_04_traversal;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BinTreeQueuedTraversal00Test {

    @Test
    public void BinTreeTraversalTest_01() {
        BinTreeQueuedTraversal_00 tree = new BinTreeQueuedTraversal_00();
        Assert.assertEquals(tree.root, tree.head);
        Assert.assertEquals(tree.root, tree.tail);
    }

    @Test
    public void addNode_01() {
        BinTreeQueuedTraversal_00 tree = new BinTreeQueuedTraversal_00();
        BinTreeQueuedTraversal_00.BinTreeTraversalNode node = new BinTreeQueuedTraversal_00.BinTreeTraversalNode(tree);
        Assert.assertSame(tree, node.tree);
        Assert.assertNull(tree.root);
        tree.addNode(node);
        Assert.assertSame(node, tree.root);
    }

    @Ignore
    @Test
    public void traverse_01() {
        BinTreeQueuedTraversal_00 tree = new BinTreeQueuedTraversal_00();
        BinTreeQueuedTraversal_00.BinTreeTraversalNode n1 = new BinTreeQueuedTraversal_00.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal_00.BinTreeTraversalNode n2 = new BinTreeQueuedTraversal_00.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal_00.BinTreeTraversalNode n3 = new BinTreeQueuedTraversal_00.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal_00.BinTreeTraversalNode n4 = new BinTreeQueuedTraversal_00.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal_00.BinTreeTraversalNode n5 = new BinTreeQueuedTraversal_00.BinTreeTraversalNode(tree);
        n1.branchLeft = n2;
        n1.branchRight = n3;
        n2.branchLeft = n4;
        n2.branchRight = n5;
        BinTreeQueuedTraversal_00.BinTreeTraversalNode result = tree.traverse();

        Assert.assertEquals(1, tree.queueLength);
        Assert.assertSame(n5, result);
    }
}
