package part_03.chap_05_selfOrganizingList.count;

import org.junit.*;

public class CountListTest implements TestingCountList {


    @Test
    public void isEmptyTest_01() {
        CountList list = new CountList();

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void addTest_01() {
        CountList list = new CountList();
        list.add(0);

        Assert.assertEquals(0, list.head.info);
    }

    @Test
    public void addTest_02() {
        CountList list = new CountList();
        list.add(0);

        Assert.assertTrue(list.head == list.tail);
        Assert.assertFalse(list.head == null);
    }

    @Test
    public void addTest_03() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;

        Assert.assertEquals(0, list.head.info);
        Assert.assertEquals(1, list.head.next.info);
        Assert.assertTrue(list.tail.next == null);
    }

    @Test
    public void isInListTest_01() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;

        Assert.assertTrue(list.isInList(0));
    }

    @Test
    public void isInListTest_02() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;

        Assert.assertFalse(list.isInList(3));
    }

    @Test
    public void isInListTest_03() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;
        CountNode node = list.head.next;

        Assert.assertEquals(0, node.counter);
        Assert.assertTrue(list.isInList(node.info));
        Assert.assertEquals(1, node.counter);
    }

    @Test
    public void isPrevCounterMinorTest_01() {
        CountList list = new CountList();

        Assert.assertFalse(list.isPrevCounterMinor(list.head));
    }

    @Test
    public void isPrevCounterMinorTest_02() {
        CountList list = new CountList();
        list.add(0);
        CountNode node = list.head;

        Assert.assertFalse(list.isPrevCounterMinor(node));
        list.isInList(0);
        Assert.assertFalse(list.isPrevCounterMinor(node));
    }

    @Ignore
    @Test
    public void isPrevCounterMinorTest_03() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;
        CountNode node = new CountNode(1);
        node.next = list.head.next.next;
        node.prev = list.head.next.prev;
        list.head.next = node;

        Assert.assertFalse(list.isPrevCounterMinor(node));
        list.isInList(node.info);
        Assert.assertTrue(list.isPrevCounterMinor(node));
    }


    @Test
    public void swapTest_01() {
        CountList list = new CountList();
        CountNode node_1 = new CountNode(0);
        CountNode node_2 = new CountNode(1);
        CountNode node_3 = new CountNode(2);
        node_2.prev = list.head = node_1;
        node_2.next = list.tail = node_3;
        list.head.next = list.tail.prev = node_2;

        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(node_1);
        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(list.head);
        Assert.assertEquals("[0, 1, 2]", list.toString());
    }

    @Test
    public void swapTest_02() {
        CountList list = new CountList();
        CountNode node_1 = new CountNode(0);
        CountNode node_2 = new CountNode(1);
        CountNode node_3 = new CountNode(2);
        node_2.prev = list.head = node_1;
        node_2.next = list.tail = node_3;
        list.head.next = list.tail.prev = node_2;

        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(node_2);
        Assert.assertEquals("[1, 0, 2]", list.toString());
    }


    static CountList list_03 = new CountList();

    @Ignore
    @Test
    public void toStringTest_01() {
        Assert.assertEquals("[]", list_03.toString());
    }

    @Ignore
    @Test
    public void toStringTest_02() {
        list_03.add(0);
        Assert.assertEquals("[0]", list_03.toString());
    }

    @Ignore
    @Test
    public void toStringTest_03() {
        list_03.add(1);
        Assert.assertEquals("[0, 1]", list_03.toString());
    }
}
