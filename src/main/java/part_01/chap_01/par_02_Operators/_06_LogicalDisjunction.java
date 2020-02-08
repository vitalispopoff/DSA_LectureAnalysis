package main.java.part_01.chap_01.par_02_Operators;

import static java.lang.Boolean.*;
import static part_0.Temporal.bln;

public class _06_LogicalDisjunction {

    public static void main(String[] args) {

        System.out.println("TRUE || TRUE : "+ Boolean.toString(TRUE || TRUE));
        System.out.println("FALSE || FALSE : "+ Boolean.toString(FALSE || FALSE));
        System.out.println("FALSE || TRUE : "+ Boolean.toString(FALSE || TRUE));
        System.out.println("TRUE || FALSE : "+ Boolean.toString(TRUE || FALSE));
        bln();
    }
}
