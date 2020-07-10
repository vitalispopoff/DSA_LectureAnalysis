package part_06.chap_04_traversal;

//import java.lang.Class;
//import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Structured {

    void setBranchLeft(Structured left);
    void setBranchRight(Structured right);
    void setValue(int value);
    int getValue();

    static <T extends Structured> T makeGenericTree(T tree, int levels) {
        ArrayList<T>
                treeArray = new ArrayList<>();
        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){
            treeArray.add(i, tree.cloneIt());
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
        return tree;
    }

    <T> T cloneIt();

    static void main(String[] args) {

        BinTreeRecursiveTraversal tree = new BinTreeRecursiveTraversal();
        makeGenericTree(tree, 3);

        System.out.println(tree.getBranchRight().getValue());

    }

/*
    static Structured makeReflectionTree(Structured tree, int levels) {
        ArrayList<Structured>
                treeArray = new ArrayList<>();
        treeArray.add(tree);

        for (int i = 1; i < 2 << levels; i++){
            treeArray.add(i, cloneIt(tree));
            treeArray.get(i).setValue(i+1);
        }
        for (int i = 1; i <= 2<<(levels - 1); i++){
            Structured
                    node = treeArray.get(i-1),
                    left = treeArray.get((i<<1) - 2),
                    right = treeArray.get((i<<1) - 1);
            node.setBranchLeft(left);
            node.setBranchRight(right);
        }
        return tree;
    }

    static Structured cloneIt(Structured object){
        String
                objectClassName = object.getClass().toString().substring(6);
        Class
                objectClass,
                fields[] = {};
        Constructor
                objectClassConstructor;
        Object
                clone;

        try{
            objectClass = Class.forName(objectClassName);
            objectClassConstructor = objectClass.getConstructor(fields);
            clone = objectClassConstructor.newInstance(fields);
        }
        catch (Exception e){
            e.printStackTrace();
            clone = null;
        }

        return (Structured) clone;
    }
    */      //makeReflectionTree - disposable?
}
