package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

//@Ignore
public class LectureTest {

    @Test
    public void matchLectureTest_01(){
        Lecture lecture = new Lecture("gramatyka opisowa łaciny", "lat202");
        Assert.assertTrue(lecture.matchLecture("gramatyka opisowa opisowa łaciny", "lat202"));
        Assert.assertFalse(lecture.matchLecture("gramatyka opisowa opisowa łaciny", "lat201"));
        Assert.assertTrue(lecture.matchLecture("gramatyka opisowa łaciny"));
        Assert.assertFalse(lecture.matchLecture("gramatyka opisowa"));
        Assert.assertTrue(lecture.matchLecture(null, "lat202"));

    }

    @Test
    public void compareToTest_01(){

    }
}
