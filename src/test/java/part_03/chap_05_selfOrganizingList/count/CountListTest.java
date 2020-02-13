package part_03.chap_05_selfOrganizingList.count;

import org.junit.*;

public class CountListTest /*implements TestingCountList*/ {

    //    @Ignore
    @Test
    public void addTest_01() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertEquals(0, list.head.info);
    }

    //    @Ignore
    @Test
    public void addTest_02() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertTrue(list.head == list.tail);
        Assert.assertFalse(list.head == null);
    }

    //    @Ignore
    @Test
    public void addTest_03() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;
        Assert.assertEquals(0, list.head.info);
        Assert.assertEquals(1, list.head.next.info);
        Assert.assertTrue(list.tail.next == null);
    }

    //    @Ignore
    @Test
    public void isEmptyTest_01() {
        CountList list = new CountList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isPrevCounterMinorTest_01() {
        CountList list = new CountList();
        CountNode node = list.add(0);
        Assert.assertFalse(list.isPrevCounterMinor(node));
    }

    @Test
    public void isPrevCounterMinorTest_02() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
        Assert.assertFalse(list.isPrevCounterMinor(list.head));
        Assert.assertFalse(list.isPrevCounterMinor(list.head.next));
        Assert.assertFalse(list.isPrevCounterMinor(list.tail));
        list.head.next.counter++;
        Assert.assertTrue(list.isPrevCounterMinor(list.head.next));

    }

    @Test
    public void swapTest_01() {
        CountList list = new CountList();
        Assert.assertNull(list.swap(list.head));
    }

    @Test
    public void swapTest_02() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
//        list.tail.counter++;
        Assert.assertEquals("[0, 1]", list.toString());
        list.swap(list.tail);
        Assert.assertEquals("[1, 0]", list.toString());

    }

    @Test
    public void swapTest_03(){
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) ;
        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(list.tail.prev);
        Assert.assertEquals("[1, 0, 2]", list.toString());

    }

    @Test
    public void swapTest_04(){
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) ;
        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(list.tail);
        Assert.assertEquals("[0, 2, 1]", list.toString());
    }

    @Test
    public void swapTest_05() {
        CountList list = new CountList();
        for (int i = 0; i < 4; list.add(i++)) ;
//        list.tail.prev.counter++;

        Assert.assertEquals("[0, 1, 2, 3]", list.toString());
        list.swap(list.tail.prev);
        Assert.assertEquals("[0, 2, 1, 3]", list.toString());


//        Assert.assertSame(list.head.next.prev, list.head);
//        Assert.assertSame(list.tail.prev.prev, list.head);
//        Assert.assertSame(list.head.next.next, list.tail);


//        Assert.assertEquals("[0, 2, 1, 3]", list.toString());
    }


    //    @Ignore
    @Test
    public void toStringTest_01() {
        CountList list = new CountList();
        Assert.assertEquals("[]", list.toString());
    }

    //    @Ignore
    @Test
    public void toStringTest_02() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertEquals("[0]", list.toString());
    }

    //    @Ignore
    @Test
    public void toStringTest_03() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
        Assert.assertEquals("[0, 1]", list.toString());
    }
}
