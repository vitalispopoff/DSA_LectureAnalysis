package part_01.chap_02.par_01_Encapsulation._03_Arrays;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;

import java.util.OptionalDouble;

public class EmptyEntryArrays {

    public static void main(String[] args) {

        System.out.println("primitve types: \n");

        boolean[] a = new boolean[1];
        System.out.println("boolean: "+a[0]);

        byte[] b = new byte[1];
        System.out.println("byte: "+b[0]);

        char[] c = new char[1];
        System.out.println("charactrer: "+c[0]);

        short[] d = new short[1];
        System.out.println("short: "+d[0]);

        int[] e = new int[1];
        System.out.println("integer: "+e[0]);

        float[] f = new float[1];
        System.out.println("float: "+f[0]);

        long[] g = new long[1];
        System.out.println("long: "+g[0]);

        double[] h = new double[1];
        System.out.println("double: "+h[0]);

        System.out.println("\n class wrappers \n");

        Boolean[] a1 = new Boolean[1];
        System.out.println("Boolean: "+a1[0]);

        Byte[] b1 = new Byte[1];
        System.out.println("byte: "+b1[0]);

        Character[] c1 = new Character[1];
        System.out.println("charactrer: "+c1[0]);

        Short[] d1 = new Short[1];
        System.out.println("short: "+d1[0]);

        Integer[] e1 = new Integer[1];
        System.out.println("integer: "+e1[0]);

        Float[] f1 = new Float[1];
        System.out.println("float: "+f1[0]);

        Long[] g1 = new Long[1];
        System.out.println("long: "+g1[0]);

        Double[] h1 = new Double[1];
        System.out.println("double: "+h1[0]);

        System.out.println("\n reference types \n");

        String[] i = new String[1];
        System.out.println("string: "+i[0]);

        Exception[] j = new Exception[1];
        System.out.println("exception: "+j[0]);

        Object[] k = new Object[1];
        System.out.println("object: "+k[0]);







    }
}
