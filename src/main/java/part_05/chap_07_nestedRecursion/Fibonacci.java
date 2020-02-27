package part_05.chap_07_nestedRecursion;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

    static ArrayList<Integer> list = new ArrayList<>();

    static int wrongRecursionFibo(int i) {
        if (i < 2) return i;
        else return wrongRecursionFibo(i - 1) + wrongRecursionFibo(i - 2);
    }

    static int noRecursionFibo(int n) {
        double
                expo = (double) n,
                root5 = pow(5., 0.5),
                phi = (1. + root5) / 2.,
                result = pow(phi, expo) / root5;
        return (int) round(result);
    }

    static int iterationFibo(int n) {
        ArrayList<Integer> cache = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i <= n; i++) {
            cache.add(i, cache.get(i-1) + cache.get(i-2));
        }
        return cache.get(n);
    }

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

        int n = 25;

        fibonacci(n);
        System.out.println();
        System.out.println("no recursion: "+ noRecursionFibo(n));
        System.out.println("iteration: "+ iterationFibo(n));
    }
}
