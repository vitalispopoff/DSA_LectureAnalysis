package part_01.chap_01.par_01_PrimitiveTypes._04_IntegerType;

import static java.lang.Integer.*;

public class integerMethods {

    public static void main(String[] args) {

        Integer
                a = Integer.MIN_VALUE,
                b = 0,
                c = Integer.MAX_VALUE;

        System.out.println(a.byteValue());
        System.out.println(b.byteValue());
        System.out.println(c.byteValue());      // * byteValue()

        System.out.println(bitCount(a));
        System.out.println(bitCount(b));
        System.out.println(bitCount(c));        // * bitCount()

                System.out.println(decode("1"));
        System.out.println(decode("-1"));       // * decode()

        System.out.println(highestOneBit(15));
    }
}