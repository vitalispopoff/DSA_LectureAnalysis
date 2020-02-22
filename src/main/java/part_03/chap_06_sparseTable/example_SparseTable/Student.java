package part_03.chap_06_sparseTable.example_SparseTable;

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
        Student
                student = new Student(lastName, firstName),
                counter = studentHead;
        if (counter == null) studentHead = studentTail = student;
        else {
            for (; student.compareStudents(counter.prev) < 0; counter = counter.next) ;
            {
                student.prev = counter == null ? studentTail : counter == studentHead ? null : counter.prev;
                student.next = counter == null ? null : counter;
                if (student.prev != null) student.prev.next = student;
                if (student.next != null) student.next.prev = student;
                if (student.prev == null) studentHead = student;
                if (student.next == null) studentTail = student;
            }
        }
        return student;
    }

    public static void main(String[] args) {

    }
}
