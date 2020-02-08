package main.java.part_01.chap_08_exercises.exc_02sq.inner;

public class C1 {

    static A var = new A("k", "m", "p", "q");

    static void cMethod (){
//        System.out.println(var.k);  // Error: java: k has private access in (...)A
        System.out.println(var.m);
        System.out.println(var.p);
        System.out.println(var.q);
    }

    void process1(char ch){
        System.out.println("Inside process1 in C1 "+ch);
    }
    void process2(char ch){
        System.out.println("Inside process2 in C1"+ch);
    }

    void process3(char ch){
        System.out.println("Inside process3 in C1"+ch);
        process2(ch);
    }

    public static void main(String[] args) {

    }

}

