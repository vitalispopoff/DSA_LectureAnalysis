package part_01.chap_01.par_05_Exceptions;

import static java.lang.Double.NaN;

public class _01_TryCatchFinally {

    static int
            a,
            b = 0,
            c;

    static void method_0() {
        try {
            a = 1 / b++;
        } catch (Exception e) {
            System.out.print(b);
        }
    }

    static int method_01(){
        try{
            return 1;
        } catch (Exception e){}
        finally {
            System.out.println("the the finally goes");
        }
        return 0;
    }

    static int method_02(){
        try{
            return 1;
        } catch (Exception ignored){}
        finally {
            return 3;
        }
    }

    /* TODO
    *
    *   does `catch()` catch more than just Exception ?
    * */

/*    static {
        try{

        } catch (Throwable t){}
    }*/ // TODO  - check: catch Throwable;

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

    public static void main(String[] args) {


        int x = 0;
        System.out.println("x is : "+x);

        x = method_02();
        System.out.println(x);
    }
}
