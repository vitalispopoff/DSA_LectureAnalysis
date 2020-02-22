package part_03.chap_06_sparseTable.example_SparseTable;

import org.junit.*;

public class StudentTest {

    @Test
    public void isEmpty_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertTrue(Student.isEmpty());
    }

    @Test
    public void isEmpty_02() {
        Student.studentHead = Student.studentTail = new Student("a", "a");
        Assert.assertFalse(Student.isEmpty());
    }

    @Test
    public void compareStudents_01() {
        Student
                s1 = new Student("a", "a"),
                s2 = new Student("a", "b"),
                s3 = new Student("aa", "a"),
                s4 = new Student("a", "a");
        Assert.assertTrue(s1.compareStudents(s2) < 0);
        Assert.assertTrue(s2.compareStudents(s1) > 0);
        Assert.assertTrue(s1.compareStudents(s3) < 0);
        Assert.assertEquals(0, s1.compareStudents(s4));
    }

    @Test   //  for empty list
    public void isInList_01() {
        Student.studentHead = null;
        Student student = new Student("a", "a");
        Assert.assertFalse(student.isInList());
    }

    @Test   // single-item list
    public void isInList_02() {
        Student student = Student.studentHead = new Student("a", "a");
        Assert.assertTrue(student.isInList());
    }

    @Test // multi-item list
    public void isInList_03() {
        Student s1, s2, s3, s4;
        s1 = Student.studentHead = new Student("a", "a");
        s2 = s1.next = new Student("b", "b");
        s3 = s2.next = new Student("c", "c");
        s4 = s3.next = Student.studentTail = new Student("d", "d");

        Assert.assertTrue(s4.isInList());
        Assert.assertTrue(s3.isInList());
        Assert.assertFalse(new Student("b", "c").isInList());

    }

//    @Ignore
    @Test
    public void addToList_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertSame(
                Student.addToList("a", "a"),
                Student.studentHead);
    }

    @Ignore
    @Test
    public void addToList_02() {
        Student
                s1 = Student.studentHead = new Student("a", "a"),
                s3 = Student.studentTail = new Student("c", "c"),
                s2 = Student.addToList("b", "b");

        s3.prev = Student.studentHead = s1;
        s1.next = Student.studentTail = s3;
        Assert.assertEquals(s2, s1.next);
        Assert.assertEquals(s2, s3.prev);
    }
}
