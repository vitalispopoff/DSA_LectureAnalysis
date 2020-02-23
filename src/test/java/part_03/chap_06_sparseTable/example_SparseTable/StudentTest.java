package part_03.chap_06_sparseTable.example_SparseTable;

import org.junit.*;

public class StudentTest {

    //    @Ignore
    @Test
    public void isEmpty_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertTrue(Student.isEmpty());
    }

    //    @Ignore
    @Test
    public void isEmpty_02() {
        Student.studentHead = Student.studentTail = new Student("a", "a");
        Assert.assertFalse(Student.isEmpty());
    }

    //    @Ignore
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

    @Ignore
    @Test   //  for empty list
    public void isInList_01() {
        Student.studentHead = null;
        Student student = new Student("a", "a");
        Assert.assertFalse(student.isInList());
    }

    @Ignore
    @Test   // single-item list
    public void isInList_02() {
        Student student = Student.studentHead = new Student("a", "a");
        Assert.assertTrue(student.isInList());
    }

    @Ignore
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
    public void findNearest_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertEquals(null, Student.findNearest("a", "a"));
    }

    //    @Ignore
    @Test
    public void findNearest_02() {
        Student
                a = new Student("a", "a"),
                b = Student.studentHead = Student.studentTail = new Student("b", "b"),
                c = new Student("c", "c");


        Assert.assertEquals(b, Student.findNearest("a", "a"));
        Assert.assertEquals(null, Student.findNearest("c", "c"));
    }

    //    @Ignore
    @Test
    public void findNearest_03() {
        Student
                a = Student.studentHead = new Student("a", "a"),
                c = new Student("c", "c"),
                e = Student.studentTail = new Student("e", "e");
        a.next = e.prev = c;
        c.prev = a;
        c.next = e;

        Assert.assertEquals(c, Student.findNearest("b", "b"));
        Assert.assertEquals("c", Student.findNearest("c", "c").lastName);
        Assert.assertEquals(c, Student.findNearest("c", "c"));
        Assert.assertEquals("e", Student.findNearest("d", "d").lastName);
        Assert.assertEquals(e, Student.findNearest("d", "d"));
    }

    //    @Ignore
    @Test
    public void addToList_01() {
        Student.studentHead = Student.studentTail = null;
        Assert.assertSame(
                Student.addToList("a", "a"),
                Student.studentHead);
    }

    //    @Ignore
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
        Assert.assertEquals(s2.lastName, s3.prev.lastName);
    }

    /*
    @Ignore
    @Test
    public void removeGrades_01() {
        Student
                s1 = Student.studentHead = new Student("a", "a"),
                s2 = new Student("b", "b"),
                s3 = Student.studentTail = new Student("c", "c");
        {
            s1.next = s3.prev = s2;
            s2.prev = s1;
            s2.next = s3;
        }
        Lecture
                L1 = Lecture.lectureHead = new Lecture("A", "A"),
                L2 = new Lecture("B", "B"),
                L3 = Lecture.lectureTail = new Lecture("C", "C");
        {
            L1.next = L3.prev = L2;
            L2.prev = L1;
            L2.next = L3;
        }
        Grade
                s1L1 = s1.gradeHead = L1.gradeHead = L1.gradeTail = new Grade(1),
                s1L2 = L2.gradeHead = new Grade(2),
                s1L3 = s1.gradeTail = L3.gradeHead = new Grade(8),

                s2L2 = s2.gradeHead = L2.gradeTail = new Grade(5),
                s2L3 = s3.gradeHead = s2.gradeTail = L3.gradeTail = new Grade(6),

                s3L3 = s3.gradeHead = s3.gradeTail = L3.gradeTail = new Grade(9);
        {
            s1L1.nextLectureGrade = s1L3.prevLectureGrade = s2L2.prevStudentGrade = s1L2;
            s1L2.prevLectureGrade = s1L1;
            s1L2.nextLectureGrade = s1L3;
            s1L2.nextStudentGrade = s2L2;

            s2L2.nextLectureGrade = s2L3;
            s2L3.prevLectureGrade = s2L2;

            s1L3.nextStudentGrade = s3L3.prevStudentGrade = s2L3;
            s2L3.prevStudentGrade = s1L3;
            s2L3.nextStudentGrade = s3L3;
        }

        Assert.assertNull(s2L2.prevLectureGrade);
        Assert.assertNull(s2.gradeHead.nextStudentGrade);
        Assert.assertNull(s2L3.nextLectureGrade);
        Assert.assertSame(s2L2, s2.gradeHead);
        Assert.assertSame(s2L3.value, s2.gradeTail.value);
        Assert.assertSame(s1L2, s2.gradeHead.prevStudentGrade);
        Assert.assertSame(s1L3, s2.gradeTail.prevStudentGrade);
        Assert.assertSame(s3L3, s2.gradeTail.nextStudentGrade);

        s2.removeGrades();
        Assert.assertNull(s2.gradeHead);
//        Assert.assertEquals(2, L2.gradeTail.value);           // TODO no rewiring tails and heads
//        Assert.assertEquals(9, L3.gradeHead.nextStudentGrade.value);
//        Assert.assertEquals(6, s2.gradeHead.value);
//        Assert.assertSame(s3L3, L3.gradeHead.nextStudentGrade);
//        Assert.assertSame(s1L3, L3.gradeTail.prevStudentGrade);
    }

    @Ignore
    @Test
    public void removeStudent_01() {
        Student s = new Student("a", "a");

//        s.removeStudent();
        Assert.assertEquals(null, Student.studentHead);
    }*/
}
