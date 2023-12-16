import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static int ROW_COUNT = 3;
    private static int COL_COUNT = 3;
    private static String CELL_STATE_EMPTY = " ";
    private static String CELL_STATE_X = "X";
    private static String CELL_STATE_O = "O";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void startGameRound() {
        //createBord
        String[][] board = createBoard();
        //startGameRound
        startGameLoop(board);
    }

    public static String[][] createBoard() {
        String[][] board = new String[ROW_COUNT][COL_COUNT];

        for (int row = 0; row < ROW_COUNT; row++) {
            for (int col = 0; col < COL_COUNT; col++) {
                board[row][col] = CELL_STATE_EMPTY;
            }
        }
        return board;
    }

    public static void startGameLoop(String[][] board) {
        //while(gameNotOver)
        //playerTurn
        //botTurn
        //checkGameState (X_WON, 0_WON, DRAW, GAME_NOT_OVER)
    }

    public static void makePlayerTurn(String[][] board) {
        //get input
        //validate input
        //place X on board
    }

    public static int[] inputBoardCoordinates(String[][] board) {
        System.out.println("Введите два числа от 0 до 2 через пробел: ");

        do {

            String[] input = scanner.nextLine().split(" ");

            int row = Integer.parseInt(input[0]);
            int column = Integer.parseInt(input[1]);

            if ((row < 0) || (row >= ROW_COUNT) || (column < 0) || (column >= COL_COUNT)) {
                System.out.println("Неккоректное значение! Введите два числа от 0 до 2 через пробел: ");
            } else if (!Objects.equals(board[row][column], CELL_STATE_EMPTY)) {
                System.out.println("Даннай ячкйка уже занята");
            } else {
                return new int[] {row, column};
            }

        } while (true);
    }

    public static void makeBotTurn() {
        //get random empty cell
        //place 0 on board
    }

    public static void checkGameState() {
        // X - 1, 0 - (-1), empty - 0
        //count sums of rows, columns, diagonals

        //if sum.contains(3) -> X won
        //if sum.contains(-3) -> 0 won
        //if allCellsTaken() -> draw
        //else -> game not over
    }
}