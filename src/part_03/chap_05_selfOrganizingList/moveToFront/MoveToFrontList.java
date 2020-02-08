package part_03.chap_05_selfOrganizingList.moveToFront;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class MoveToFrontList {

    protected MoveToFrontNode head, tail;

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

    public void printAll() {
        if (isEmpty()) System.out.println("empty");
        else {
            MoveToFrontNode counter = head, cache = head;
            for (; cache != tail; cache = counter, counter = counter.next)
                System.out.print(counter.info + " ");
        }
    }

    public static void main(String[] args) {

        MoveToFrontList list = new MoveToFrontList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

//        System.out.println(list.tail.info);



        /*
        int i = 3;
        MoveToFrontNode cache = list.head;
        for(; cache!=list.tail & cache.info != i; cache = cache.next);
        System.out.println(cache.info);*/

//        boolean search = list.search(0);
//        System.out.println(search);
//        list.printAll();


    }
}
