package main.java.part_01.chap_01.par_02_Operators;

import static part_0.Temporal.*;

public class _15_UnsignedBitRightShift {

    static int a = 0x0C;
    static int b = 0x06;
    static int c;

    static byte d = 5;
    static byte e;


    public static void main(String[] args) {

        string(d);
        e = (byte) (d >> 1);
        System.out.print(" >> 1 : ");
        string(e);
        bln();

        string(d);
        /*e = d << 1;*/     // ! java: incompatible types: possible lossy conversion from int to byte
        e = (byte) (d >>> 1);
        System.out.print(" >>> 1 : ");
        string(e);
        bln();

/*
{        c = b >>> 1;
        System.out.println(c == a);
        bln();
        string(Integer.MIN_VALUE);
        bln();
        c = Integer.MIN_VALUE>>>1;
        string(c);
        bln();
        System.out.println("val1 : "+Integer.MIN_VALUE);
        System.out.println("val2 : "+c);
        bln();
        System.out.println("min-1 :");
        string(Integer.MIN_VALUE-1);
        bln();
        System.out.println("min+1 :");
        string(Integer.MIN_VALUE+1);}
*/

    }
}
