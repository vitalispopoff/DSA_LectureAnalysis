package part_03.chap_06_sparseTable.example_01_initialExample;

public class Student {

    String personalDetails;
    String firstName;
    String lastName;
    Student prev, next;
    GradeList gradesOfTheStudent;

    public Student(String lastName, String firstName) {
        this(lastName, firstName, null, null);
    }

    public Student(String lastName, String firstName, Student prev, Student next) {
        this.personalDetails = lastName+firstName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.next = next;
        this.prev = prev;
        this.gradesOfTheStudent = new GradeList();
    }

    boolean matchStudent(String lastName, String firstName) {
        return firstName == null ?
                this.lastName.equalsIgnoreCase(lastName) :
                this.lastName.equalsIgnoreCase(lastName) & this.firstName.equalsIgnoreCase(firstName);
    }

    boolean matchStudent(String lastName) {
        return matchStudent(lastName, null);
    }

    public static void main(String[] args) {
    }
}
