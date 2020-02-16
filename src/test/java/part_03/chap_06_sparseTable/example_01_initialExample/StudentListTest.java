package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

public class StudentListTest {

    @Test
    public void addToTailTest_01() {
        StudentList list = new StudentList();
        Assert.assertSame(list.head, list.tail);
        Assert.assertNull(list.head);
    }

    @Test
    public void addToTailTest_02() {
        StudentList list = new StudentList();
        Student student = list.addToTail("nazwisko", "imię");
        Assert.assertSame(list.head, list.tail);
        Assert.assertSame(student, list.tail);
    }

    @Test
    public void addToTailTest_03() {
        StudentList list = new StudentList();
        for (int i = 0; i < 3; list.addToTail("student" + i++, null)) ;
        Student student = list.addToTail("nazwisko", "imię");
        Assert.assertSame(student, list.tail);
        Assert.assertSame(student, list.tail.prev.next);
    }

    @Test
    public void addToTailTest_04() {
        StudentList list = new StudentList();
        list.addToTail("nazwisko");
        Assert.assertNull(list.tail.firstName);
    }

    @Test
    public void addBehind(){
        StudentList list = new StudentList();
        Student s1 = list.addToTail("a","a");
        Student s2 = list.addToTail("a", "c");
        Student s3 = list.addBehind("a", "b", s1);
        Assert.assertSame(s1.next, s3);

    }

    @Test
    public void findStudentTest_01() {
        StudentList list = new StudentList();
        Student student = list.addToTail("nazwisko");
        Assert.assertSame(student, list.findStudent(student.lastName));
    }
}

