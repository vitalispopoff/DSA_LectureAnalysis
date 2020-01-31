package part_01.chap_08_exercises.exc_02sq.inner;

public class Main {


    public static void main(String[] args) {
        ExtC1 object1 = new ExtC1();
        C1 object2 = new ExtC1(), object3 = new ExtC1();

//        object1.process1(1000); //  "Inside process1 in ExtC1 1000"
//        object1.process4(2000); //  "Inside process4 in ExtC1 2000"
//        object2.process1(3000); //  Error: java: incompatible types: possible lossy conversion from int to char
//        object2.process4(4000); //  Error: java: cannot find symbol; symbol: method process4(int); location: variable object2 of type (...).C1
//        object3.process1('P');  //  "Inside process1 in C1 P"
//        object3.process2('Q');  //  "Inside process2 in ExtC1 Q"
//        object3.process3('R');  //  Inside process3 in C1R // Inside process2 in ExtC1 R
    }
}
