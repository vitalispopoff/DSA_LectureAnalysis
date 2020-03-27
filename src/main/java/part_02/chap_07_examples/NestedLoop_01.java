package part_02.chap_07_examples;

public class NestedLoop_01 {

    static int n = 10;
    static int[] a = new int[n];

    static {
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
    }

    public static void main(String[] args) {

        int sum = a[0];

        for (int i = 0; i < n; i++) {
            for (int j = 0  ; j <= i; j++)
                sum += a[j];
            System.out.println("sum for subarray 0 through " + i + " is " + sum);
        }
    }
}

/*
* complexity = O(n^2) because in terms of number of iterations both loops (inner and outer) are strictly related to the iterated array size
* */