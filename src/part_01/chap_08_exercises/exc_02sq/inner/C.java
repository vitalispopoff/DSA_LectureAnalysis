package part_01.chap_08_exercises.exc_02sq.inner;

public class C {

    static A var = new A("k", "m", "p", "q");

    static void cMethod (){
//        System.out.println(var.k);  // Error: java: k has private access in (...)A
        System.out.println(var.m);
        System.out.println(var.p);
        System.out.println(var.q);
    }

    public static void main(String[] args) {

    }

}

