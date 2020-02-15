package part_03.chap_06_sparseTable.example_01_initialExample;

public class LectureList {

    Lecture head = null, tail = null;

    public Lecture addToTail(String name) {
        return addToTail(name, null);
    }

    public Lecture addToTail(String name, String shortCut) {
        tail = new Lecture(name, shortCut);
        if(isEmpty()) head = tail;
        else tail.prev.next = tail;
        return tail;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Lecture findLecture(String name, String shortCut){
        Lecture result = head;
        boolean flag = true;

        while (flag){
            if(result.matchLecture(name, shortCut) || result == null)
                flag=false;
            else result = result.next;
        }
        return result;
    }

    public Lecture findLecture(String name){
        return findLecture(name, null);
    }




}
