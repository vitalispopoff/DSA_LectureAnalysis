package part_03.chap_02_doubleLinkedList;

public class DoubleLinkList_02 {
/*  // exercise: exploiting decorator pattern in a double linked list

    static int
            mainId = 0;
    int
            id;
    static DoubleLinkList_02
            head = null,
            tail = null;

    public DoubleLinkList_02() {
        id = mainId++;
    }

    public DoubleLinkList_02(DoubleLinkList_02 d, ListEnd end) {
        this();
        end.operate(this, d);
    }

    public DoubleLinkList_02(DoubleLinkList_02 d) {
        this(d, ListEnd.HEAD);
    }

    public int getId() {
        return id;
    }

    enum ListEnd {
        HEAD {
            @Override
            void operate(DoubleLinkList_02 newHead, DoubleLinkList_02 oldHead) {
                oldHead.head = newHead;
                newHead.tail = oldHead;
            }
        },

        TAIL {
            @Override
            void operate(DoubleLinkList_02 newTail, DoubleLinkList_02 oldTail) {
                oldTail.tail = newTail;
                newTail.head = oldTail;
            }
        };

        abstract void operate(DoubleLinkList_02 d1, DoubleLinkList_02 d2);
    }

//  main method //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

    public static void main(String[] args) {

        DoubleLinkList_02
                list = new DoubleLinkList_02(),
                cache;

        for (int i = 0; i < 4; i++)
            {list = new DoubleLinkList_02(list, ListEnd.HEAD);}

        for (cache = list; cache != null; cache = cache.tail);



    }
*/

}