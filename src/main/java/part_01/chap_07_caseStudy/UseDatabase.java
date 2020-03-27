package part_01.chap_07_caseStudy;

import java.io.IOException;

public class UseDatabase {

    public static void main(String[] args) throws IOException {
        (new Database()).run(new Student());
    }
}