package part_01.chap_02.par_01_Encapsulation._03_Arrays;


//    the class name is defined in opposition to the actual Arrays class : java.lang.Arrays; (https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
public class TheArrays {



    static int
            a[];                            // syntax add for the developers migrating from C and C++ ; discouraged
    static int[]
            b,
            c = new int[1],
            d = {1, 2, 5, -7, 3};
    int
//            entry = d[d.length],          // throws IndexOutOfBoundsException, array index starts from 0, the last index is length-1;
            len = d.length;                 // the .length is a variable of the array, that's why no brackets in a call;


    static void forLoopWithArray(){
        for (int i = 0; i < d.length; i++) System.out.print(d[i] + ", ");
    }

    static void forEachLoopWithArray(){
        for(int i : d) System.out.print(i + ", ");
    }

    static void objectArray(){
        System.out.println("\n* * * Object[] * * *\n");
        Object[] e = new Object[1];
        System.out.println(e[0]);
    }

    static void stringArray(){
        System.out.println("\n* * * String[] * * *\n");
        String[] f = new String[1];
        System.out.println(f[0]);
    }

    static void arrayDeclarationConvention(){
        /**
         *  the declaration convention suggests `Object[] o` rather than `Object o[]`
         *  to avoid confussion, but what class is `o` actually?
        */

        /*System.out.println(a.getClass());*/           //  throws NullPointerException - even tho declared `a` doesn't seems to exist in the array context only.
        /*System.out.println(a[].getClass());*/         //  not even a valid syntax


        System.out.println(" * * * primitive types * * * ");

        System.out.println("get class from char[] : "+(new char[0]).getClass()+"\n");
        System.out.println("get class from boolean[] : "+(new boolean[0]).getClass()+"\n");
        System.out.println("get class from byte[] : "+(new byte[0]).getClass()+"\n");
        System.out.println("get class from short[] : "+(new short[0]).getClass()+"\n");
        System.out.println("get class from int[] : "+(new int[0]).getClass()+"\n");            //  returns `class [I`
        System.out.println("get class from long[] : "+(new long[0]).getClass()+"\n");
        System.out.println("get class from float[] : "+(new float[0]).getClass()+"\n");
        System.out.println("get class from double[] : "+(new double[0]).getClass()+"\n");



        System.out.println("\n * * * generic types * * * \n");

        class A{}
        class B<A>{}

        System.out.println("get class from Object[] : "+(new Object[0]).getClass());      //  returns `class [Ljava.lang.Object;`

        System.out.println("get class from A[] : "+(new A[0]).getClass());
        System.out.println("get class from B[] : "+(new B[0]).getClass());
    }



    public static void main(String[] args) {

        arrayDeclarationConvention();





    }
}
