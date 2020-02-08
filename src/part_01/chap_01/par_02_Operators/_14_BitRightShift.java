package part_01.chap_01.par_02_Operators;

import static part_0.Temporal.*;


public class _14_BitRightShift {

    static int a = 0x0C;
    static int b = 0x06;
    static int c;


    public static void main(String[] args) {

        c = b >> 1;

        System.out.println(c == a);
        bln();

        string(Integer.MIN_VALUE);
        bln();
        c = Integer.MIN_VALUE>>1;
        string(c);
        bln();
        System.out.println("val1 : "+Integer.MIN_VALUE);
        System.out.println("val2 : "+c);
        bln();
        System.out.println("min-1 :");
        string(Integer.MIN_VALUE-1);
        bln();
        System.out.println("min+1 :");
        string(Integer.MIN_VALUE+1);

    }
}
