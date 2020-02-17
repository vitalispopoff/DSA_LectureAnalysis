package part_03.chap_06_sparseTable.example_01_initialExample;

public class Lecture {

    String
            code,
            title;
    Lecture
            prev,
            next;
    Grade
            head,
            tail;

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
        this(title, code, null, null);
    }
}
