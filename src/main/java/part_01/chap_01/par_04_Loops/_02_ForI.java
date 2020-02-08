package main.java.part_01.chap_01.par_04_Loops;

import static part_0.Temporal.bln;


//  * Oracle tutorial: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
public class _02_ForI {

    static int a = 0;

    static void forI01() {
        System.out.println("forI 01 : ");
        for (; ; ) {
            String result = a == 0 ? "wha'da...?" : (a % 2 == 0 ? "even" : "odd");
            System.out.println("a=" + a++ + " : " + result);
            if (a > 2) break;
        }
    }

    static void forI02() {
        System.out.println("forI 02 : ");
        for (a = 0; ; ) {
            String result = a == 0 ? "wha'da...?" : (a % 2 == 0 ? "even" : "odd");
            System.out.println("a=" + a++ + " : " + result);
            if (a > 2) break;
        }
    }

    static void forI03() {
        System.out.println("forI 03 : ");
        for (a = 0; a < 3; ) {
            String result = a == 0 ? "wha'da...?" : (a % 2 == 0 ? "even" : "odd");
            System.out.println("a=" + a++ + " : " + result);
        }
    }

    static void forI04() {
        System.out.println("forI 04 : ");
        for (a = 0; a < 3; a++) {
            String result = a == 0 ? "wha'da...?" : (a % 2 == 0 ? "even" : "odd");
            System.out.println("a=" + a + " : " + result);
        }
    }

    static void forI05() {
        System.out.println("forI 05 : ");
        for (int b = 0; b < 3; b++) {
            System.out.println("b=" + b + " : " + (b == 0 ? "wha'da...?" : (b % 2 == 0 ? "even" : "odd")));
        }
    }

    public static void main(String[] args) {

        forI01();
        bln();

        forI02();
        bln();

        forI03();
        bln();

        forI04();
        bln();

        forI05();
        bln();
    }
}
