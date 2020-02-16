package part_03.chap_06_sparseTable.example_01_initialExample;

import org.junit.*;

public class GradeListTest {

    @Test
    public void isEmptyTest_01() {
        GradeList list = new GradeList();
        Assert.assertTrue(list.isEmpty());
    }
}
