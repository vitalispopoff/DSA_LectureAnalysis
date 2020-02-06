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
         * * * *
         * maxLevel = 0, i = -2;
         * powers[-1] = (2<<(0 - 1)) - 1 = (2<<-1) -1 = 2>>1 -1 = 0.5 -1 = -0.5 = (int) = 0;
         *
         * * * *
         * maxLevel = 1, i = -1;
         *   powers[0] = (2<<(1-1)) - 1 = (2<<0) - 1 = 1 - 1 = 0;
         *
         * * * *
         * maxLevel = 2, i = 0;
         *   powers[1] = (2<<(2-1)) - 1 = (2<<1) - 1 = 2 - 1 = 1;
         *   powers[0] = [powers[1] - (2<<0) = 1 - 1 = 0;
         *
         * * * *
         * maxLevel = 3, i = 1;
         *   powers[2] = (2<<(3-1)) - 1 = (2<<2) - 1 = 4 -1 = 3;
         *   powers[1] = powers[2] - (2<<0) = 3 - 1 = 2;
         *   powers[0] = powers[1] - (2<<1) = 2 - 2 = 0;
         *
         * * * *
         * maxLevel = 4, i = 2;
         *   powers[3] = (2<<(4-1)) - 1 = (2<<3) - 1= 8 -1 = 7;
         *   powers[2] = power[3] - (2<<0) = 7 - 1 = 6;
         *   powers[1] = power[2] - (2<<1) = 6 - 2 = 4;
         *   powers[0] = power[1] - (2<<2) = 4 - 4 = 0;
         *
         *  * * *
         * maxLevel = 5, i = 5 - 2 = 3;
         *   powers[4] = (2<<5-1)) - 1 = (2<<4) - 1 = 16 - 1 = 15;
         *   powers[3] = powers[4] - (2<<0) = 15 - 1 = 14;
         *   powers[2] = powers[3] - (2<<1) = 14 - 2 = 12;
         *   powers[1] = powers[2] - (2<<2) = 12 - 4 = 8;
         *   powers[0] = powers[1] - (2<<3) = 8 - 8 = 0;
         *
         * * * *
         * maxLevel = 6, i = 4;
         *   powers[5] = (2<<6-1)) - 1 = (2<<5) - 1 = 32 - 1 = 31;
         *   powers[4] = powers[5] - (2<<0) = 31 - 1 = 30;
         *   powers[3] = powers[4] - (2<<1) = 30 - 2 = 28;
         *   powers[2] = powers[3] - (2<<2) = 28 - 4 = 24;
         *   powers[1] = powers[2] - (2<<3) = 24 - 8 = 16;
         *   powers[0] = powers[1] - (2<<4) = 16 - 16 = 0;
         * */
    }

    int chooseLevel() {

        int i, r = Math.abs(rd.nextInt()) % powers[maxLevel - 1] + 1;
        for (i = 1; i < maxLevel; i++)
            if (r < powers[i])
                return i - 1;
        return i - 1;

        /*  maxLev = 0 v 1 , random = 1;
        *
        * * * *
        *   maxLev = 2, powers[1] = 1, r = random % (2<<1) + 1 = random from <1,3>
        *       r = 1 returns 0;
        *       r = 2 returns 1;
        *       r = 3 returns 2;
        */

    }

    public int skipListSearch(int key) {
        int level;
        IntSkipListNode prev, curr;

        for (level = maxLevel - 1; level >= 0 && root[level] == null; level--) ;
        prev = curr = root[level];

        while (true) {
            if (key == curr.key) return curr.key;

            else if (key < curr.key) {

                if (level == 0) return 0;
                else if (curr == root[level])
                    curr = root[--level];
                else curr = prev.next[--level];

            } else {
                prev = curr;

                if (curr.next[level] != null)
                    curr = curr.next[level];
                else {

                    for (level--; level >= 0 && curr.next[level] == null; level--) ;

                    if (level >= 0)
                        curr = curr.next[level];
                    else return 0;
                }
            }
        }
    }

    public boolean isEmpty() {
        return root[0] == null;
    }

    public static void main(String[] args) {

//        IntSkipList list = new IntSkipList(1);
//        System.out.println(list.maxLevel);

        Random random = new Random();
        /*{for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt() + " ");
            if (i % 10 == 0) System.out.println();
        }}*/        // 100 random numbers grouped in lines of 10s

        int maxLevel = 2, power = (2 << (maxLevel - 1)) - 1; //power is to be powers[maxLevel-1]

        /*{
            for (int i = 0; i < 100; i++) {
                System.out.print(Math.abs(random.nextInt()) % power + 1 + " ");
                if (i % 10 == 0) System.out.println();
            }
        }*/

//        int i = 0;
//        System.out.println(i < ++i);
    }
}
