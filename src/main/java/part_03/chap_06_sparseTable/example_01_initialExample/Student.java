package part_03.chap_06_sparseTable.example_01_initialExample;

public class Student {

    static Student
            studentHead  = null,
            studentTail = null;
    Student
            prev = null,
            next = null;
    Grade
            gradeHead = null,
            gradeTail = null;
    String
            lastName,
            firstName;

    public Student(
            String lastName,
            String firstName,
            Student prev,
            Student next) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.prev = prev;
        this.next = next;
    }

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
