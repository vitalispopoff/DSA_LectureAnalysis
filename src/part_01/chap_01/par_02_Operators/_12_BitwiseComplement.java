package part_01.chap_01.par_02_Operators;

import static part_01.Temporal.bln;
import static part_01.Temporal.string;

public class _12_BitwiseComplement {

    static int a = 0xF0F0F0F0;
    static int b = 0x06;
    static int c;

    /*static void string(int c) {
        System.out.print(Integer.toBinaryString(c));
    }*/

    public static void main(String[] args) {

        c = ~a;
        {
            string(a);
            bln();
            System.out.print("    ");
            string(c);
        }
    }
}
