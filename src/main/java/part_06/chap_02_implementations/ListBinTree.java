package part_06.chap_02_implementations;

public class ListBinTree {

    static ListBinTree
            root = null,
            lastLeaf = null;

    ListBinTree
            leftBranch = null,
            rightBranch = null,
            prev = null,
            next = null;
    String value = null;

    ListBinTree() {
        if (root == null) root = lastLeaf = this;
    }

    ListBinTree findLowerLeaf(/*ListBinTree branch*/){

        boolean left = leftBranch==null;
        boolean right = rightBranch==null;
        if(left & right) return this;                 //  branch is a leaf
        else if (!left & right) return rightBranch;      //  branch on left, and leaf on right
        else if (left & !right) return leftBranch;     //  branch on right and leaf on left
        else return null;                               //  branch is a root.
    }

    /*ListBinTree addLeaf(ListBinTree root, String value) {
        ListBinTree leaf = new ListBinTree();
        leaf.value = value;

        return leaf;
    }*/


//      TODO implement addToTail()
//      TODO implement remove()
//      TODO implement findShortestBranch()
}