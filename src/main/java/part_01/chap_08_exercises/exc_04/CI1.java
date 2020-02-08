package main.java.part_01.chap_08_exercises.exc_04;

public class CI1 implements I1 {


//    @Override
//    int I1f1() {return 0;}
        //  Error: java: I1f1() in (...).CI1 cannot implement I1f1() in (...).I1
        //  attempting to assign weaker access privileges; was public

    public int I1f1(){return 0;}

//    @Override
//    void I1f2(int i) {}
        //  Error: java: I1f2(int) in (...).CI1 cannot implement I1f2(int) in (...).I1
        //  attempting to assign weaker access privileges; was public

    public void I1f2(int i){}

    int CIf3(){return 0;}

    public static void main(String[] args) {

//        I1 c6 = I1();
            //  Error:(23, 17) java: cannot find symbol
            //  symbol:   method I1()
            //  location: (...).CI1

    }
}
