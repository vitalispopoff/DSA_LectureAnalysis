package part_03.chap_06_sparseTable.example_01_initialExample;

public class GradeList {

    Grade head = null, tail = null;

    boolean isEmpty() {
        return head == null;
    }

    Grade add(int value, Student student, Lecture lecture) {

        Grade result = new Grade(value, student, lecture);

        if (isEmpty()) head = tail = result;
        else {
            Grade counter = student.gradesOfTheStudent.head;

            for (; counter.lecture != null && counter.lecture.shortCut.compareToIgnoreCase(lecture.shortCut) < 0;
                 counter = counter.nextStudent) ;
            if (counter.lecture == null) {
                result.prevLecture = tail;
                tail = result;
            } else if (counter.lecture.shortCut.compareToIgnoreCase(lecture.shortCut) > 0){
                result.prevLecture = counter.prevLecture;
                result.nextLecture = counter;
                result.prevLecture.nextLecture = result.nextLecture.prevStudent = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }

}


