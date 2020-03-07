package part_06.chap_02_implementations;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ListBinTreeTest {

    //    @Ignore
    @Test
    public void goToBranch_01() {
        ListBinTree
                root = new ListBinTree(),
                _2 = root.leftBranch = new ListBinTree(),
                _5 = _2.rightBranch = new ListBinTree(),
                _11 = _5.rightBranch = new ListBinTree(),

                _3 = root.rightBranch = new ListBinTree(),
                _6 = _3.leftBranch = new ListBinTree(),
                _13 = _6.rightBranch = new ListBinTree(),
                _26 = _13.leftBranch = new ListBinTree();

//        * * * PRETEST CALIBRATION * * *
        Assert.assertFalse(root == null);
        Assert.assertFalse(_2 == null);
        Assert.assertTrue(root.leftBranch == _2);

//        * * * TEST * * *
        Assert.assertEquals(_2, root.goToBranch(2));
        Assert.assertEquals(_3, root.goToBranch(3));
        Assert.assertEquals(_11, root.goToBranch(11));
        Assert.assertEquals(_26, root.goToBranch(26));
    }

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


    @Ignore
    @Test
    public void findSmallestPath_01() {
    }

    @Test
    public void addLeaf_01() {
        ListBinTree branch = new ListBinTree();
        String value = "";
        Assert.assertEquals(value, branch.addLeaf(value).name);
    }
}
