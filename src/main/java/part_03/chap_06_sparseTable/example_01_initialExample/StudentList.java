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

    public Student addBehind(String lastName, String firstName, Student student) {
        Student result = new Student(lastName, firstName, student, student.next);
        if (result.prev == tail) tail = result;
        else result.next.prev = result;
        result.prev.next = result;
        return result;
    }

    public Student addToList(String lastName, String firstName) {
        Student result = null;

        if (isEmpty()) head = tail = result = new Student(lastName, firstName, null, null);
        else {
            Student counter = head;
            for (;
                 counter != null && counter.personalDetails.compareToIgnoreCase(result.personalDetails) < 0;
                 counter = counter.next);
            if (counter == null) result = addToTail(lastName, firstName);
            else result = addBehind(lastName, firstName, counter);
        }

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

    public Student findStudent(String lastName) {
        return findStudent(lastName, null);
    }


    public static void main(String[] args) {
        String dupa = "b";
        System.out.println(dupa.compareToIgnoreCase("a"));
    }
}
