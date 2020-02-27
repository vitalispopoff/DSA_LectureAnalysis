package part_01.chap_01.par_01_PrimitiveTypes._03_ShortType;

import static java.lang.Short.*;

public class _03_Shorts {

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

        short a, b, c, d, e;

        a = 1;
        b = (short) 1;
        c = new Short((short) 1);
        d = new Short("1");

        System.out.println(MAX_VALUE + b == MIN_VALUE);

    }
}