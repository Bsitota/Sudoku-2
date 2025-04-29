import java.io.FileNotFoundException;
public class SudokuEngine {

     public static void main(String[] args) {
        try {
            SudokuBoard sudoku = new SudokuBoard("data1.sdk");
            System.out.println(sudoku);

            System.out.println("Is the board valid? " + sudoku.isValid());
            System.out.println("Is the board solved? " + sudoku.isSolved());
        } catch (FileNotFoundException e) {
            
        }
    }
  }