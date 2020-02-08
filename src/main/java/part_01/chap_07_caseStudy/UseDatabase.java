package main.java.part_01.chap_07_caseStudy;

import java.io.IOException;

public class UseDatabase {

    public static void main(String[] args) throws IOException {
//        (new Database()).run(new Personal());     // disabled in the original code.
        (new Database()).run(new Student());
    }
}
