package part_01.chap_01.par_01_PrimitiveTypes;

import static java.lang.Byte.*;

public class _02_ByteTests {

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

        byte a, b, c, d;

        a = 1;
        b = (byte) 1;
        c = new Byte((byte) 1);
        d = new Byte("1");

        System.out.println(a + b + c + d);

        System.out.println(MAX_VALUE+b == MIN_VALUE);

    }
}
