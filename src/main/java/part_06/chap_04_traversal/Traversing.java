package part_06.chap_04_traversal;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public interface Traversing {

    void setValue(int value);

    static Traversing makeTree(Traversing tree, int levels) {
        ArrayList<Traversing>
                treeArray = new ArrayList<>();
        treeArray.add(tree);
        Class
                treeClass = tree.getClass();


        for (int i = 1; i < 2 << levels; i++)
            treeArray.add(i, tree);


        return tree;
    }


    static Traversing cloneIt(Traversing object){
        String
                objectClassName = object.getClass().toString().substring(6);
        Class
                objectClass,
                fields[] = new Class[0];
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

        cloneIt(new BinTreeQueuedTraversal()).setValue(1);
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


    }
}
