package main.java.part_01.chap_01.par_03_Conditionals;

import static main.java.part_0.Temporal.bln;

//  *   Oracle tutorial: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

public class _02_Switch {

    static int a = 1;


    static void condition01() {
        String result = "b=" + a + " : ";
        switch (a % 2) {
            case 0:
                result += "even";
                break;
            case 1:
                result += "odd";
                break;
            default:
                result += "that's odd";
                break;
        }
        a--;
        System.out.println(result);

    }

    public static void main(String[] args) {

        condition01();
        condition01();
        condition01();
        bln();


    }
}
