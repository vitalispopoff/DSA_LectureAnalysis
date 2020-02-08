package main.java.part_01.chap_01.par_01_PrimitiveTypes;

import part_01.chap_01.par_01_PrimitiveTypes._02_ByteTests;

public class PrimitiveTypeProperties {

    public static void main(String[] args) {

        {
            System.out.println("Character: ");
            _03_CharacterTests.properties();

            System.out.println("Byte: ");
            _02_ByteTests.properties();

            System.out.println("Short: ");
            _03_ShortTests.properties();

            System.out.println("Integer: ");
            _04_IntegerTests.properties();

            System.out.println("Float: ");
            _04_FloatTests.properties();

            System.out.println("Long: ");
            _05_LongTests.properties();
        }     // properties of the primitive types (exc. String)
    }
}
