package part_05.chap_07_nestedRecursion;

import java.util.ArrayList;

public class Fibonacci {

    static ArrayList<Integer> list = new ArrayList<>();

    static void fibonacci(int i) {
        if (i < 2) arithmetic(i);
        else {
            fibonacci(i - 1);
            list.add(i, list.get(i - 1) + list.get(i - 2));
            System.out.print(list.get(i) + ", ");
        }
    }

    static void arithmetic(int i) {
        if (i > 0) arithmetic(i - 1);
        else if (i == 0) System.out.print("Fibonacci sequence: ");
        list.add(i, i);
        System.out.print(i + ", ");
    }

    public static void main(String[] args) {
        fibonacci(25);
    }
}
