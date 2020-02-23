package part_03.chap_06_sparseTable.example_SparseTable;

public class Grade {

    int
            value;
    Grade
            prevStudentGrade = null,
            nextStudentGrade = null,
            prevLectureGrade = null,
            nextLectureGrade = null;

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
        this.value = value;
    }

}
