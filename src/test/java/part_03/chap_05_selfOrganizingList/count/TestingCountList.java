package part_03.chap_05_selfOrganizingList.count;

public interface TestingCountList {

    /**
     * checks adding to an empty list
     */
    public void addTest_01();

    /**
     * checks adding to list:
     * conditions of a single-item list
     */
    public void addTest_02();

    /**
     * checks adding to list:
     * conditions of a multi-item list:
     * head, linked-to-head, linked-to-tail
     */
    public void addTest_03();

    /**
     * Checks whether list is empty:
     * answers for empty
     */
    public void isEmptyTest_01();

    /**
     *  checks searching the list:
     *  result for the head.
     */
    public void isInListTest_01();

    /**
     * checks searching the list:
     * result for not-in-the-list
     */
    public void isInListTest_02();

    /**
     * checks searching the list:
     * counter property before and after searching
     */
    public void isInListTest_03();

    /**
     * item counter property for empty list
     */
    public void isPrevCounterMinorTest_01();

    /**
     *  item counter property for a single-item list
     *  before and after searching
     */
    public void isPrevCounterMinorTest_02();

    /**
     *  counter property of an item inside a multi-item list
     *  before and after searching
     */
    public void isPrevCounterMinorTest_03();

    /**
     *  counter property and swapping items while searching the list
     *  three element list
     */
//    public void isInList_04();

    public void toStringTest_01();

    public void toStringTest_02();

    public void toStringTest_03();
}
