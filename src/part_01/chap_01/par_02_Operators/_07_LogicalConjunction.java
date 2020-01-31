package part_01.chap_01.par_02_Operators;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static part_01.Temporal.bln;

public class _07_LogicalConjunction {

    public static void main(String[] args) {

        System.out.println("TRUE && TRUE : "+ Boolean.toString(TRUE && TRUE));
        System.out.println("FALSE && FALSE : "+ Boolean.toString(FALSE && FALSE));
        System.out.println("FALSE && TRUE : "+ Boolean.toString(FALSE && TRUE));
        System.out.println("TRUE && FALSE : "+ Boolean.toString(TRUE && FALSE));
        bln();

        System.out.println("TRUE & TRUE : "+Boolean.toString(TRUE & TRUE));
        System.out.println("FALSE & FALSE : "+Boolean.toString(FALSE & FALSE));
        System.out.println("FALSE & TRUE : "+ Boolean.toString(FALSE & TRUE));
        System.out.println("TRUE & FALSE : "+ Boolean.toString(TRUE & FALSE));


    }
}
