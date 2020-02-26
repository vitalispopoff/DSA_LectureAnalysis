package part_05.chap_09_backtracking;


import java.io.PrintStream;

public class Queens {

    final boolean available = true;                                             // added only for readability of the code
    final int
            squares = 4,                                                        // * length of the board sid
            norm = squares - 1;
    int howMany = 0;                                                            // ? how many queens on the board already?
    int[] positionInRow = new int[squares];
    boolean[]
            column = new boolean[squares],                                      //
            leftDiagonal = new boolean[squares * 2 - 1],
            rightDiagonal = new boolean[squares * 2 - 1];

    Queens() {                                                                  // ? setting up an empty board ?
        for (int i = 0; i < squares * 2 - 1; i++)                               // iterating the diagonals
                leftDiagonal[i] = rightDiagonal[i] = available;
    }

    void PrintBoard(PrintStream out) {                                          // ? implementation irrelevant for the example
    }

    void PutQueen(int row) {                                                    // the method operates in a defined row
        for (int col = 0; col < squares; col++)                                 //
            if (                                                                // if the spot is available:
                    column[col] == available                                    //      the column
                            && leftDiagonal[row + col] == available             //      the diagonals
                            && rightDiagonal[row - col + norm] == available     //      both of'em
            ) {
                positionInRow[row] = col;                                       // the spot is reserved for the queen
                leftDiagonal[row + col] = !available;                           //  including the diagonals
                rightDiagonal[row - col + norm] = !available;                   //      both of'em

                if (row < squares - 1) PutQueen(row + 1);                  // ! is the row the last one: recursive call to another row
                else PrintBoard(System.out);

                column[col] = available;                                        // make the spot available again
                leftDiagonal[row + col] = available;                            //      with its diagonals
                rightDiagonal[row - col + norm] = available;                    //      both of'em
            }
    }


    public static void main(String[] args) {
    }
}
