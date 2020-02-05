package part_03.chap_03_circularList.unidirectional;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import part_03.chap_03_circularList.Circumlistable;

import java.sql.SQLOutput;

public class CircUniList implements Circumlistable {

    private CircUniNode tail = null;

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public void addToHead(int element) {
        CircUniNode cache = new CircUniNode(element);

        if (isEmpty()) cache.next = cache;
        else {
            cache.next = tail.next.next;
            tail.next = cache;
        }
        tail = cache;
    }

    @Override
    public void addToTail(int element) {
        CircUniNode cache = new CircUniNode(element);
        if (isEmpty()) {
            cache.next = cache;
        } else {
            cache.next = tail.next;
            tail.next = cache;
        }
        tail = cache;
    }

    @Override
    public int removeFromHead() {
        if (isEmpty()) return (int) Float.NEGATIVE_INFINITY;
        else {
            int element = tail.next.info;

            if (tail.next == tail) tail = null;
            else {
                tail.next = tail.next.next;
            }
            return element;
        }
    }

    @Override
    public int removeFromTail() {
        if (isEmpty()) return (int) Float.NEGATIVE_INFINITY;
        else {
            int element = tail.info;

            if (tail.next == tail) tail = null;
            else {
                CircUniNode counter = tail.next;

                for (; counter.next != tail; counter = counter.next) ;
                counter.next = tail.next;
                tail = counter;
            }
            return element;
        }
    }

    @Override
    public void remove(int element) {
        if (!isEmpty())
            if (tail == tail.next && tail.info == element) tail = null;
            else {
                CircUniNode temporal = tail;
                for (; temporal.next.info != element && temporal.next != tail; temporal = temporal.next) ;
                if (temporal.next == tail) tail = temporal;
                temporal.next = temporal.next.next;
            }

    }

    @Override
    public void printAll() {
        if (!isEmpty()) {
            CircUniNode counter = tail.next;
            do {
                System.out.println(counter.info + " ");
                counter = counter.next;
            } while(counter != tail.next);
        }
    }

    @Override
    public boolean isInList(int element) {
        CircUniNode temporal = tail;
        for (; temporal.next != tail; temporal = temporal.next) ;
        return temporal != null;
    }

    public static void main(String[] args) {
//        System.out.println((int) Float.NaN);

        CircUniList list = new CircUniList();

//                list.printAll();

        list.addToHead(0);
        list.addToTail(1);
        list.addToTail(2);

        list.printAll();
        /*{
            int element = 0;
            CircularNode temporal = list.tail.next;
            for (; temporal.info != element && temporal != list.tail; temporal = temporal.next) ;
            System.out.println(temporal.info);
        }*/     // remove() else>iteration test

    }
}
