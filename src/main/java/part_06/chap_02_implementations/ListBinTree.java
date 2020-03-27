package part_06.chap_02_implementations;

public class ListBinTree {

    static ListBinTree
            root = null;
    ListBinTree
            localRoot = null,
            leftBranch = null,
            rightBranch = null,
            prev = null,
            next = null;
    String name = null;

    ListBinTree() {
        this(null);
    }

    ListBinTree(ListBinTree localRoot) {
        if (root == null) root = this;
        else {
        }
    }

    ListBinTree goToBranch(int destination) {
        ListBinTree cache = this;
        String path = Integer.toBinaryString(destination);

        for (int i = 1; i < path.length(); i++) {
            boolean turnRight = path.charAt(i) == '1';
            if (cache != null) cache = turnRight ? cache.rightBranch : cache.leftBranch;
            else i = path.length();
        }
        return cache;
    }

    static int findLowestLeafLocation(ListBinTree localRoot) {
        if (localRoot == null)
            return 1;                                                                       // * has to be static - refering to the null forces throwing NullPointerException
        else {
            ListBinTree cache = localRoot;
            int i = 2;
            for (; cache != null; ) {
                cache = localRoot;
                i++;                                                                        // * moved inside the loop body, to prevent unintentional increment after the loop breaks.
                String path = Integer.toBinaryString(i);
                for (int j = 1; j < path.length(); j++) {
                    cache = path.charAt(j) == '1' ? cache.rightBranch : cache.leftBranch;
                }
            }
            return i;
        }
    }

    static ListBinTree findLowestLeaf(ListBinTree localRoot) {
        ListBinTree cache = localRoot;
        for (int i = 1; cache != null; i++) {
            String path = Integer.toBinaryString(i);
            for (int j = 1; j < path.length(); j++) {
                cache = path.charAt(j) == '1' ? cache.rightBranch : cache.leftBranch;
            }
        }
        return cache;
    }

    ListBinTree findLowerLeaf() {
        // assuming the branch is not null
        boolean left = leftBranch == null;
        boolean right = rightBranch == null;
        // we go left-to-right on the branches
        if (left) return leftBranch;                    // * left is a leaf (forget the right branch then)
        else if (!left & right) return rightBranch;     // * left is branch, and leaf on right
        else return this;                               // * branch is a root
    }

    static ListBinTree addToTail(String name) {
        int location = findLowestLeafLocation(root);
        ListBinTree
                localRoot = root.goToBranch(location >> 1),
                cache = new ListBinTree();
        cache.name = name;

        return cache;
    }

    static ListBinTree addToTail() {
        return addToTail(null);
    }

    ListBinTree addLeaf(String value) {
        ListBinTree cache = this.findLowerLeaf();
        cache = new ListBinTree();
        cache.name = value;
        return cache;
    }

//    !  TODO implement remove()

    public static void main(String[] args) {
    }
}