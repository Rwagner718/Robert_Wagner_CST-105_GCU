/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take 
turns marking an available cell in a 3*3 grid with their respective tokens 
(either X or O). When one player has placed three tokens in a horizontal, 
vertical, or diagonal row on the grid, the game is over and that player has 
won. A draw (no winner) occurs when all the cells on the grid have been filled 
with tokens and neither player has achieved a win. Create a program for playing 
tic-tac-toe. The program prompts two players to enter an X token and O token 
alter-nately. Whenever a token is entered, the program redisplays the board 
on the console and determines the status of the game (win, draw, or continue). 
Here is a sample run: 
 *
 *
 **/
package WeekFourAssignments;

import java.util.Scanner;
public class TicTacToe_8_9 {
    private static boolean isPlayer1Turn = true;
    private static int mRow = 0;
    private static int mColumn = 0;

    public static void main(String[] args) {
        boolean keepPlaying = true;
        boolean isClear;
        Scanner input = new Scanner(System.in);
        String[][] grid = createGrid(3, 3);

        while (keepPlaying) {

            displayGrid(grid);

            do {
                setmRow(askForRow());
                setmColumn(askForColumn());

                isClear = isPositionClear(grid);
                if (!isClear) {
                    System.out.println("row: " + getmRow() + " column: " + getmRow() + " is used. Make another attempt.");
                }
            } while (!isClear);

            updateTurn(grid);

            if (hasWon(grid)) {
                displayGrid(grid);
                String player = (isIsPlayer1Turn()) ? "X" : "O";
                System.out.println("Player " + player + " wins!");
                System.out.print("Do you want to play again? y/n: ");
                String option = input.next();
                keepPlaying = (option.equalsIgnoreCase("y"));
                grid = createGrid(3, 3);
            }
            setIsPlayer1Turn(!isIsPlayer1Turn());

        }

        System.out.println("Game ended..");
        input.close();

    }

    public static int askForColumn(){
        Scanner input = new Scanner(System.in);
        int column = 0;
        boolean isColumnValid = false;
        while (!isColumnValid) {

            if (isIsPlayer1Turn()) {
                System.out.print("Enter column 0, 1, or 2 for player X: ");
            } else {
                System.out.print("Enter column 0, 1, or 2 for player O: ");
            }
            column = input.nextInt();
            isColumnValid = isValidRange(column);
        }
        return column;

    }
    public static int askForRow(){
        int row = 0;
        Scanner input = new Scanner(System.in);

        boolean isRowValid = false;
        while (!isRowValid) {

            if (isIsPlayer1Turn()) {
                System.out.print("Enter row 0, 1, or 2 for X: ");
            } else {
                System.out.print("Enter row 0, 1, or 2 for O: ");
            }
            row = input.nextInt();
            isRowValid = isValidRange(row);

        }

        return row;
    }

    public static boolean isValidRange(int section) {
        return (0 <= section && section <= 2);
    }

    public static boolean isPositionClear(String[][] grid) {

        String position = grid[getmRow()][getmColumn()];

        return position.equals("|     |") || position.equals("      |");


    }
    public static void displayGrid(String[][] grid) {

        for (String[] grid1 : grid) {
            System.out.println("---------------------");
            for (String item : grid1) {
                System.out.print(item);
            }
            System.out.println("");
        }
        System.out.println("---------------------");

    }

    public static String[][] createGrid(int row, int column) {

        String[][] grid = new String[row][column];

        for (String[] grid1 : grid) {
            for (int k = 0; k < grid1.length; k++) {
                if (k == 0) {
                    grid1[k] = "|     |"; // every first column
                } else {
                    grid1[k] = "      |"; // every column after first
                }
            }
        }
        return grid;
    }

    public static boolean updateTurn(String[][] grid) {

       
        if (!grid[mRow][mColumn].equals("|     |") &&
            !grid[mRow][mColumn].equals("      |")) {
            return  false;
        }

        String update;
        if (isIsPlayer1Turn()) {
            update = (getmColumn() == 0) ? "|  X  |" : "  X   |";
        } else {
            update = (getmColumn() == 0) ? "|  O  |" : "  O   |";
        }

        grid[getmRow()][getmColumn()] = update;

        return true;
    }

    public static boolean hasWon(String[][] grid) {

        int player = (isIsPlayer1Turn()) ? 0 : 1;
        String token = (player == 0) ? "X" : "O";

        return (checkColumn(grid, token) || checkColumn(grid,token) || checkDiagonal(grid, token));
    }

    public static boolean checkColumn(String[][] grid, String s) {

        int occurence = 0;
        for (int k = 0; k < grid[0].length; k++) {
            for (String[] grid1 : grid) {
                if (grid1[k].contains(s)) {
                    occurence++;
                }
            }
            if (occurence == 3) {
                return true;
            } else {
                occurence = 0;
            }
        }

        return false;
    }

    public static boolean checkRow(String[][] grid, String s) {

        int occurrence = 0;
        for (String[] grid1 : grid) {
            for (String grid11 : grid1) {
                if (grid11.contains(s)) {
                    occurrence++;
                }
            }
            if (occurrence == 3) {
                return true;
            } else {
                occurrence = 0;
            }
        }

        return false;
    }

    public static boolean checkDiagonal(String[][] grid, String s) {

        // check from top left to bottom right
        int occurrence = 0;
        int x = 0;
        int y = 0;
        while (x < grid[0].length && y < grid.length) {

            if (grid[y][x].contains(s)) {
                occurrence++;
            }
            if (occurrence == 3) {
                return true;
            }
            x++;
            y++;
        }

        // Checking from bottom left to top right
        x = 0;
        y = grid.length - 1;
        while (x < grid[0].length && y >= 0) {

            if (grid[y][x].contains(s)) {
                occurrence++;
            }
            if (occurrence == 3) {
                return true;
            }
            y--;
            x++;
        }


        return false;
    }

    /**
     * @return the mColumn
     */
    public static int getmColumn() {
        return mColumn;
    }

    /**
     * @param amColumn the mColumn to set
     */
    public static void setmColumn(int amColumn) {
        mColumn = amColumn;
    }

    /**
     * @return the mRow
     */
    public static int getmRow() {
        return mRow;
    }

    /**
     * @param amRow the mRow to set
     */
    public static void setmRow(int amRow) {
        mRow = amRow;
    }

    /**
     * @return the isPlayer1Turn
     */
    public static boolean isIsPlayer1Turn() {
        return isPlayer1Turn;
    }

    /**
     * @param aIsPlayer1Turn the isPlayer1Turn to set
     */
    public static void setIsPlayer1Turn(boolean aIsPlayer1Turn) {
        isPlayer1Turn = aIsPlayer1Turn;
    }

}



