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
        if (student == null) return 1;         // a mistake? shouldn't return 1 ?
        else {
            int result = lastName.compareToIgnoreCase(student.lastName);
            return result == 0 ? firstName.compareToIgnoreCase(student.firstName) : result;
        }
    }

    public boolean isInList() {
        for (
                Student cache = studentHead;
                cache != null;
                cache = cache.next)
            if (compareStudents(cache) == 0) return true;
        return false;
    }

    public static Student findNearest(Student input) {
        Student cache = studentHead;

        while (cache != null && input.compareStudents(cache) > 0)
            cache = cache.next;
        return cache;
    }

    public static Student findNearest(String lastName, String firstName) {
        return findNearest(new Student(lastName, firstName));
    }

    public static Student addToList(String lastName, String firstName) {
        Student input = new Student(lastName, firstName);
        Student cache = Student.findNearest(input);

        if (cache != input) {

            if (cache == studentHead) {
                input.prev = null;
                studentHead = input;
            } else {
                input.prev = cache.prev;
                input.prev.next = input;
            }
            if (cache == null) {
                input.next = null;
                studentTail = input;
            } else {
                input.next = cache;
                input.next.prev = input;
            }
        }
        return input;
    }

/*    public void removeGrades() {
        for (Grade grade = gradeHead; grade != null; grade = grade.nextLectureGrade) {
            if (grade.prevStudentGrade == null && grade.nextStudentGrade ==null)
                grade.prevStudentGrade = grade.nextStudentGrade = null;
            else if(grade.prevStudentGrade == null){grade.nextStudentGrade.prevStudentGrade = null;}
            else if(grade.nextStudentGrade == null){grade.prevStudentGrade.nextStudentGrade = null;}
            else;

        }


        gradeHead = gradeTail = null;
    }*/     // remove grades - needs grade.student ; grade.lecture in order to clear the list

/*public void removeStudent(){
        removeGrades();

        if(next != null) next.prev =  prev ==null ? null : prev;
        if(prev != null) prev.next = next == null ? null : next;
        next = prev = null;     // this might be an overkill - disposable?
    }*/     // remove student - needs removeGrades() in order to clear the student entry.

    public static void main(String[] args) {

        String a = "a", b = "b";
        System.out.println(a.compareToIgnoreCase(b));
    }
}
