package part_03.chap_06_sparseTable.example_SparseTable;

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

/*    public Lecture(
            String code,
            String title,
            Lecture prev,
            Lecture next) {
        this.code = code;
        this.title = title;
        this.prev = prev;
        this.next = next;
    }*/     //  TODO full constructor - disposable.

    public Lecture(String title, String code) {
        this.code = code;
        this.title = title;
    }

    public static boolean isEmpty() {
        return lectureHead == null;
    }

    public int compareLectures(Lecture lecture) {
        int result = code.compareToIgnoreCase(lecture.code);
        return result == 0 ? title.compareToIgnoreCase(lecture.title) : result;
    }

    public boolean isInList() {
        for (
                Lecture cache = lectureHead;
                cache != null;
                cache = cache.next)
            if (this.compareLectures(cache) == 0) return true;
        return false;
    }
}