package part_02.chap_07_examples;

public class NestedLoop_02 {

    static int
        n = 10;
    static int[]
        a = new int[n];

    static {

        for (int i = 0; i < n; i++)
            a[i] = i;
    }

    public static void main(String[] args) {

        int
            j,
            sum = a[0];

        for (int i = 4; i < n; i++) {

            for (sum = a[i-4],  j = i-3; j <= i; j++)
                sum += a[j];

            System.out.println("sum for subarray "+(i-4)+" through "+i+" is "+ sum);
        }
    }
}

/*
*  complexity = O(n), because inner loop (for j) is executed 1+i-(i-3) times
* */