package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

@Ignore
public class GradeListTest {

    @Test
    public void isEmptyTest_01() {
        GradeList list = new GradeList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isInListTest_01(){
        GradeList list = new GradeList();
        Grade grade = new Grade();

        Assert.assertFalse(list.isInList(grade));
    }

    @Test
    public void isInListTest_02(){
        GradeList list = new GradeList();
        Grade grade = list.head = list.tail = new Grade();

        Assert.assertTrue(list.isInList(grade));
    }

}
