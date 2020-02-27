package part_01.chap_01.par_01_PrimitiveTypes;

public class VariableDeclarations {

    public static void main(String[] args) {

        byte a, b = 1, c = 2;

        /*a = b + c;*/  // ! Error:(18, 15) java: incompatible types: possible lossy conversion from int to byte

        a = (byte) (b + c);
        /*System.out.println(a);*/  // * 3   Process finished with exit code 0

        int i = 2147483647, j = i + 1;
        /*System.out.println(j);*/  // * -2147483648    Process finished with exit code 0



    }
}
