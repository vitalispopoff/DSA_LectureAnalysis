package part_06.chap_02_implementations;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ListBinTreeTest {

    @Test
    public void findLowerLeaf_00() {
        ListBinTree root = new ListBinTree();
        ListBinTree branch = new ListBinTree(root);
        Assert.assertNull(branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_01() {
        ListBinTree branch = new ListBinTree();

        Assert.assertEquals(null, branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_02() {
        ListBinTree branch = new ListBinTree();
        ListBinTree leftLeaf = branch.leftBranch = new ListBinTree();
        ListBinTree rightLeaf = branch.rightBranch = null;
        Assert.assertEquals(branch.rightBranch, branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_03() {
        ListBinTree branch = new ListBinTree();
        ListBinTree leftLeaf = branch.leftBranch = null;
        ListBinTree rightLeaf = branch.rightBranch = new ListBinTree();
        Assert.assertEquals(branch.leftBranch, branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_04() {
        ListBinTree branch = new ListBinTree();
        ListBinTree leftLeaf = branch.leftBranch = new ListBinTree();
        ListBinTree rightLeaf = branch.rightBranch = new ListBinTree();
        Assert.assertEquals(branch, branch.findLowerLeaf());
    }

    @Test
    public void findSmallestPath_01(){

    }

    @Test
    public void addLeaf_01() {
        ListBinTree branch = new ListBinTree();
        String value = "";
        Assert.assertEquals(value, branch.addLeaf(value).value);
    }
}
