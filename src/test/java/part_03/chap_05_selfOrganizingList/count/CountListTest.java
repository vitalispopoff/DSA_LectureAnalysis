package part_03.chap_05_selfOrganizingList.count;

import org.junit.*;

public class CountListTest {

    static CountList list_00 = new CountList();

    @Test
    public void isEmptyTest_01() {Assert.assertTrue(list_00.isEmpty());}

    static CountList list_01 = new CountList();
    static {list_01.add(0);}

    @Test
    public void addTest_01() {Assert.assertEquals(0, list_01.head.info);}

    @Test
    public void addTest_02() {Assert.assertTrue(list_01.head == list_01.tail);}

    static CountList list_02 = new CountList();
    static {
        for (int i = 0; i < 2; i++) list_02.add(i*2);
        CountNode node = new CountNode(1);
        node.prev = list_02.head;
        node.next = list_02.head.next;
        list_02.head.next = list_02.tail.prev = node;
    }

    @Test
    public void addTest_03(){Assert.assertEquals(0, list_02.head.info);}

    @Test
    public void addTest_04(){Assert.assertEquals(2, list_02.tail.info);}

    @Test
    public void addTest_05(){Assert.assertEquals(1, list_02.tail.prev.info);}

    @Test
    public void isInListTest_01(){
        Assert.assertFalse(list_02.isInList(3));
    }

    @Test
    public void isInListTest_02(){

    }


    @Test
    public void isInList_02(){
        Assert.assertEquals(0, list_02.head.next.counter);
        Assert.assertTrue(list_02.isInList(1));
        Assert.assertEquals(1, list_02.head.next.counter);
    }

    static CountList list_03 = new CountList();

    @Test
    public void toStringTest_01(){
        Assert.assertEquals("[]", list_03.toString());
    }

    @Test
    public void toStringTest_02(){
        list_03.add(0);
        Assert.assertEquals("[0]", list_03.toString());
    }

    @Test
    public void toStringTest_03(){
        list_03.add(1);
        Assert.assertEquals("[0, 1]", list_03.toString());
    }
}
