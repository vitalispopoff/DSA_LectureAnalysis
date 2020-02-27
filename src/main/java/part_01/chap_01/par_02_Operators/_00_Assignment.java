package part_01.chap_01.par_02_Operators;

public class _00_Assignment {

    static int a, b, c;
    static double d, e, f;
    static char g, h, i;

    public static void main(String[] args) {

        a = 1;
        a = b = c;

        /*c = d;*/              // ! java: incompatible types: possible lossy conversion from double to int
        /*(double) c = e;*/     // ! java: unexpected type

        c = (int) d;
        e = (double) c;
        g = (char) 48;
        h = '0';
        System.out.println("h: "+h);
        System.out.println("g equals h: "+(g == h));
        h = i;
        System.out.println("h: "+h);
        System.out.println("g equals new h: "+(g == h));



    }
}
