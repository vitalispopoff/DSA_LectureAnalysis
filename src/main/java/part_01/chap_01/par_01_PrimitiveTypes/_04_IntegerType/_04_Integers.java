package part_01.chap_01.par_01_PrimitiveTypes._04_IntegerType;

import static java.lang.Integer.*;

public class _04_Integers {

    public static void properties() {
        String primitiveType = TYPE.getCanonicalName();
        System.out.println(
                primitiveType + " instance representation: " + TYPE + "\n" +
                        primitiveType + " size in bits: " + SIZE + "\n" +
                        primitiveType + " size in bytes: " + BYTES + "\n" +
                        primitiveType + " min value: " + MIN_VALUE + "\n" +
                        primitiveType + " max value: " + MAX_VALUE + "\n"
        );
    }

    public static void main(String[] args) {

        properties();

        int
                a = 1,                      //  * standard initialization
                b = (int) 1,                //  * initialization with casting to int type
                c = 0x0001,                 //  * initialization in hexadecimal system
                d = 0001,                   //  * initialization in octal system (?)
                e = new Integer(1),   //  * initialization with Integer wrapper constructor
                f = new Integer("1"),    //  * initialization with Integer wrapper overloaded constructor - init parameter is a string.
                g = a + b + c;

        System.out.println(a + "+" + b + "+" + c + "=" + g);
        System.out.println((MAX_VALUE + a == MIN_VALUE)); // true
    }
}