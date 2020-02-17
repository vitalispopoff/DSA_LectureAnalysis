package part_03.chap_06_sparseTable.example_01_initialExample;

public class Student {

    String personalDetails;
    String firstName;
    String lastName;
    Student prev, next;
    GradeList gradesOfTheStudent;

//    TODO constructors need firstName / lastName length and format exception

    public Student(String lastName, String firstName) {
        this(lastName, firstName, null, null);
    }

    public Student(String lastName, String firstName, Student prev, Student next) {
        this.personalDetails = lastName + firstName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.next = next;
        this.prev = prev;
        this.gradesOfTheStudent = new GradeList();
    }

    boolean matchStudent(String lastName, String firstName) {
        return personalDetails.compareToIgnoreCase(lastName+firstName) == 0;
    }

    boolean matchStudent(String lastName) {
        return matchStudent(lastName, "");
    }

    int compareTo(Student student) {
       int lastNamesComparison = lastName.compareToIgnoreCase(student.lastName);
       return lastNamesComparison==0? firstName.compareToIgnoreCase(student.firstName) : lastNamesComparison;
    }

    public static void main(String[] args) {
        Student s1 = new Student("mazwisko", "imię"),
                s2 = new Student("nazwisko", "imię"),
                s3 = new Student("nazwisko", "imię1"),
                s4 = new Student("", "imię");
        System.out.println(s1.compareTo(s2));

    }
}
