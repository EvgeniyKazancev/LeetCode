import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    public static void main(String[] args) {
        char[][] ch = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        Sudoku sudoku = new Sudoku();
        sudoku.isValidSudoku(ch);
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            Set<Character> characters = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !characters.add(board[i][j]) ) {
                    System.out.println("1");
                    return false;
                }
            }
        }
        for (int j = 0; j < board.length; j++) {
            Set<Character> characters = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] != '.' && !characters.add(board[i][j]) ) {
                    System.out.println("2");
                    return false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> characters = new HashSet<>();
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int l = j * 3; l < j * 3 + 3; l++) {
                        if (board[k][l] != '.' && !characters.add(board[k][l]) ) {
                            System.out.println("3");
                            return false;
                        }
                    }

                }

            }
        }
        return true;
    }


}
