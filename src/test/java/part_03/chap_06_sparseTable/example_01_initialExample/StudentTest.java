package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

public class StudentTest {

    @Ignore
    @Test   // TODO needs redesign
    public void matchStudentTest_01(){
        Student student = new Student("nazwisko", "imię");
        Assert.assertTrue(student.matchStudent("nazwisko", "imię"));
        Assert.assertFalse(student.matchStudent("nazwisko"));
        Assert.assertFalse(student.matchStudent("imię"));
    }

    @Test
    public void compareToTest_01(){
        Student s1 = new Student("nazwisko", "imię"),
                s2 = new Student("nazwisko1", "imię"),
                s3 = new Student("nazwisko", "imię1");
        Assert.assertTrue(s1.compareTo(s2)<0);
        Assert.assertTrue(s1.compareTo(s3)<0);
        Assert.assertEquals(0, s1.compareTo(new Student("nazwisko", "imię")));
    }
}
