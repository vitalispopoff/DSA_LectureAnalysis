package part_01.chap_01.par_05_Exceptions;

import static java.lang.Double.NaN;

public class _01_TryCatchFinally {

    static int
            a,
            b = 0,
            c;

    static {
        try {
            a = 1 / b++;
        } catch (Exception e) {
            System.out.print(b);
        }
    }

    /* TODO
    *
    *   does catch() catch more than just Exception ?
    * */

/*    static {

//        c = new Integer("dupa");
//  java.lang.ExceptionInInitializerError
//  Caused by: java.lang.NumberFormatException: For input string: "dupa"

        try {
            c = new Integer("dupa");
        } catch (NumberFormatException e) {
            c = 0;
            System.out.println("Due to the " + e + "\n variable 'a' is set to " + c + ".");
        }
    }*/

    public static void main(String[] args) {}
}
