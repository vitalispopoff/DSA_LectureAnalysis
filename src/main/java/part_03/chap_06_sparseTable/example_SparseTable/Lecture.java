package part_03.chap_06_sparseTable.example_SparseTable;

public class Lecture {

    static Lecture
            lectureHead = null,
            lectureTail = null;
    Lecture
            prev = null,
            next = null;
    Grade
            gradeHead = null,
            gradeTail = null;
    String
            code,
            title;

/*    public Lecture(
            String code,
            String title,
            Lecture prev,
            Lecture next) {
        this.code = code;
        this.title = title;
        this.prev = prev;
        this.next = next;
    }*/     //  TODO full constructor - disposable.

    public Lecture(String title, String code) {
        this.code = code;
        this.title = title;
    }

    public static boolean isEmpty() {
        return lectureHead == null;
    }

    public int compareLectures(Lecture lecture) {
        int result = code.compareToIgnoreCase(lecture.code);
        return result == 0 ? title.compareToIgnoreCase(lecture.title) : result;
    }

    public boolean isInList() {
        for (
                Lecture cache = lectureHead;
                cache != null;
                cache = cache.next)
            if (this.compareLectures(cache) == 0) return true;
        return false;
    }

    public static Lecture addToList(String code, String title) {
        Lecture
                lecture = new Lecture(code, title),
                counter = lectureHead;

        if (counter == null) lectureHead = lectureTail = lecture;
        else {
            for (; lecture.compareLectures(counter.prev) < 0; counter = counter.next) ;
            {
                lecture.prev = counter == null ? lectureTail : counter == lectureHead ? null : counter.prev;
                lecture.next = counter == null ? null : counter;
                if (lecture.prev != null) lecture.prev.next = lecture;
                if (lecture.next != null) lecture.next.prev = lecture;
                if (lecture.prev==null) lectureHead = lecture;
                if (lecture.next==null) lectureTail = lecture;
            }
        }
        return lecture;
    }

    public void removeGrades(){
        Grade grade = gradeHead;

        for(; grade !=null; grade = grade.nextStudentGrade){
            if (grade.prevLectureGrade != null) grade.prevLectureGrade.nextLectureGrade = grade.nextLectureGrade;
            if(grade.nextLectureGrade != null) grade.prevLectureGrade = grade.nextLectureGrade;
            gradeHead = gradeTail = null;
        }
    }

    public void removeLecture(){
        removeGrades();

        if(next != null) next.prev = prev == null ? null : prev;
        if(prev != null) prev.next = next == null ? null : next;
        next = prev = null;     // this might be an overkill - disposable?
    }
}