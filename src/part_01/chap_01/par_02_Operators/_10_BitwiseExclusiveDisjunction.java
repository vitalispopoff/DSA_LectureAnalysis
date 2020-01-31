package part_01.chap_01.par_02_Operators;

import static java.lang.Boolean.*;
import static part_01.Temporal.bln;

public class _10_BitwiseExclusiveDisjunction {

    static int a = 0x0A;
    static int b = 0x06;
    static int c;

    static void string(int c) {
        System.out.print(Integer.toBinaryString(c));
    }

    public static void main(String[] args) {

        c = a + b;
        {
            string(a);
            System.out.print(" + ");
            string(b);
            System.out.print(" == ");
            string(c);
            bln();
        }
        c = a | b;
        {
            string(a);
            System.out.print(" | ");
            string(b);
            System.out.print(" == ");
            string(c);
            bln();
        }
        c = a ^ b;
        {
            string(a);
            System.out.print(" ^ ");
            string(b);
            System.out.print(" == ");
            string(c);
            bln();
        }
        bln();
        {
            System.out.print("1 ^ 1 == ");
            string(1 ^ 1);
            System.out.println("    TRUE ^ TRUE : " + Boolean.toString(TRUE ^ TRUE));
        }
        {
            System.out.print("0 ^ 0 == ");
            string(0 ^ 0);
            System.out.println("    FALSE ^ FALSE : " + Boolean.toString(FALSE ^ FALSE));
        }
        {
            System.out.print("0 ^ 1 == ");
            string(0 ^ 1);
            System.out.println("    FALSE ^ TRUE : " + Boolean.toString(FALSE ^ TRUE));
        }
        {
            System.out.print("1 ^ 0 == ");
            string(1 ^ 0);
            System.out.println("    TRUE ^ FALSE : " + Boolean.toString(TRUE ^ FALSE));
        }
        bln();
    }
}
