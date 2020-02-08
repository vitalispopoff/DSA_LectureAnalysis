package part_01.chap_02.par_01_Encapsulation;

public final class Daughter extends Mother {

//    @Override
//    public String moreToString() { return ""; }

    /*
    Error: java: moreToString() in part_01.chap_02.par_01_Encapsulation.
    Daughter cannot override moreToString() in part_01.chap_02.par_01_Encapsulation.Mother overridden method is final
  */

//    static final int i;

    /*Error:(13, 22) java: variable i not initialized in the default constructor*/

    static final int j = 0;

    public static void main(String[] args) {

//        j++;

        /*Error:(21, 9) java: cannot assign a value to final variable j*/
    }
}
