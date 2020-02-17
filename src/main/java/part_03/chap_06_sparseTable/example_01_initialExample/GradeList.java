package part_03.chap_06_sparseTable.example_01_initialExample;

public class GradeList {

    Grade head = null, tail = null;

    boolean isEmpty() {
        return head == null;
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

    public static void main(String[] args){
    }




}


