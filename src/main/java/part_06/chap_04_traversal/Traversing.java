package part_06.chap_04_traversal;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Traversing {

    void setBranchLeft(Traversing left);
    void setBranchRight(Traversing right);
    void setValue(int value);
    void traversal();

    static Traversing makeTree(Traversing tree, int levels) {
        ArrayList<Traversing>
                treeArray = new ArrayList<>();
        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){
            treeArray.add(i, cloneIt(tree));
            treeArray.get(i).setValue(i+1);
        }
        for (int i = 1; i <= 2<<(levels - 1); i++){
            Traversing
                    node = treeArray.get(i-1),
                    left = treeArray.get((i<<1) - 2),
                    right = treeArray.get((i<<1) - 1);
            node.setBranchLeft(left);
            node.setBranchRight(right);
        }
        return tree;
    }


    static Traversing cloneIt(Traversing object){
        String
                objectClassName = object.getClass().toString().substring(6);
        Class
                objectClass,
                fields[] = {/*Integer.TYPE*/};
        Constructor
                objectClassConstructor;
        Object
                clone;

        try{
            objectClass = Class.forName(objectClassName);
            objectClassConstructor = objectClass.getConstructor(fields);
            clone = objectClassConstructor.newInstance(fields);
        } catch (Exception e){
            e.printStackTrace();
            clone = null;
        }

        return (Traversing) clone;
    }

    public static void main(String[] args) {

//        cloneIt(new BinTreeQueuedTraversal()).setValue(1);
//        BinTreeRecursiveTraversal tree = (BinTreeRecursiveTraversal) cloneIt(new BinTreeQueuedTraversal());
/*

        {
            Traversing temp = new BinTreeRecursiveTraversal();

            String tempClass = temp.getClass().toString().substring(6);

            try {
                Class c = Class.forName(tempClass);
                Constructor constructor = c.getConstructor();

                Object o = c.newInstance();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
*/  //

        Traversing tree = new BinTreeRecursiveTraversal();
        makeTree(tree, 3);

        ((BinTreeRecursiveTraversal)tree).traversal();

    }
}
