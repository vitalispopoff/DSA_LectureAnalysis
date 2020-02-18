package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

public class StudentTest {

    @Test
    public void isEmpty_01() {
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
    public void isInList_01(){
        Student.studentHead = null;
        Student student = new Student("a", "a");
        Assert.assertFalse(student.isInList());
    }

    @Test   // single-item list
    public void isInList_02(){
        Student student = Student.studentHead = new Student("a", "a");
        Assert.assertTrue(student.isInList());
    }

    @Test // multi-item list
    public void isInList_03(){
        Student
                s4 = Student.studentTail = new Student("d", "d"),
                s3 = new Student("c", "c", null, s4),
                s2 = new Student("b", "b", null, s3),
                s1 = Student.studentHead = new Student("a", "a", null, s2);
        Assert.assertTrue(s4.isInList());
        Assert.assertTrue(s3.isInList());
        Assert.assertFalse(new Student("b", "c").isInList());

    }
}
