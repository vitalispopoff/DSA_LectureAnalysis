package part_06.chap_02_implementations;

import java.util.List;
import java.util.Stack;

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
    String name = null;
    int value;

    ListBinTree() {
        this(null);
    }

    ListBinTree(ListBinTree localRoot) {
        if (root == null) root = /*lastLeaf =*/ this;
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

    int findLowestLeafLocation() {
        ListBinTree cache = this;
        if (this == null) return 1;
        else {
            int i = 2;
            for (; cache != null;) {
                 cache = this;
                i++;                                        //moved inside the loop body, to prevent unintentional increment after the loop breaks.
                String path = Integer.toBinaryString(i);
                for (int j = 1; j < path.length(); j++) {
                    cache = path.charAt(j) == '1' ? cache.rightBranch : cache.leftBranch;
                }
            }
            return i;
        }
    }

    ListBinTree findLowestLeaf() {
        ListBinTree cache = this;
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
        if (left) return leftBranch;                    // left is a leaf (forget the right branch then)
        else if (!left & right) return rightBranch;     //  left is branch, and leaf on right
        else return this;                               //  branch is a root
    }

    static ListBinTree addToTail(String name/*, int value*/) {
        int location = root.findLowestLeafLocation();
        ListBinTree
                localRoot = root.goToBranch(location >> 1),
                cache = location % 2 == 0 ? localRoot.leftBranch : localRoot.rightBranch;
        cache = new ListBinTree();
        cache.name = name;
//        cache.value = value;

        return cache;
    }

    static ListBinTree addToTail(){
        return addToTail(null);
    }

    ListBinTree addLeaf(String value) {
        ListBinTree cache = this.findLowerLeaf();
        cache = new ListBinTree();
        cache.name = value;
        return cache;
    }



//      TODO implement remove()

    public static void main(String[] args) {

        /*{
        int
                a = 2,
                b = 3,
                c = 11,
                d = 26;

        System.out.println(a + ": " + Integer.toBinaryString(a));
        System.out.println(b + ": " + Integer.toBinaryString(b));
        System.out.println(c + ": " + Integer.toBinaryString(c));
        System.out.println(d + ": " + Integer.toBinaryString(d));
}*/

        /*{
            ListBinTree
                    root = new ListBinTree(),
                    _2 = root.leftBranch = new ListBinTree(),
                    _3 = root.rightBranch = new ListBinTree(),
                    _4 = _2.leftBranch = new ListBinTree();

            root.value = 1;
            _2.value = 2;
            _3.value = 3;
            _4.value = 4;
            System.out.println(root.goToBranch(2).value);
        }*/

        /*{
    ListBinTree
            theRoot = new ListBinTree(),
            _2 = theRoot.leftBranch = new ListBinTree(),
            _3 = theRoot.rightBranch = new ListBinTree(),
            _4 = _2.leftBranch = new ListBinTree(),
            _5 = _2.rightBranch = new ListBinTree(),
            _6 = _3.leftBranch = new ListBinTree(),
            _7 = _3.rightBranch = new ListBinTree(),
            _8 = _4.leftBranch = new ListBinTree(),

            _10 = _5.leftBranch = new ListBinTree(),
            _11 = _5.rightBranch = new ListBinTree(),

            _15 = _7.rightBranch = new ListBinTree();

    System.out.println(theRoot.findLowestLeafLocation());
}*/

    }
}