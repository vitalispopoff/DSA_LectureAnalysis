package part_01.chap_01.par_02_Operators;

public class _01_AdditionAndIncrementation {

    static final int e = 1;
    static int
            a = 1,
            b = -1,
            c, d, g;

    public static void main(String[] args) {

        c = a + b;
        System.out.println("c=" + c);

        a = a + b;
        System.out.println("a+b: " + a);

        a = e;
        a += b;
        System.out.println("a+=b: " + a);

        a = e;
        a += a;
        System.out.println("a+=a: " + a);

        a = e;
        a++;
        System.out.println("a++: " + a);

        a = e;
        ++a;
        System.out.println("++a: " + a + "\n");

        a = e;
        d = ++a + b;
        System.out.println("after preincremenation: a=" + a + ", b=" + b + ", d=" + d);

        a = e;
        d = a++ + b;
        System.out.println("after postincremenation: a=" + a + ", b=" + b + ", d=" + d + "\n");

        /*g = e + ++e;*/        // ! java: cannot assign a value to final variable e
        /*++a += a;*/           // ! java: unexpected type

        a = e;
        a += ++a;
        System.out.println("a += ++a: " + a);

        a = e;
        a += a++;
        System.out.println("a += a++: " + a);
    }
}