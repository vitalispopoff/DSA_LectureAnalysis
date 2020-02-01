package part_02.chap_07_examples;

interface NestedLoop_03 {

    static int[] a = {1, 8, 1, 2, 5, 7, 0, 11, 12, 15};
    static int[] b = {1, 2, 0};

/*    static void comboLengthByDrozdek(int[]a){
        for (int i = 0; i < n-1; i++) {
            for(i1=i2=k=i; k< n-1 && a[k] < a[k+1]; k++, i2++)
                if(length < i2 - i1 +1)
                    length = i2 - i1 +1;
            System.out.println("the length of the longest ordered subarray is "+length);
        }
    }*/

    static void correctedComboLengthByDrozdek(int[] a) {
        int i = 0, i1, i2, k, length = 1, n = a.length - 1;
        for (; i < n; i++) {
            for (i1 = i2 = k = i; k < n && a[k] < a[k + 1]; k++, i2++)
                if (length < i2 - i1 + 2)
                    length = i2 - i1 + 2;
        }
        System.out.println("the length of the longest ordered subarray is " + length);
    }

    static void comboLength(int[] a) {
        int lastInd = a.length - 1;
        int result = 1;

        for (int i = 0; i < lastInd; i++) {
            boolean l = true;
            for (int j = i, k = 1; j < lastInd && l; j++)
                if (a[j] < a[j + 1])
                    ++k;
                else {
                    i = j;
                    l = false;
                    result = Math.max(result, k);
                }
        }
        System.out.println(result);
    }

    static void main(String[] args) {
        correctedComboLengthByDrozdek(a);
        correctedComboLengthByDrozdek(b);
//        comboLength(a);
    }
}
