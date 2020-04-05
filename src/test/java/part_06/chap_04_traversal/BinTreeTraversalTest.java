package part_06.chap_04_traversal;

import org.junit.Assert;
import org.junit.Test;

public class BinTreeTraversalTest {

//    static BinTreeTraversal tree;

    @Test
    public void BinTreeTraversalTest_01(){
        BinTreeTraversal tree = new BinTreeTraversal();
        Assert.assertEquals(tree.root, tree.head);
        Assert.assertEquals(tree.root, tree.tail);
    }

    @Test
    public void addNode_01(){
        BinTreeTraversal tree = new BinTreeTraversal();
        BinTreeTraversal.BinTreeTraversalNode node = new BinTreeTraversal.BinTreeTraversalNode(tree);
        Assert.assertSame(tree, node.tree);
        Assert.assertNull(tree.root);
        tree.addNode(node);
        Assert.assertSame(node, tree.root);



    }
}
