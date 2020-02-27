package part_01.chap_01.par_02_Operators;

public class _04_Division {

    static int a = 2;
    static int b = -2;
    static final int e = 2;
    static final int f = 0;
    static int c, d, g;

    public static void main(String[] args) {

        c = a / b;
        System.out.println("c=" + c);

        a = a / b;
        System.out.println("a/b: " + a);

        a = e;
        a /= b;
        System.out.println("a/=b: " + a);

        a = e;
        /* a /= f; */           // ! Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
