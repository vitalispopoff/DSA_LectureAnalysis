package main.java.part_01.chap_01.par_01_PrimitiveTypes;

import static java.lang.Long.*;

public class _05_LongTests {

    public static void properties(){
        String primitiveType =  TYPE.getCanonicalName();
        System.out.println(
                primitiveType + " instance representation: " + TYPE + "\n" +
                        primitiveType + " size in bits: " + SIZE + "\n" +
                        primitiveType + " size in bytes: " + BYTES+ "\n" +
                        primitiveType + " min value: " + MIN_VALUE+ "\n" +
                        primitiveType + " max value: " + MAX_VALUE+ "\n"
        );
    }

    public static void main(String[] args) {

        properties();

        long a, b, c, d;

        a = 1;
        b = (long) 1;
        c = new Long(1);
        d = new Long("1");

        System.out.println(MAX_VALUE+b==MIN_VALUE);
    }
}
