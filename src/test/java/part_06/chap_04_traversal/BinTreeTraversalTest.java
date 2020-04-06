package part_06.chap_04_traversal;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BinTreeTraversalTest {

    @Test
    public void BinTreeTraversalTest_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        Assert.assertEquals(tree.root, tree.head);
        Assert.assertEquals(tree.root, tree.tail);
    }

    @Test
    public void addNode_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode node = new BinTreeTraversal.BinTreeTraversalNode(tree);
        Assert.assertSame(tree, node.tree);
        Assert.assertNull(tree.root);
        tree.addNode(node);
        Assert.assertSame(node, tree.root);
    }

    @Ignore
    @Test
    public void traverse_01() {
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode n1 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode n2 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode n3 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode n4 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        BinTreeTraversal.BinTreeTraversalNode n5 = new BinTreeTraversal.BinTreeTraversalNode(tree);
        n1.branchLeft = n2;
        n1.branchRight = n3;
        n2.branchLeft = n4;
        n2.branchRight = n5;
        BinTreeTraversal.BinTreeTraversalNode result = tree.traverse();

        Assert.assertEquals(1, tree.queueLength);
        Assert.assertSame(n5, result);
    }
}
