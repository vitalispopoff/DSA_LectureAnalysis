package part_01.chap_01.par_01_PrimitiveTypes._05_DoubleType;

import static java.lang.Double.*;

public class _05_Doubles {

    public static void nope() {
        System.out.println(0.d / 0.d + "\n");
    }

    public static void properties() {
        String primitiveType = TYPE.getCanonicalName();
        System.out.println(
                primitiveType + " instance representation: " + TYPE + "\n" +
                        primitiveType + " size in bits: " + SIZE + "\n" +
                        primitiveType + " size in bytes: " + BYTES + "\n" +
                        primitiveType + " min value: " + MIN_VALUE + "\n" +
                        primitiveType + " max value: " + MAX_VALUE
        );
        additionalProperties();
    }

    public static void additionalProperties() {
        String tab = "    > ";
        String line = "\n";
        System.out.println(
                tab + " min exponent: " + MIN_EXPONENT + line +
                        tab + " max exponent: " + MAX_EXPONENT + line
        );
    }

    public static void main(String[] args) {

        nope();
        properties();

        double
                a = 1.,                      // * standard initialiization with a floating-point number parameter
                b = 1,                       // * standard initialization with an integer number parameter - will be casted to the floating-point number by default
                c = (double) 1,              // * initialization with forced casting integer to the floating-point
                d = new Double(1),     // * initialization with a wrapper class constructor
                e = new Double("1"),      // * initialization with a wrapper class constructor using a string init parameter
                f = 'c';                     // * initialization with a char init parameter - will be casted to the floating-point number by default

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(MAX_VALUE + b == MIN_VALUE);
    }
}