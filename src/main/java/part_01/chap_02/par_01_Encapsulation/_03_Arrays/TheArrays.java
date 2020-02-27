package part_01.chap_02.par_01_Encapsulation._03_Arrays;


//    the class name is defined in opposition to the actual Arrays class : java.lang.Arrays; (https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
public class TheArrays {

    public static void main(String[] args) {

        int[] a;
        int b[];

        int[] c = new int[1];
        int[] d = {1, 2, 5, -7, 3};

        int len = d.length;     // the .length is a variable of the array, that's why no brackets in a call;

//    int entry = d[d.length];  // this one will throw an IndexOutOfBoundsException, cause the array indexes start with 0., so the last element is always .length - 1;


        for (int i = 0; i < d.length; i++) System.out.print(d[i]+", ");

    }
}
