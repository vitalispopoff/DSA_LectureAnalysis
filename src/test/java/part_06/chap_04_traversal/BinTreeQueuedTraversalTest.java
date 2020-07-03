package part_06.chap_04_traversal;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BinTreeQueuedTraversalTest {

    @Test
    public void BinTreeTraversalTest_01() {
        BinTreeQueuedTraversal tree = new BinTreeQueuedTraversal();
        Assert.assertEquals(tree.root, tree.head);
        Assert.assertEquals(tree.root, tree.tail);
    }

    @Test
    public void addNode_01() {
        BinTreeQueuedTraversal tree = new BinTreeQueuedTraversal();
        BinTreeQueuedTraversal.BinTreeTraversalNode node = new BinTreeQueuedTraversal.BinTreeTraversalNode(tree);
        Assert.assertSame(tree, node.tree);
        Assert.assertNull(tree.root);
        tree.addNode(node);
        Assert.assertSame(node, tree.root);
    }

    @Ignore
    @Test
    public void traverse_01() {
        BinTreeQueuedTraversal tree = new BinTreeQueuedTraversal();
        BinTreeQueuedTraversal.BinTreeTraversalNode n1 = new BinTreeQueuedTraversal.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal.BinTreeTraversalNode n2 = new BinTreeQueuedTraversal.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal.BinTreeTraversalNode n3 = new BinTreeQueuedTraversal.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal.BinTreeTraversalNode n4 = new BinTreeQueuedTraversal.BinTreeTraversalNode(tree);
        BinTreeQueuedTraversal.BinTreeTraversalNode n5 = new BinTreeQueuedTraversal.BinTreeTraversalNode(tree);
        n1.branchLeft = n2;
        n1.branchRight = n3;
        n2.branchLeft = n4;
        n2.branchRight = n5;
        BinTreeQueuedTraversal.BinTreeTraversalNode result = tree.traverse();

        Assert.assertEquals(1, tree.queueLength);
        Assert.assertSame(n5, result);
    }
}
