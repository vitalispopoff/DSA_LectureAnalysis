package main.java.part_01.chap_08_exercises;

class B {

    static B b = new B();
    B c;
    public char a = 'b';

    char b(){return a;}

    public static void main(String[] args) {
//        System.out.println(B.b.b());
//        System.out.println(B.b.c.a);
        System.out.println(C.C.c);
    }
}
