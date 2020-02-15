package part_03.chap_06_sparseTable.example_01_initialExample;

public class Student {

    String firstName;
    String lastName;
    Student prev, next;
    Grade head, tail;

    public Student(String lastName) {
        this(lastName, null, null, null,  null, null);
    }

    public Student(String lastName, Student next) {
        this(lastName, null, null, next,  null, null);
    }

    public Student(String lastName, String firstName) {
        this(lastName, firstName, null, null,  null, null);
    }

    public Student(String lastName, String firstName, Student next) {
        this(lastName, firstName, null, next, null, null);
    }

    public Student(String lastName, String firstName, Student prev, Student next){
        this(lastName, firstName, prev, next, null, null);
    }

    public Student(String lastName, String firstName, Student prev, Student next, Grade head, Grade tail) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.next = next;
        this.prev = prev;
        this.head = head;
        this.tail = tail;
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
