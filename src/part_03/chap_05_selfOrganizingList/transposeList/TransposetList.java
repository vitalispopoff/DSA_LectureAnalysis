package part_03.chap_05_selfOrganizingList.transposeList;

import static part_0.Temporal.bln;

public class TransposetList {

    protected TransposeNode head, tail;

    public TransposetList() {
        head = tail = null;
    }

    public void add(int element) {
        TransposeNode temp = new TransposeNode(element);
        if (isEmpty()) head = tail = temp;
        else if (head.info == tail.info) {
            tail = temp;
            head.next = tail;
            tail.prev = head;

        } else {
            temp.prev = tail.prev;  // temporal linked to one but last
            tail.prev.next = temp;  // one but last relinked to temporal
            temp.next = tail;       //  temporal linked to tail
            tail.prev = temp;       // tail relinked to temporal
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean search(int element) {
        if (isEmpty()) return false;
        else if (head == tail & tail.info == element) return true;
        else if (tail.info == element) {
            tail.swapInfo(tail.prev);
            return true;
        } else {
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

    public void printAll() {

        if (isEmpty()) System.out.println("empty");
        else if (head == tail) System.out.println(head.info);
        else {
            for (TransposeNode counter = head; counter != tail; counter = counter.next)
                System.out.print(counter.info + " ");
            System.out.print(tail.info);
        }

    }

    public static void main(String[] args) {

        TransposetList list = new TransposetList();
        list.add(0);
        list.add(3);
        list.add(1);
        list.add(2);

        list.printAll();
        bln();
        /*list.remove(2);
        list.printAll();
        bln();*/
        list.search(2);
        list.printAll();


    }
}
