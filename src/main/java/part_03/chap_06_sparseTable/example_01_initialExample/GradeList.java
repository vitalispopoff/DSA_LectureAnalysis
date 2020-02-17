package part_03.chap_06_sparseTable.example_01_initialExample;

public class GradeList {

    Grade head = null, tail = null;

    boolean isEmpty() {
        return head == null;
    }

    Grade addToTailByStudent(Grade grade){
        if(isEmpty())head = tail = grade;
        else{
            grade.prevStudent = tail;
            tail = grade.prevStudent.nextStudent = grade;
        }
        return grade;
    }

    Grade addToTailByLecture(Grade grade){
        if(isEmpty())head = tail = grade;
        else{
            grade.prevLecture = tail;
            tail = grade.prevLecture.nextLecture = grade;
        }
        return grade;
    }

    boolean isInList(Grade grade){
        boolean result = false;
        if(!isEmpty()){
            Grade counter = head;
            for(; counter!=null && counter!=grade; counter=counter.nextLecture);
            if(counter==grade)result=true;
        }
        return result;
    }

    Grade findNearestEntryByStudent(Grade grade){
        Grade result = head;
        for(; result.student.compareTo(grade.student)<=0;grade=grade.nextStudent);
        return result;
    }

    Grade findNearestEntryByLecture(Grade grade){
        Grade result = head;
        for(; result.lecture.compareTo(grade.lecture)<=0; grade=grade.nextLecture);
        return result;
    }

    public static void main(String[] args){
    }
}


