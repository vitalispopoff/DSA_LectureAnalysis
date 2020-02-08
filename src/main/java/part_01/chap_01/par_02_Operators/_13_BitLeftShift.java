package main.java.part_01.chap_01.par_02_Operators;

import static main.java.part_0.Temporal.*;

public class _13_BitLeftShift {

    static int a = 0x0C;
    static int b = 0x06;
    static int c;


    public static void main(String[] args) {

        c = b << 1;

        System.out.println(c == a);
        bln();

        string(Integer.MAX_VALUE);
        bln();
        c = Integer.MAX_VALUE << 1;
        string(c);
        bln();
        System.out.println("val1 : " + Integer.MAX_VALUE);
        System.out.println("val2 : " + c);
        bln();
        System.out.println("max-1 :");
        string(Integer.MAX_VALUE - 1);
        bln();
        System.out.println("max+1 :");
        string(Integer.MAX_VALUE + 1);

        bln();
        System.out.println("* * *");

        {System.out.print("a :      ");
        string(a);
        bln();

        System.out.print("a<<=1 : ");
        string(a <<= 1);
        bln();

        System.out.print("a :     ");
        string(a);
        bln();}

    }
}
