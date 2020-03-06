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
        if (root == null) root = lastLeaf = this;}

//      TODO implement addToTail()
//      TODO implement remove()
}