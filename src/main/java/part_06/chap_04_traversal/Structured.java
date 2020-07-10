package part_06.chap_04_traversal;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Structured<T extends Structured<T>> {

    void setBranchLeft(T left);
    void setBranchRight(T right);
    void setValue(int value);
    int getValue();

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

    default <T extends Structured<T>> T cloneIt(){
        return cloneIt((T)this);
    }

/*    static <T extends Structured<T>> void makeReflectionTree(T tree, int levels) {
        ArrayList<T>
                treeArray = new ArrayList<>();
        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){
            treeArray.add(i, cloneIt(tree));
            treeArray.get(i).setValue(i+1);
        }
        for (int i = 1; i <= 2<<(levels - 1); i++){
            T
                    node = (T) treeArray.get(i-1),
                    left = (T) treeArray.get((i<<1) - 2),
                    right = (T) treeArray.get((i<<1) - 1);
            node.setBranchLeft(left);
            node.setBranchRight(right);
        }
    }*/     // makeTree disposable implementation

    static <T> T cloneIt(T object){
        String
                objectClassName = object.getClass().toString().substring(6);
        Class<T>
//                fields[] = {},
                objectClass;
        Constructor<T>
                objectClassConstructor;
        Object
                clone;

        try{
            objectClass = (Class<T>) Class.forName(objectClassName);
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
        makeGenericTree(tree, 3);

        System.out.println(tree.getBranchRight().getBranchLeft().getValue());

    }
}