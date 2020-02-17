package part_03.chap_06_sparseTable.example_01_initialExample;

public class Student {

    String
            lastName,
            firstName;
    Student
            prev,
            next;
    Grade
            head,
            tail;

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
        this(
                lastName,
                firstName,
                null,
                null);
    }
}
