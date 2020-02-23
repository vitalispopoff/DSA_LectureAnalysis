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
        if (student == null) return -1;         // a mistake? shouldn't return 1 ?
        else {
            int result = lastName.compareToIgnoreCase(student.lastName);
            return result == 0 ? firstName.compareToIgnoreCase(student.firstName) : result;
        }
    }

    public Student isInList(String lastName, String firstName){
        Student result = new Student(lastName, firstName);
        for (
                Student cache = studentHead;
                cache != null;
                cache = cache.next)
            if (compareStudents(cache) == 0) return cache;
        return null;

    }

    public boolean isInList() {
        for (
                Student cache = studentHead;
                cache != null;
                cache = cache.next)
            if (compareStudents(cache) == 0) return true;
        return false;
    }

    public static Student findNearest(String lastName, String firstName) {
        Student result;

        if (isEmpty()) result = null;
        else {
            result = new Student(lastName, firstName);

            if (result.compareStudents(studentHead) < 0) result = studentHead;
            else if (result.compareStudents(studentTail) > 0) result = null;
            else {
                Student cache = studentHead;
                for (;
                     cache != null && result.compareStudents(cache) > 0;
                     cache = result.compareStudents(cache) > 0 ? cache : cache.next) ;

                if (result.compareStudents(cache) > 0) result = cache;
                else result = null;
            }
        }
        return result;
    }

    public static Student addToList(String lastName, String firstName) {
        Student
                student = new Student(lastName, firstName),
                counter = studentHead;

        if (counter == null) studentHead = studentTail = student;
        else {
            for (; counter != null && student.compareStudents(counter) == 0 && student.compareStudents(counter.prev) > 0; counter = counter.next)
                ;
            {
                student.next = counter;
                student.prev = counter == null ? studentTail : counter == studentHead ? null : counter.prev;
                if (student.prev != null) student.prev.next = student;
                if (student.next != null) student.next.prev = student;
                if (student.prev == null) studentHead = student;
                if (student.next == null) studentTail = student;
            }
        }
        return student;
    }

    public void removeGrades() {
        Grade grade = gradeHead;

        for (; grade != null; grade = grade.nextLectureGrade) {
            if (grade.prevStudentGrade != null) grade.prevStudentGrade.nextStudentGrade = grade.nextStudentGrade;
            if (grade.nextStudentGrade != null) grade.nextStudentGrade.prevStudentGrade = grade.prevStudentGrade;
            gradeHead = gradeTail = null;
        }
    }

    public void removeStudent(){
//        removeGrades();

        if(next != null) next.prev =  prev ==null ? null : prev;
        if(prev != null) prev.next = next == null ? null : next;
        next = prev = null;     // this might be an overkill - disposable?
    }

    public static void main(String[] args) {

        String a = "a", b = "b";
        System.out.println(a.compareToIgnoreCase(b));
    }
}
