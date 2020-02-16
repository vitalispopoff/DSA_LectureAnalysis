package part_03.chap_06_sparseTable.example_01_initialExample;

public class Grade {

    int value;
    Student student;
    Lecture lecture;
    Grade prevLecture, nextLecture, prevStudent, nextStudent;

    public Grade(int value, Student student, Lecture lecture) {
        this.value = value;
        this.student = student;
        this.lecture = lecture;
        this.prevLecture = this.nextLecture = this.prevStudent = this.nextStudent = null;
    }
}
