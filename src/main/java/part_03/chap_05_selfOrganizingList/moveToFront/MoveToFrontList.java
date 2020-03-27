package part_03.chap_05_selfOrganizingList.moveToFront;

public class MoveToFrontList {

    MoveToFrontNode
            head,
            tail;

    public MoveToFrontList() {
        head = tail = null;
    }

    public void add(int element) {
        MoveToFrontNode temp = new MoveToFrontNode(element);
        if (isEmpty())
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean search(int element) {
        boolean result = false;

        if (!isEmpty()) {
            MoveToFrontNode cacheCurr = head, cachePrev = head;

            for (; cacheCurr != tail & cacheCurr.info != element; cachePrev = cacheCurr, cacheCurr = cacheCurr.next) ;

            if (cacheCurr.info == element) {
                if (cacheCurr == head) ;

                else if (cacheCurr == tail) {
                    cacheCurr.next = head;
                    head = cacheCurr;
                    cachePrev.next = null;
                    tail = cachePrev;
                } else {
                    cachePrev.next = cacheCurr.next;
                    cacheCurr.next = head;
                    head = cacheCurr;
                }
                result = true;
            }
        }
        return result;
    }

    public void remove(int element) {
        if (!isEmpty()) {
            MoveToFrontNode cacheCurr = head, cachePrev = head;

            for (; cacheCurr != tail & cacheCurr.info != element; cachePrev = cacheCurr, cacheCurr = cacheCurr.next) ;

            if (cacheCurr.info == element) {
                if (cacheCurr == head) head = head.next;
                else if (cacheCurr == tail) {
                    tail = cachePrev;
                    tail.next = null;
                } else cachePrev.next = cacheCurr.next;
            }
        }
    }

    public void printAll() {
        if (isEmpty()) System.out.println("empty");
        else {
            MoveToFrontNode counter = head;
            for (; counter != tail; counter = counter.next)
                System.out.print(counter.info + " ");
            System.out.println(counter.info);
        }
    }

    public static void main(String[] args) {

        MoveToFrontList list = new MoveToFrontList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
    }
}