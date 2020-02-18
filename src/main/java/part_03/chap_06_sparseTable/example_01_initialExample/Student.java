package part_03.chap_06_sparseTable.example_01_initialExample;

public class Student {

    static Student
            studentHead = null,
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

/*    public Student(
            String lastName,
            String firstName,
            Student prev,
            Student next) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.prev = prev;
        this.next = next;
    }*/     // TODO full constructor - disposable.

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public static boolean isEmpty() {
        return studentHead == null;
    }

    public int compareStudents(Student student) {
        int result = lastName.compareToIgnoreCase(student.lastName);
        return result == 0 ? firstName.compareToIgnoreCase(student.firstName) : result;
    }

    public boolean isInList() {
        for (
                Student cache = studentHead;
                cache != null;
                cache = cache.next)
            if (this.compareStudents(cache) == 0) return true;
        return false;
    }

    public static Student addToList(String lastName, String firstName) {
        Student student = new Student(lastName, firstName);

        //        TODO fully rewrite the  algorithm

        return student;
    }

    public static void main(String[] args) {

    }
}
