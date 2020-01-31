package part_01.chap_01.par_05_Exceptions;

//  Oracle tutorial https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html
public class _02_Throw {

    static int a;


    static void throw01(String s) throws NumberFormatException {
        a = new Integer(s);
//        System.out.println("Due to the " + e + "\n variable 'a' is set to " + a + ".");
    }

    public static void main(String[] args) {

//        throw01();
    }
}
