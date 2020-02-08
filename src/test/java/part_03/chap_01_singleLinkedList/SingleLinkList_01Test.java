package part_03.chap_01_singleLinkedList;

import org.junit.*;

public class SingleLinkList_01Test {

    static SingleLinkList_01 list_01 = new SingleLinkList_01();

    @Test
    public void SingleLinkListTest_01() {
        Assert.assertTrue(list_01.head == list_01.tail);
    }

    @Test
    public void isEmptyTest_01() {
        Assert.assertTrue(list_01.isEmpty());
    }

    static SingleLinkList_01 list_02 = new SingleLinkList_01();

    static {
        list_02.addToHead(0);
    }

    @Test
    public void SingleLinkListTest_02() {
        Assert.assertTrue(list_02.head == list_02.tail);
        Assert.assertTrue(list_02.head.info == 0);
    }

    @Test
    public void addToHeadTest_01() {
        Assert.assertEquals(0, list_02.head.info);
    }

    static SingleLinkList_01 list_03 = new SingleLinkList_01();

    static {
        list_03.addToHead(0);
        list_03.addToHead(1);
    }

    @Test
    public void addToHeadTest_02() {
        Assert.assertFalse(list_03.head == list_03.tail);
        Assert.assertTrue(list_03.head.next == list_03.tail);
        Assert.assertTrue(list_03.tail.info == 0);
    }


    static SingleLinkList_01 list_04 = new SingleLinkList_01();

    static {
        list_04.addToTail(0);
        list_04.addToTail(1);
    }

    @Test
    public void addToTailTest_01(){
        Assert.assertEquals(0, list_04.head.info);
        Assert.assertEquals(1, list_04.tail.info);
}

@Test
    public void deleteFromHeadTest_01(){
        list_04.deleteFromHead();
            Assert.assertTrue(list_04.head.info==1);
    }
}