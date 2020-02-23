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

    @Test
    public void findNearest_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertEquals(null, Student.findNearest("a", "a"));
    }

    @Test
    public void findNearest_02() {
        Student
                a = new Student("a", "a"),
                b = Student.studentHead = Student.studentTail = new Student("b", "b"),
                c = new Student("c", "c");


        Assert.assertEquals(b, Student.findNearest("a", "a"));
        Assert.assertEquals(null, Student.findNearest("c", "c"));
    }

    @Test
    public void findNearest_03() {
        Student
                a = Student.studentHead = new Student("a", "a"),
                c = new Student("c", "c"),
                e = Student.studentTail = new Student("e", "e");
        a.next = e.prev= c;
        c.prev = a;
        c.next = e;

        Assert.assertEquals(c, Student.findNearest("b", "b"));
        Assert.assertEquals(c, Student.findNearest("c", "c"));
        Assert.assertEquals("e", Student.findNearest("d", "d").lastName);
        Assert.assertEquals(e, Student.findNearest("d", "d"));
    }

    @Test
    public void addToList_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertSame(
                Student.addToList("a", "a"),
                Student.studentHead);
    }

    @Test
    public void addToList_02() {
        Student
                s1 = Student.studentHead = new Student("a", "a"),
                s3 = Student.studentTail = new Student("c", "c"),
                s2;
        s3.prev = s1;
        s1.next = s3;
        s2 = Student.addToList("b", "b");

        Assert.assertEquals(s2, s1.next);
//        Assert.assertEquals(s2, s3.prev);
    }

    @Ignore
    @Test
    public void removeGrades_01() { }

    @Test
    public void removeStudent_01(){
        Student s = new Student("a", "a");

        s.removeStudent();
        Assert.assertEquals(null, Student.studentHead);


    }
}
