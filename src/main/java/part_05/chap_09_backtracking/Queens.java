package part_05.chap_09_backtracking;


import java.io.PrintStream;

public class Queens {

    final boolean available = true;
    final int
            squares = 4,
            norm = squares - 1;
    int howMany = 0;
    int[] positionInRow = new int[squares];
    boolean[]
            column = new boolean[squares],
            leftDiagonal = new boolean[squares * 2 - 1],
            rightDiagonal = new boolean[squares * 2 - 1];

    Queens() {
        for (int i = 0; i < squares * 2 - 1; i++)
            leftDiagonal[i] = rightDiagonal[i] = available;
    }

    void PrintBoard(PrintStream out) {
        //  ???
    }

    void PutQueen(int row) {
        for (int col = 0; col < squares; col++)
            if (
                    column[col] == available
                            && leftDiagonal[row + col] == available
                            && rightDiagonal[row - col + norm] == available
            ) {
                positionInRow[row] = col;
                leftDiagonal[row + col] = !available;
                rightDiagonal[row - col + norm] = !available;

                if (row < squares - 1) PutQueen(row + 1);
                else PrintBoard(System.out);

                column[col] = available;
                leftDiagonal[row + col] = available;
                rightDiagonal[row - col + norm] = available;
            }
    }


    public static void main(String[] args) {
    }
}
