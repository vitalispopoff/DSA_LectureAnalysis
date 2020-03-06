package part_01.chap_02.par_01_Encapsulation._03_Arrays;

public class InitializingArray {
    public static void main(String[] args) {

        long[] longTab = new long[300_000_000];   //long is 64bit in size, 300M entries * 64b = 24 GB

        System.out.println(longTab[100_000]);     // the line prints "0" even though there's no an actual tab[100_000] initialized.
    }
}
