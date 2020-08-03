package part_01.chap_08_exercises;

public class C implements Cloneable{

    public static C
        C = new C();
    public char
        c = 'c';

    private C() { }

    public static void main(String[] args) {

        System.out.println(C.C.c);
    }
}
