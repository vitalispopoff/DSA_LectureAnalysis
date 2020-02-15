package part_03.chap_06_sparseTable.example_01_initialExample;

public class Grade {

    int value;
//    Grade prev, next;
    Student student;
    Lecture lecture;

    public Grade(Student student, Lecture lecture){
        this(null, student, lecture);
    }

    public Grade(int value, Student student, Lecture lecture) {
        this(value, /*null, null,*/ student, lecture);
    }

    public Grade(int value, /*Grade next,*/ Student student, Lecture lecture) {
        this(value, /*null, next,*/ student, lecture);
    }

    public Grade(int value, /*Grade prev, Grade next,*/ Student student, Lecture lecture) {
        this.value = value;
//        this.prev = prev;
//        this.next = next;
        this.student = student;
        this.lecture = lecture;
    }
}
