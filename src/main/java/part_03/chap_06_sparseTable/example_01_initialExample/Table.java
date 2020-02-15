package part_03.chap_06_sparseTable.example_01_initialExample;

public class Table {

    LectureList lectures;
    StudentList students;

    public Table(LectureList lectures, StudentList students) {
        this.lectures = lectures;
        this.students = students;
    }

    public Student addStudent(String lastName, String firstName){
        Student student = students.addToTail(lastName, firstName);
        for(Lecture lecture = lectures.head; lecture!=null; lecture=lecture.next){
            Grade grade = new Grade();

        }


        return student;
    }

}

