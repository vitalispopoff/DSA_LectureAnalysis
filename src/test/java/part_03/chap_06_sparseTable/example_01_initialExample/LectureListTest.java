package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

//@Ignore
public class LectureListTest {


    @Test
    public void addToTailTest_01() {
        LectureList list = new LectureList();
        Lecture lecture = list.addToTail("gramatyka opisowa łaciny");
        Assert.assertSame(list.head, lecture);
        Assert.assertSame(list.tail, lecture);
        Assert.assertNull(list.tail.next);
    }

    @Test
    public void addToTailTest_02() {
        LectureList list = new LectureList();
        list.addToTail("gramatyka opisowa łaciny");
        Assert.assertEquals("gramatyka opisowa łaciny", list.head.name);
        Assert.assertNull(list.head.shortCut);
    }

    @Test
    public void addToTailTest_03() {
        LectureList list = new LectureList();
        Lecture lecture = list.addToTail("gramatyka opisowa łaciny", "lat202");
        Assert.assertSame(lecture, list.head);
        Assert.assertEquals("lat202", list.head.shortCut);
    }

    @Test
    public void isEmptyTest_01(){
        LectureList list = new LectureList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyTest_02(){
    LectureList list = new LectureList();
    list.addToTail("lecture");
    Assert.assertFalse(list.isEmpty());
    }
}
