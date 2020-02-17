package part_03.chap_06_sparseTable.example_01_initialExample;

public class Lecture {

    static Lecture
            lectureHead = null,
            lectureTail = null;
    Lecture
            prev = null,
            next = null;
    Grade
            gradeHead = null,
            gradeTail = null;
    String
            code,
            title;

    public Lecture(
            String code,
            String title,
            Lecture prev,
            Lecture next) {
        this.code = code;
        this.title = title;
        this.prev = prev;
        this.next = next;
    }

    public Lecture(String title, String code) {
        this.code = code;
        this.title = title;
    }
}
