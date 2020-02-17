package part_01.chap_01.par_01_PrimitiveTypes._04_IntegerType;


import static java.lang.Integer.*;

public class _04_IntegerTests {

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

        int a, b, c, d, e, f, g;

        a = 1;
        b = (int) 1;
        c = 0x0001;
        d = 0001;
        e = new Integer(1);
        f = new Integer("1");
        g = a + b + c;

        System.out.println(a + "+" + b + "+" + c + "=" + g);

        System.out.println((MAX_VALUE + a == MIN_VALUE)); // true


    }
}
