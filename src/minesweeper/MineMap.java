package minesweeper;

import java.util.Random;

import static minesweeper.MineSweeperConstants.ROWS;
import static minesweeper.MineSweeperConstants.COLS;

public class MineMap {
    // package access
    int numMines;
    boolean[][] isMined = new boolean[ROWS][COLS];

    // Constructor
    public MineMap() {
        super();
    }

    // Generate a new mine map with a random distribution of mines
    public void newMineMap(int numMines) {
        this.numMines = numMines;

        // Create a random number generator
        Random random = new Random();

        // Place mines randomly
        while (numMines > 0) {
            int row = random.nextInt(ROWS);
            int col = random.nextInt(COLS);

            // Ensure the mine is not placed in an already mined cell
            if (!isMined[row][col]) {
                isMined[row][col] = true;
                numMines--;
            }
        }
    }
}