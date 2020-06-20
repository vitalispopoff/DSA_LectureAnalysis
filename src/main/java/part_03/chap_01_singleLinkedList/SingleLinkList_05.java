package part_03.chap_01_singleLinkedList;

public class SingleLinkList_05 {

    static int mainId = 0;
    SingleLinkList_05 next = null;
    int id;

    SingleLinkList_05() {
//        next = null;
        setId();
    }

    SingleLinkList_05(SingleLinkList_05 next) {
        this();
        this.next = next;
    }

    public void removeNext() {
        SingleLinkList_05 cache = next;
        next = cache.next;
        cache.next = null;
    }

    public SingleLinkList_05 getNext() {
        return next;
    }

    void setId() {
        id = mainId++;
    }

    public int getId() {
        return id;
    }

//  main method //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

    public static void main(String[] args) {

        SingleLinkList_05 list = new SingleLinkList_05();

        for (int i = 0; i < 2; i++)
            list = new SingleLinkList_05(list);

        for (SingleLinkList_05 i = list; i != null; i = i.getNext())
            System.out.println(i.getId());
    }
}