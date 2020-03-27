package part_05.chap_04_tailRecursion;

public class TailRecursion {

    static double nthOfHalf(int nth) {
        if (nth < 1) return (double) nth;
        else return nthOfHalf(nth - 1) / 2.;
    }

    static int numberOfDigits(int number) {
        if (number < 10) return 1;
        else return  + numberOfDigits(number/10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(nthOfHalf(8));
        System.out.println(numberOfDigits(1024));
    }
}