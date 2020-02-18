package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

public class LectureTest {

    @Test
    public void isEmpty_01() {
        Assert.assertTrue(Lecture.isEmpty());
    }

    @Test
    public void isEmpty_02() {
        Lecture.lectureHead = Lecture.lectureTail = new Lecture("a", "a");
        Assert.assertFalse(Lecture.isEmpty());
    }

    @Test
    public void compareLectures_01() {
        Lecture
                L1 = new Lecture("a", "a"),
                L2 = new Lecture("a", "b"),
                L3 = new Lecture("aa", "a"),
                L4 = new Lecture("a", "a");
        Assert.assertTrue(L1.compareLectures(L2) < 0);
        Assert.assertTrue(L2.compareLectures(L1) > 0);
        Assert.assertTrue(L1.compareLectures(L3) < 0);
        Assert.assertEquals(0, L1.compareLectures(L4));
    }

    @Test   // single-item list
    public void isInList_02() {
        Lecture lecture = Lecture.lectureHead = new Lecture("a", "a");
        Assert.assertTrue(lecture.isInList());
    }

//    @Ignore
    @Test // multi-item list
    public void isInList_03() {
        Lecture
                L4 = Lecture.lectureTail = new Lecture("d", "d"),
                L3 = new Lecture("c", "c", null, L4),
                L2 = new Lecture("b", "b", null, L3),
                L1 = Lecture.lectureHead = new Lecture("a", "a", null, L2);
        Assert.assertTrue(L4.isInList());
        Assert.assertTrue(L3.isInList());
        Assert.assertFalse(new Lecture("b", "c").isInList());

    }
}
