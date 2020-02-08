package part_03.chap_05_selfOrganizingList.transposeList;

public class TransposetList {

    protected TransposeNode head, tail;

    public TransposetList() {
        head = tail = null;
    }

    public void add(int element) {
        TransposeNode temp = new TransposeNode(element);
        if (isEmpty())
            head = tail = temp;
        else {
            tail = temp;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean search(int element) {
        if (isEmpty()) return false;
        else if (head == tail & tail.info == element) return true;
        else {
            TransposeNode temp = head, cache = null;

            for (; temp != tail; cache = temp, temp = temp.next)
                if (temp.info == element) {

                    temp.swapInfo(cache);
                    return true;
                }
            return false;
        }
    }

    public void remove(int element) {

        if (isEmpty()) return;
        else if (head.info == element) head = head.next;
        else {
            TransposeNode temp = head, cache = null;

            for (; temp != tail; cache = temp, temp = temp.next)
                if (temp.info == element) {

                    if (temp == tail) {
                        cache.next = null;
                        tail = cache;
                    } else cache.next = temp.next;
                }
        }
    }


}
