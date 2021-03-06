package part_06.chap_04_traversal;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Structured<T extends Structured<T>> {

    void setBranchLeft(T left);
    void setBranchRight(T right);
    void setValue(int value);
    int getValue();

//    ------------------------------------------------------------------------------------------------------------------

    <T extends Structured<T>> T cloneIt();

    static <T extends Structured<T>> void makeGenericTree(T tree, int levels) {

        ArrayList<T>
                treeArray = new ArrayList<T>();

        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){

            T
                temporal = tree.cloneIt();

            treeArray.add(i, temporal);
            treeArray.get(i).setValue(i+1);
        }

        for (int i = 1; i <= 2<<(levels - 1); i++){

            T
                node = treeArray.get(i-1),
                left = treeArray.get((i<<1) - 2),
                right = treeArray.get((i<<1) - 1);

            node.setBranchLeft(left);
            node.setBranchRight(right);
        }
    }


    static <T> T cloneIt(T object){

        String
                objectClassName = object.getClass().toString().substring(6);
        Class<T>
                objectClass;
        Constructor<T>
                objectClassConstructor;
        Object
                clone;

        try{
            objectClass = (Class<T>) Class.forName(objectClassName);
            objectClassConstructor = objectClass.getConstructor();
            clone = objectClassConstructor.newInstance();
        }

        catch (Exception e){
            e.printStackTrace();
            clone = null;
        }

        return (T) clone;
    }

//      ----------------------------------------------------------------------------------------------------------------

    static void main(String[] args) {

        BinTreeRecursiveTraversal
            tree1 = new BinTreeRecursiveTraversal();

        makeGenericTree(tree1, 3);

        BinTreeQueuedTraversal_00.BinTreeTraversalNode
            tree2 = new BinTreeQueuedTraversal_00.BinTreeTraversalNode();

        makeGenericTree(tree2, 8);

        BinTreeQueuedTraversal_00
            traverse = new BinTreeQueuedTraversal_00();

        traverse.addNode(tree2);
        traverse.traverse();
    }
}