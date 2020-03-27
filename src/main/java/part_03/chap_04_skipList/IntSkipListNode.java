package part_03.chap_04_skipList;

public class IntSkipListNode {

    public int key;
    public IntSkipListNode[] next;

    public IntSkipListNode(int key, int n) {
        this.key = key;
        this.next = new IntSkipListNode[n];
        for (int j = 0; j < n; j++) next[j] = null;
    }

    public static void main(String[] args) {}
}