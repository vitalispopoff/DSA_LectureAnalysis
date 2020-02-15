package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

public class StudentTest {

    @Test
    public void matchStudentTest_01(){
        Student student = new Student("nazwisko", "imię");
        Assert.assertTrue(student.matchStudent("nazwisko", "imię"));
        Assert.assertTrue(student.matchStudent("nazwisko"));
        Assert.assertFalse(student.matchStudent("imię"));
    }
}
