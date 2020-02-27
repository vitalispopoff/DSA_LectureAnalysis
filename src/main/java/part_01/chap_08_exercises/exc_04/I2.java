package part_01.chap_08_exercises.exc_04;

public interface I2 {

    double I2f1();

    void I2f2(int i);

    int I1f1();

//    double I2f1(){return 10;}
    //  Error: java: method I2f1() is already defined in interface (...).I2
    //  Error: java: interface abstract methods cannot have body

//    private int AC1f4();
    //  Error: java: modifier private not allowed here

//    private int n = 10;
    //  Error: java: modifier private not allowed here

    //  additional tests:

    int m = 10;
    static int l = 10;

//    final int k;
    //  Error: java: = expected

    final int k = l;
}

