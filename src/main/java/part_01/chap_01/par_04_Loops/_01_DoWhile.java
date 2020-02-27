package part_01.chap_01.par_04_Loops;

import static part_0.Temporal.*;

public class _01_DoWhile {

    static int a = 1;

    static void doWhile01() {
        while (a < 3) {
            String result = a % 2 == 0 ? "even" : "odd";
            System.out.println("a=" + a++ + " : " + result);
        }
    }

    static void doWhile02() {
        a = 0;
        String result = "";
        do {
            result = a == 0 ? "wha'da...?" : (a % 2 == 0 ? "even" : "odd");
            System.out.println("a=" + a++ + " : " + result);
        } while (a < 3);
    }

    public static void main(String[] args) {

        doWhile01();
        bln();

        doWhile02();
    }
}
