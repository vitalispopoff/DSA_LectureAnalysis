package part_06.chap_02_implementations;

public class ListBinTree {

    static ListBinTree
            root = null/*,
            lastLeaf = null*/;      // lastLeaf is pretty useless: being null cannot lead to its root...

    ListBinTree
            localRoot = null,
            leftBranch = null,
            rightBranch = null,
            prev = null,
            next = null;
    String value = null;

    ListBinTree() {
        this(null);
    }

    ListBinTree(ListBinTree localRoot) {
        if (root == null) root = /*lastLeaf =*/ this;
        else {
        }
    }


    ListBinTree findLowerLeaf() {
                                                        // assuming the branch is not null
        boolean left = leftBranch == null;
        boolean right = rightBranch == null;
                                                        // we go left-to-right on the branches
        if (left) return leftBranch;                    // left is a leaf (forget the right branch then)
        else if (!left & right) return rightBranch;     //  left is branch, and leaf on right
        else return this;                               //  branch is a root
    }

    ListBinTree findSmallestPath() {
        ListBinTree cache = findLowerLeaf();

        return null;
    }

    ListBinTree addLeaf(String value) {
        ListBinTree cache = this.findLowerLeaf();
        cache = new ListBinTree();
        cache.value = value;
        return cache;
    }


//      TODO implement addToTail()
//      TODO implement remove()
//      TODO implement findShortestBranch()

    public static void main(String[] args) {

        ListBinTree theRoot = new ListBinTree();
        ListBinTree theBranch = new ListBinTree(theRoot);
        System.out.println(theBranch.findLowerLeaf());
    }
}