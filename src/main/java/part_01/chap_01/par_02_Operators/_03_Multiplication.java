package part_01.chap_01.par_02_Operators;

public class _03_Multiplication {

    static final int e = 2;
    static int
            a = 2,
            b = -2,
            c, d, g;

    public static void main(String[] args) {

        c = a * b;
        System.out.println("c=" + c);

        a = a * b;
        System.out.println("a+b: " + a);

        a = e;
        a *= b;
        System.out.println("a+=b: " + a);

        a = e;
        a *= a;
        System.out.println("a+=a: " + a);

        /* a**; */                // ! java: illegal start of expression
    }
}