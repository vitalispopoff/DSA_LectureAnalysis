package part_06.chap_04_traversal;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Structured<T extends Structured> {

    void setBranchLeft(T left);
    void setBranchRight(T right);
    void setValue(int value);
    int getValue();

    static <T extends Structured> void makeGenericTree(T tree, int levels) {
        ArrayList<T>
                treeArray = new ArrayList<>();
        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){
            treeArray.add(i, (T) tree.cloneIt());
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

    <T> T cloneIt();

    static <T extends Structured> void makeReflectionTree(T tree, int levels) {
        ArrayList<T>
                treeArray = new ArrayList<>();
        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){
            treeArray.add(i, cloneIt(tree));
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

    static <T extends Structured> T cloneIt(T object){
        String
                objectClassName = object.getClass().toString().substring(6);
        Class
//                fields[] = {},
                objectClass;
        Constructor
                objectClassConstructor;
        Object
                clone;

        try{
            objectClass = Class.forName(objectClassName);
            objectClassConstructor = objectClass.getConstructor(/*fields*/);
            clone = objectClassConstructor.newInstance(/*fields*/);
        }
        catch (Exception e){
            e.printStackTrace();
            clone = null;
        }

        return (T) clone;
    }

    static void main(String[] args) {

        BinTreeRecursiveTraversal tree = new BinTreeRecursiveTraversal();
//        makeGenericTree(tree, 3);
        makeReflectionTree(tree, 3);

        System.out.println(tree.getBranchRight().getBranchLeft().getValue());

    }
}
