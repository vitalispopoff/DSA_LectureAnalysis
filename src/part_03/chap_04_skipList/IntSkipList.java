package part_03.chap_04_skipList;

import java.util.Random;

public class IntSkipList {

    private int maxLevel;
    private IntSkipListNode[] root;
    private int[] powers;
    private Random rd = new Random();

    IntSkipList() {
        this(4);        // default maxLevel set to 4;
    }

    IntSkipList(int i) {
        maxLevel = i;
        root = new IntSkipListNode[maxLevel];
        powers = new int[maxLevel];

        for (int j = 0; j < maxLevel; j++)
            root[j] = null;
        choosePowers();
    }

    // fills the powers[] array
    void choosePowers() {
                                                                                                                        // sets last entry:
        powers[maxLevel - 1] = (2 << (maxLevel - 1)) - 1;
                                                                                                                        // iterates from one but last to the 1st:
        for (int i = maxLevel - 2, j = 0; i >= 0; i--, j++)
                                                                                                                        //subtracts an increasing power of 2 from the level above - how does it meet the 1?
            powers[i] = powers[i + 1] - (2 << j);
                                                                                                                        // power[] values estimations:
                                                                                                                        /*
        *  maxLevel = 4
        * power[3] = (2<<(4-1)) - 1 = (2<<3) - 1= 8 -1 = 7
        * i = 2, j = 0;
        *   power[2] = power[3] - (2<<0) = 7 - 1 = 6;
        *   power[1] = power[2] - (2<<1) = 6 - 2 = 4;
        *   power[0] = power[1] - (2<<2) = 4 - 4 = 0;
        *  * * *
        * maxLevel = 5, i =5-2= 3;
        * power[4] = (2<<5-1)) - 1 = (2<<4) - 1 = 16 - 1 = 15
        * power[3] = powers[4] - (2<<0) = 15 - 1 = 14
        * power[2] = powers[3] - (2<<1) = 14 - 2 = 12
        * power[1] = powers[2] - (2<<2) = 12 - 4 = 8
        * power[0] = powers[1] - (2<<3) = 8 - 8 = 0
        * */
    }

    int chooseLevel() {
        int i, r = Math.abs(rd.nextInt()) % powers[maxLevel - 1] + 1;
        for (i = 1; i < maxLevel; i++)
            if (r < powers[i])
                return i - 1;
        return i - 1;
    }

    public int skipListSearch(int key) {
        int lvl;
        IntSkipListNode prev, curr;

        for (lvl = maxLevel - 1; lvl >= 0 && root[lvl] == null; lvl--) ;
        prev = curr = root[lvl];

        while (true) {
            if (key == curr.key) return curr.key;

            else if (key < curr.key) {

                if (lvl == 0) return 0;
                else if (curr == root[lvl])
                    curr = root[--lvl];
                else curr = prev.next[--lvl];

            } else {
                prev = curr;

                if (curr.next[lvl] != null)
                    curr = curr.next[lvl];
                else {

                    for (lvl--; lvl >= 0 && curr.next[lvl] == null; lvl--) ;

                    if (lvl >= 0)
                        curr = curr.next[lvl];
                    else return 0;
                }
            }
        }

    }

    public boolean isEmpty() {
        return root[0] == null;
    }

    public static void main(String[] args) {

        IntSkipList list = new IntSkipList(1);
        System.out.println(list.maxLevel);

    }
}
