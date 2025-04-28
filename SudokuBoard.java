import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String Filename) throws FileNotFoundException {
        board = new char[9][9];
        Scanner key = new Scanner(new File(Filename));
        for (int r = 0; r < board.length; r++) {
            if (key.hasNextLine()) {
                String line = key.nextLine();
                if (line.length() == board[r].length) {
                    for (int c = 0; c < board[r].length; c++) {
                        board[r][c] = line.charAt(c);
                    }
                } else {
                    System.err.println("Warning: Invalid line length in file: " + line);
                }
            } else {
                System.err.println("Warning: Incomplete file, less than 9 lines.");
                break;
            }
        }
        
    }
    public boolean validDataInBoard(){
       Set<Character> myChars = new HashSet<>();
       for(char i = '1'; i <= 9; i++){
         myChars.add(i);
       
       }
       myChars.add(".");
       for(int r = 0; r < board.length; r++){
          for(c = 0; c < board[r].length; c++){
            if(!myChars.contains(board[r][c])){
              System.err.println("the character not found: " + board[r][c]);
              return false;

            }
          }
          
       }
       return true;
    
    }
    public boolean isRowConatinsNum(){
       for(int r =0; r < board.length; r++){
       Set<Character> num = new HashSet<>();
         for(int c = 0; c < board[r].length; c++){
         char b = baord[r][c];
           if(b != '.' && b != num.add(b)){
             return false;
           } 
         }
       }
       return true;
    
    } 

    
    public String toString(){
       StringBuilder print = new StringBuilder();
       print.append(" -----------------------------\n");
          for (int row = 0; row < board.length; row++) {
            print.append("|");
            for (int col = 0; col < board[row].length; col++) {
                print.append(" ");
                print.append(board[row][col]);
                print.append(" ");
                if ((col + 1) % 3 == 0) {
                    print.append("|");
                }
            }
            
            print.append("\n");
            if ((row + 1) % 3 == 0) {
                print.append("------------------------------\n");
            }
          }
          
          return print.toString();
    
    }
    
}