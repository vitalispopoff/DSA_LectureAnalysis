package part_01.chap_02.par_01_Encapsulation._03_Arrays;

public class ListingArrays {
}

class Numbers{

    static int[] numbers;

    public static void makeNumbers(){
        numbers = new int[5];
        for(int i : numbers) i = 1;
        for(int i : numbers) System.out.println(i);
    }

    public static void makeNewNumbers(){
        numbers = new int[5];
        for(int i = 0; i < 5; i++) numbers[i] = i+1;
        for(int i : numbers)System.out.println(i);
    }

    public static void main(String[] args) {
        makeNumbers();
        System.out.println();
        makeNewNumbers();
    }
}


class Junk {

    static Junk[] junkyard;

    public static void makeJunk() {
        junkyard = new Junk[5];
        for (Junk junk : junkyard) junk = new Junk();
        for (Junk junk : junkyard) System.out.println(junk);
    }

    public static void makeJunkAgain() {
        junkyard = new Junk[5];
        for (int i = 0; i < junkyard.length; i++)
            junkyard[i] = new Junk();
        for (Junk junk : junkyard) System.out.println(junk);
    }

    public static void main(String[] args) {

        makeJunk();
        makeJunkAgain();
    }
}