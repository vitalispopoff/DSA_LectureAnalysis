package part_01.chap_01.par_02_Operators;

import static java.lang.Boolean.*;

public class _08_LogicalNegation {

    static boolean a;

    public static void main(String[] args) {

        a = FALSE;
        System.out.println("a=FALSE; !a : "+Boolean.toString(!a));

        a = TRUE;
        System.out.println("a=TRUE; !a : "+Boolean.toString(!a));
    }

    /**
     *  TODO - write a set of methods:
     *  logical pre- and post-crementation (symmetrical and asymmetrical:
     *  symmetrical: true -> false & false -> true
     *  asymmetrical : true -> false & false -> false ; false -> true & true -> true;
     * */
}