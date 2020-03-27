package part_01.chap_02.par_01_Encapsulation._04_WrapperClasses;

public class DoubleWrapper {

    static void isNaNWrapperExclusive(){
        double a = Double.NaN;

        a = a == Double.NaN ? '1' + 1 : a;

        System.out.println(a);
    }

    public static void main(String[] args) {

        isNaNWrapperExclusive();
    }
}