package part_01.chap_01.par_03_Conditionals;

import static part_0.Temporal.*;

//  *   Oracle tutorial: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

public class _01_IfElse {

    static int
            a = 1,
            b = 1,
            c = 1;

    static void ifElse01() {
        String result = "a=" + a + " : ";

        if (a++ % 2 == 0) result += "even";
        else result += "odd";

        System.out.println(result);
    }

    static void ifElse02() {
        String result = "b=" + b + " : ";

        if (b % 2 == 0) result += "even";
        else if (b == 1) result += "odd";
        else result += "that's odd";
        b--;

        System.out.println(result);
    }

    static void ifElse03() {
        String result = "c=" + c + " : ";
        result += c++ % 2 == 0 ? "even" : "odd";

        System.out.println(result);
    }

    public static void main(String[] args) {

        ifElse01();
        ifElse01();
        bln();

        ifElse02();
        ifElse02();
        ifElse02();
        bln();

        ifElse03();
        ifElse03();
    }
}