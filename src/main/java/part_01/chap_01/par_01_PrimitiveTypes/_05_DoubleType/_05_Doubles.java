package part_01.chap_01.par_01_PrimitiveTypes._05_DoubleType;

import static java.lang.Double.*;

public class _05_Doubles {



    public static void nope(){
        System.out.println(0.d/0.d+"\n");
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

        double a, b, c, d;

        a = 1;
        b = (double) 1;
        c = new Double(1);
        d = new Double("1");

        System.out.println(a == b);
        System.out.println(c == d);

        System.out.println(MAX_VALUE + b == MIN_VALUE);


    }
}
