package part_03.chap_03_circularList;

public interface Circumlistable {

    boolean isEmpty();
    void addToHead(int element);
    void addToTail(int element);
    int removeFromHead();
    int removeFromTail();
    void remove(int element);
    void printAll();
    boolean isInList(int element);


}
