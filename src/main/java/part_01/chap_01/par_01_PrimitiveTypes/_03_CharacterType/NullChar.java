package part_01.chap_01.par_01_PrimitiveTypes._03_CharacterType;

public class NullChar {

    public static void main(String[] args) {

        System.out.println("min code point: " + Character.MIN_CODE_POINT);
        System.out.println("min value: " + Character.MIN_VALUE);

        char
                tab[] = new char[10],
                cache = tab[5];

        System.out.println(Character.isDefined(tab[5]));
        System.out.println(Character.getType(tab[5]));

    }
}
