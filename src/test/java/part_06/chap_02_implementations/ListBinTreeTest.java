package part_06.chap_02_implementations;

import org.junit.*;

public class ListBinTreeTest {

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

//      PRETEST CALIBRATION     ----------------------------------------------------------------------------------------

        Assert.assertFalse(root == null);
        Assert.assertFalse(_2 == null);
        Assert.assertTrue(root.leftBranch == _2);

//      TEST    --------------------------------------------------------------------------------------------------------

        Assert.assertEquals(_2, root.goToBranch(2));
        Assert.assertEquals(_3, root.goToBranch(3));
        Assert.assertEquals(_11, root.goToBranch(11));
        Assert.assertEquals(_26, root.goToBranch(26));
    }

    @Test
    public void findLowestLeafLocation_01(){

        ListBinTree
                theRoot = null;

        Assert.assertEquals(1, ListBinTree.findLowestLeafLocation(theRoot));
    }

    @Test
    public void findLowestLeafLocation_02() {

        ListBinTree
                theRoot = new ListBinTree(),
                _2 = theRoot.leftBranch = new ListBinTree(),
                _3 = theRoot.rightBranch = new ListBinTree(),
                _4 = _2.leftBranch = new ListBinTree(),
                _5 = _2.rightBranch = new ListBinTree(),
                _6 = _3.leftBranch = new ListBinTree(),
                _7 = _3.rightBranch = new ListBinTree(),
                _8 = _4.leftBranch = new ListBinTree(),
                _9 = _4.rightBranch,
                _10 = _5.leftBranch = new ListBinTree(),
                _11 = _5.rightBranch = new ListBinTree(),

                _15 = _7.rightBranch = new ListBinTree();

//      PRETEST     ----------------------------------------------------------------------------------------------------

            Assert.assertNull(_9);
            Assert.assertFalse(_5 == null);

//      TEST    --------------------------------------------------------------------------------------------------------

        {Assert.assertEquals(9, ListBinTree.findLowestLeafLocation(theRoot));}
    }

    @Test
    public void findLowestLeaf_01() {

        ListBinTree
                theRoot = new ListBinTree(),
                _2 = theRoot.leftBranch = new ListBinTree(),
                _3 = theRoot.rightBranch = new ListBinTree(),
                _4 = _2.leftBranch = new ListBinTree(),
                _5 = _2.rightBranch = new ListBinTree(),
                _6 = _3.leftBranch = new ListBinTree(),
                _7 = _3.rightBranch = new ListBinTree(),
                _8 = _4.leftBranch = new ListBinTree(),
                _9 = _4.rightBranch,
                _10 = _5.leftBranch = new ListBinTree(),
                _11 = _5.rightBranch = new ListBinTree(),

                _15 = _7.rightBranch = new ListBinTree();

        Assert.assertEquals(_4.rightBranch, ListBinTree.findLowestLeaf(theRoot));
        Assert.assertEquals(_9, ListBinTree.findLowestLeaf(theRoot));
    }

    @Test
    public void findLowerLeaf_00() {

        ListBinTree
                root = new ListBinTree();
        ListBinTree
                branch = new ListBinTree(root);

        Assert.assertNull(branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_01() {

        ListBinTree
                branch = new ListBinTree();

        Assert.assertEquals(null, branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_02() {

        ListBinTree
                branch = new ListBinTree(),
                leftLeaf = branch.leftBranch = new ListBinTree(),
                rightLeaf = branch.rightBranch = null;

        Assert.assertEquals(branch.rightBranch, branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_03() {

        ListBinTree branch = new ListBinTree(),
                leftLeaf = branch.leftBranch = null,
                rightLeaf = branch.rightBranch = new ListBinTree();

        Assert.assertEquals(branch.leftBranch, branch.findLowerLeaf());
    }

    @Test
    public void findLowerLeaf_04() {

                ListBinTree branch = new ListBinTree(),
                leftLeaf = branch.leftBranch = new ListBinTree(),
                rightLeaf = branch.rightBranch = new ListBinTree();

        Assert.assertEquals(branch, branch.findLowerLeaf());
    }

    @Test
    public void addToTail_01() {

        ListBinTree
                root = new ListBinTree(),
                _2 = root.leftBranch = new ListBinTree(),
                _3 = root.rightBranch = new ListBinTree(),
                _4 = _2.leftBranch = new ListBinTree(),
                _5 = _2.rightBranch = new ListBinTree(),
                _6 = _3.leftBranch = new ListBinTree(),
                _7 = _3.rightBranch = new ListBinTree(),
                _8 = _4.leftBranch = new ListBinTree(),
                _10 = _5.leftBranch = new ListBinTree(),
                _11 = _5.rightBranch = new ListBinTree(),
                _15 = _7.rightBranch = new ListBinTree();
        String
                name = "name";

        Assert.assertEquals("name", root.addToTail(name).name);
        Assert.assertNull(_4.rightBranch);
    }

    @Test
    public void addLeaf_01() {

        ListBinTree
                branch = new ListBinTree();
        String
                value = "";

        Assert.assertEquals(value, branch.addLeaf(value).name);
    }
}