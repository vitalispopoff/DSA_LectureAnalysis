package part_01.chap_01.par_01_PrimitiveTypes._01_BooleanType;

import static java.lang.Boolean.*;

public class _01_BooleanTests {

    public static void properties() {
        System.out.println(
                TYPE.getCanonicalName() + " instance representation: " + TYPE + "\n"
        );
    }

    public static void main(String[] args) {

        properties();

        boolean
                a = false,
                b = new Boolean(false),
                c = new Boolean("true"),
                d = FALSE;

        /*System.out.println(a + b);*/  //  ! Error:(18, 30) java: bad operand types for binary operator '+'

        System.out.println(b & c);
        System.out.println(b | c);
    }
}