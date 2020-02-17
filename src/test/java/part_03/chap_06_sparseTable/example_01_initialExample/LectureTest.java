package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

//@Ignore
public class LectureTest {

    @Test
    public void matchLectureTest_01() {
        Lecture lecture = new Lecture("gramatyka opisowa łaciny", "lat202");
        Assert.assertTrue(lecture.matchLecture("gramatyka opisowa opisowa łaciny", "lat202"));
        Assert.assertFalse(lecture.matchLecture("gramatyka opisowa opisowa łaciny", "lat201"));
        Assert.assertTrue(lecture.matchLecture("gramatyka opisowa łaciny"));
        Assert.assertFalse(lecture.matchLecture("gramatyka opisowa"));
        Assert.assertTrue(lecture.matchLecture(null, "lat202"));

    }

    @Test
    public void compareToTest_01() {
        Lecture L1 = new Lecture("lcta", "L1"),
                L2 = new Lecture("lctb", null),
                L3 = new Lecture("lctc", "L3"),
                L4 = new Lecture("lctb", "L2"),
                L5 = new Lecture("lctb", null);

        Assert.assertTrue(L1.compareTo(L2) < 0);
        Assert.assertTrue(L3.compareTo(L2) > 0);
        Assert.assertTrue(L1.compareTo(L3) < 0);

        Assert.assertTrue(L4.compareTo(L2) == 0);
        Assert.assertTrue(L5.compareTo(L2) == 0);

    }


}
