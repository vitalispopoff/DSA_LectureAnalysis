package part_01.chap_01.par_01_PrimitiveTypes;

import static java.lang.Character.*;

public class _03_CharacterTests {

    public static void properties() {
        String primitiveType = TYPE.getCanonicalName();
        String line = "\n";
        System.out.println(
                primitiveType + " instance representation: " + TYPE + line +
                        primitiveType + " size in bits: " + SIZE + line +
                        primitiveType + " size in bytes: " + BYTES + line +
                        primitiveType + " min value: " + MIN_VALUE + line +
                        primitiveType + " max value: " + MAX_VALUE + line +
                        primitiveType + " min codepoint: " + MIN_CODE_POINT + line +
                        primitiveType + " max codepoint: " + MAX_CODE_POINT + line +
                        primitiveType + " min radix: " + MIN_RADIX + line +
                        primitiveType + " max radix: " + MAX_RADIX + line
        );
    }

    public static void main(String[] args) {

        properties();

        char a, b, c, d, e, f, g;
        a = 'a';
        b = '\u0061';
        c = new Character('a');
        d = 97;
        e = 0x0061;
        f = 0141;
        g = new Character((char) 97);
        /*char h = new Character(97)*/
        ;     //  ! java: incompatible types: possible lossy conversion from int to char

        System.out.println(a + b + c + d + e);
        System.out.println("" + a + b + c + d + e + f + g);

    }

}


