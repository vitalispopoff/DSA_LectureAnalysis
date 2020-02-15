package part_03.chap_06_sparseTable.example_01_initialExample;

public class StudentList {

    Student head = null, tail = null;

    public Student addToTail(String lastName) {
        return addToTail(lastName, null);
    }

    public Student addToTail(String lastName, String firstName) {
        Student result = new Student(lastName, firstName, tail, null);
        tail = result;
        if (isEmpty()) head = result;
        else result.prev.next = result;
        return result;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Student findStudent(String lastName, String firstName) {
        Student result = head;
        boolean flag = true;

        while (flag) {
            if (result.matchStudent(lastName, firstName) || result == null)
                flag = false;
            else result = result.next;
        }
        return result;
    }

    public Student findStudent(String lastName){
        return findStudent(lastName, null);
    }
}
