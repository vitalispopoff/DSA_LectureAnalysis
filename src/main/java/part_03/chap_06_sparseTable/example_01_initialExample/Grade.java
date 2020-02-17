package part_03.chap_06_sparseTable.example_01_initialExample;

public class Grade {

    int
            value;
    Grade
            prevStudentGrade,
            nextStudentGrade,
            prevLectureGrade,
            nextLectureGrade;

    public Grade(
            int value,
            Grade prevStudentGrade,
            Grade nextStudentGrade,
            Grade prevLectureGrade,
            Grade nextLectureGrade) {
        this.value = value;
        this.prevStudentGrade = prevStudentGrade;
        this.nextStudentGrade = nextStudentGrade;
        this.prevLectureGrade = prevLectureGrade;
        this.nextLectureGrade = nextLectureGrade;
    }

    public Grade(int value) {
        this(value,
                null,
                null,
                null,
                null);
    }
}
