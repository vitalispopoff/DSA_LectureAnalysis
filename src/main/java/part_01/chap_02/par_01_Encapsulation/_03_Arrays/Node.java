package part_01.chap_02.par_01_Encapsulation._03_Arrays;

public class Node {

    String name,
            code;
    float value = Float.NaN;

    public static void main(String[] args) {

        Node[] a = new Node[1];
        System.out.println(a[0]);
    }
}
