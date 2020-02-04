package part_03.chap_01_singleLinkedList;

public class SingleLinkList_02 extends SingleLinkList_01 {

    @Override
    public int deleteFromHead() throws NullPointerException {
        if (!isEmpty()) {
            int element = head.info;
            if (head == tail)
                head = tail = null;
            else head = head.next;
            return element;
        } else return 0;
    }

    public static void main(String[] args) {

        SingleLinkList_02 list = new SingleLinkList_02();

        System.out.println(list.deleteFromHead());
    }
}
