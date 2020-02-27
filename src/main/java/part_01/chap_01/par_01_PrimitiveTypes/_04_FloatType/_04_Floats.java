package part_01.chap_01.par_01_PrimitiveTypes._04_FloatType;


import static java.lang.Float.*;

public class _04_Floats {

    static float a;

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

    static void declarationAndInitialization() {

        float a, b, c, d, e, f, g;

        a = 1.F;
        b = (float) 1;
        c = new Float(a);
        d = new Float("1.");
        e = new Float((double) 1);


        System.out.println(a + b + c + d + e);
        System.out.println((MAX_VALUE + a == MIN_VALUE)); // false
    }

    static void zeroes(){

        System.out.print(0.f);
        System.out.print(.0f);
//        System.out.print(.f);   // Error: java: illegal start of expression
    }

    public static void main(String[] args) {

//        properties();
//        declarationAndInitialization();
//        zeroes();

    }
}
