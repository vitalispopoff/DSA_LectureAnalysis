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
        root = new IntSkipListNode[maxLevel+1];
        powers = new int[maxLevel+1];

        for (int j = 0; j <= maxLevel; j++)
            root[j] = null;
        choosePowers();
    }

    // fills the powers[] array
    void choosePowers() {
        // sets last entry:
        powers[maxLevel] = (2 << (maxLevel)) - 1;
        // iterates from one but last to the 1st:
        for (int i = maxLevel - 1, j = 0; i >= 0; i--, j++)
            //subtracts an increasing power of 2 from the level above - how does it meet the 1?
            powers[i] = powers[i + 1] - (2 << j);
    }
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
     * */   // powers[] values estimations

    public boolean isEmpty() {
        return root[0] == null;
    }

    public void skipListInsert(int key) {

        IntSkipListNode[] current = new IntSkipListNode[maxLevel];      //array filled to the brim with nulls
        current[maxLevel] = root[maxLevel];     // root by default is full of nulls

        IntSkipListNode[] previous = new IntSkipListNode[maxLevel];
        previous[maxLevel] = null;

        IntSkipListNode newNode;    // node to be inserted
        int level, i;

        for (level = maxLevel; level >= 0; level--) {   // as levels fail we go deeper

            while (current[level] != null && current[level].key < key) {    // the actual searching: the node ain't last and it's key is before our key; we keep the level
                previous[level] = current[level];       // jump : this node is now previous
                current[level] = current[level].next[level];    // jump to the next node
            }

            if (current[level] != null && current[level].key == key)    // finding the node
                return;

            if (level > 0)  // passing the node or hitting the end while being above the lowest level

                if (previous[level] == null) {      // hitting the end : go down (and start all over?)

                    current[level - 1] = root[level - 1];   // reset current for lower level (set as root)
                    previous[level - 1] = null;     // clear previous for lower level

                } else { // passing the node : get back to the last node and go down

                    // set back current to the previous node, and go down + forward ;
                    // do we leave the current[level] intact ?
                    current[level - 1] = previous[level].next[level - 1];

                    // and what is this? an undo?
                    previous[level - 1] = previous[level];
                }
        }

        level = chooseLevel();  //  randomization

        //inserting the node
        newNode = new IntSkipListNode(key, level + 1);  // node has one more level than one at which the search ended
        for (i = 0; i <= level; i++) {
            newNode.next[i] = current[i];   // fill the node links
            if (previous[i] == null)    //  whether newNode is first on the list
                root[i] = newNode;      // make it root
            else previous[i].next[i] = newNode; // if not redirect the previous node to the newNode
        }
    }

    int chooseLevel() {

        int i, r = Math.abs(rd.nextInt()) % powers[maxLevel] + 1;
        for (i = 1; i < maxLevel; i++)
            if (r < powers[i])
                return i - 1;
        return i - 1;


    }
    /*  maxLev = 0 v 1 , random = 1;
     *
     * * * *
     *   maxLev = 2, powers[1] = 1, r = random % ((2<<2-1)) + 1 = random from <1,4)
     *       returns <0,1>
     *
     * * * *
     *  maxLev = 3, powers[2] = 3, r = random %powers[2] + 1 = random % ((2<<3)-1) + 1 = random from <1,8)
     *      returns <0,2>
     *
     */ // chooseLevel result analysis

    // simplified version of chooseLevel ?
    int chooseLevel_01() {
        int i = 1, random = Math.abs(rd.nextInt()) % powers[maxLevel] + 1;
        for (; i < maxLevel && random < powers[i]; i++) ;
        return i - 1;
    }

    public int skipListSearch(int key) {
        int level;
        IntSkipListNode previous, current;

        for (level = maxLevel; level >= 0 && root[level] == null; level--) ;
        previous = current = root[level];

        while (true)    // why while?
        {
            if (key == current.key) return current.key;

            else if (key < current.key) {

                if (level == 0) return 0;
                else if (current == root[level])
                    current = root[--level];
                else current = previous.next[--level];

            } else {
                previous = current;

                if (current.next[level] != null)
                    current = current.next[level];
                else {

                    for (level--; level >= 0 && current.next[level] == null; level--) ;

                    if (level >= 0)
                        current = current.next[level];
                    else return 0;
                }
            }
        }
    }



    public static void main(String[] args) {

//        IntSkipList list = new IntSkipList(1);
//        System.out.println(list.maxLevel);

        Random random = new Random();
        /*{for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt() + " ");
            if (i % 10 == 0) System.out.println();
        }}*/        // 100 random numbers grouped in lines of 10s

        int maxLevel = 3, power = (2 << (maxLevel - 1)) - 1; //power is to be powers[maxLevel-1]

        {
            for (int i = 1; i <= 100; i++) {
                System.out.print(Math.abs(random.nextInt()) % power + 1 + " ");
                if (i % 10 == 0) System.out.println();
            }
        }

//        int i = 0;
//        System.out.println(i < ++i);
    }
}
