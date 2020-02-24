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

    public void unbindGrade(Grade grade, Lecture lecture){
        if (lecture.gradeHead == grade) {
            if(grade.nextStudentGrade != null) grade.nextStudentGrade.prevStudentGrade = null;
            lecture.gradeHead = grade.nextStudentGrade;
        } else {
            grade.prevStudentGrade.nextStudentGrade = grade.nextStudentGrade;
            if (grade.nextStudentGrade != null) grade.nextStudentGrade.prevStudentGrade = grade.prevStudentGrade;
        }

        if (lecture.gradeTail == grade) {
            if(grade.prevStudentGrade != null) grade.prevStudentGrade.nextStudentGrade = null;
            lecture.gradeTail = grade.prevStudentGrade;
        } else {
            grade.nextStudentGrade.prevStudentGrade = grade.prevStudentGrade;
            if (grade.prevStudentGrade != null) grade.prevStudentGrade.nextStudentGrade = grade.nextStudentGrade;
        }
    }

    /*public Lecture removeGrade(Grade grade, Lecture lecture) {
//        Lecture lecture = Lecture.lectureHead;

        // remove the grade
        for(boolean breakCondition = true; breakCondition; ){
            breakCondition = lecture.gradeHead != grade && lecture.gradeTail != grade && lecture != null;

            if (lecture.gradeHead == grade) {
                lecture.gradeHead = grade.nextStudentGrade;
                lecture.gradeHead.prevStudentGrade = null;
            } else {
                grade.prevStudentGrade.nextStudentGrade = grade.nextStudentGrade;
                grade.nextStudentGrade.prevStudentGrade = grade.prevStudentGrade;
            }
            if (lecture.gradeTail == grade) {
                lecture.gradeTail = grade.prevStudentGrade;
                lecture.gradeTail.nextStudentGrade = null;
            } else {
                grade.prevStudentGrade.nextStudentGrade = grade.nextStudentGrade;
                grade.nextStudentGrade.prevStudentGrade = grade.prevStudentGrade;
            }
            if(breakCondition)lecture = lecture.next;
        }
        return lecture;
    }*/

    public static void main(String[] args) {

        String a = "a", b = "b";
        System.out.println(a.compareToIgnoreCase(b));
    }
}
