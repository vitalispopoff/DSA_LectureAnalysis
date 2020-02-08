package part_01.chap_01.par_04_Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static part_0.Temporal.bln;

public class _03_ForEach {

    static int[] a = new int[3];
    static int[] b = new int[3];
    static List<Integer> c = new ArrayList<>();
    static int d = 0;

    static {
        for (int i = 0; i < 3; i++) {
            a[i] = i;
        }
    }

    static {
        System.out.println("before foreach block : "+Arrays.toString(b));
        for (int i : b) {
            i = d++;
            System.out.println("inside foreach block, d : "+d+ " , i : "+i);
        }
        System.out.println("post foreach block : "+Arrays.toString(b));
        bln();
    }

//    TODO Work it out! - foreach
    static {
        d=0;
        System.out.println("before foreach block : "+c.toString());
        for (int i : c) {
            i = d++;
            System.out.println("inside foreach block, d : "+d+ " , i : "+i);
        }
        System.out.println("post foreach block : "+c.toString());
        bln();
    }

    static void forEach01() {
        System.out.println("forEach01 : ");
        d = 0;
        for (int i : a) {
            System.out.println(i);
        }
    }

    static void forEach02() {
        System.out.println("forEach02 : ");
        d = 0;
        for (int i : a) {
            System.out.println("d : "+d++);
        }
    }

    public static void main(String[] args) {

        System.out.println("a & b arrays");
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        bln();

        forEach01();
        bln();

        forEach02();


    }
}
