package connect_four_game;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
     //add instance variables
	private String[][] board;
	
	private Scanner scanner = new Scanner(System.in);
	
    public void boardSetUp() {
        System.out.println("------ Board Set up -------");
        System.out.println("Number of rows: ");
        int rows = scanner.nextInt();  //receive user input
        System.out.println("Number of cols: ");
         //receive column value
        int cols = scanner.nextInt();
        
        
        this.board = new String[rows][cols];  //initialize a row by column array;

         //initialize empty board with dashes (-)
        for (String[] row : board) {
             //fill up each row of the board with dashes
        	Arrays.fill(row, "-");
        }
    }

    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public boolean columnFull(int col) {
        return !board[0][col].equals("-");  //check if the column is full by checking the topmost row's value
    }


    public boolean boardFull() {
         //True understanding this code.
        for (int i = 0; i < this.board[0].length; i++) {
            if (!columnFull(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean addToken(int colToAddToken, String token) {
        int rowToAddToken = board.length - 1;

        while (rowToAddToken >= 0) {
            if (board[rowToAddToken][colToAddToken].equals("-")) {
                board[rowToAddToken][colToAddToken] = token;  //Place the token
                return true;
            } else {
                rowToAddToken -= 1;
            }
        }

        return false;
    }


    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        if (checkHorizontal(playerNumber)) {
            return true;
        } else if (checkLeftDiagonal(playerNumber)) {
            return true;
        }
         //what other conditions should we include here?
        return false;
    }

    public boolean checkVertical(String playerNumber) {
        for (int col = 0; col < board[0].length; col++) {
             //length - 3 here because we are comparing 4 in a row items
            for (int row = 0; row < board.length - 3; row++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col]
                            && board[row][col] == board[row + 2][col]
                            && board[row][col] == board[row + 3][col]) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public boolean checkHorizontal(String playerNumber) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col].equals(board[row][col + 1])
                            && board[row][col].equals(board[row][col + 2])
                            && board[row][col].equals(board[row][col + 3])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


     public boolean checkLeftDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col + 1]
                            && board[row][col] == board[row + 2][col + 2]
                            && board[row][col] == board[row + 3][col + 3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

     public boolean checkRightDiagonal(String playerNumber) {
    	    for (int row = 0; row < board.length - 3; row++) {
    	        for (int col = 0; col < board[0].length - 3; col++) {
    	            if (board[row][col].equals(playerNumber)) {
    	                if (board[row][col].equals(board[row + 1][col + 1])
    	                        && board[row][col].equals(board[row + 2][col + 2])
    	                        && board[row][col].equals(board[row + 3][col + 3])) {
    	                    return true;
    	                }
    	            }
    	        }
    	    }
    	    return false;
    	}


//     TODO: Uncomment this to test your board class in isolation. 
//     This is just a small set of tests for our board class for now. We will
//     delete this when we have the TestClass and Game class created.
//     We should have only one "main" method in the program at the end of the entire
//     challenge otherwise Java will freak out if there are multiple main classes in
//     the different classes it looks into.
//     A main method acts as the Java entry point into your program and Java expects
//     only one entry point.
//    
//    Uncomment below to see if you've done the job:
    public static void main(String[] args) {
         Board board1 = new Board();
         board1.boardSetUp();
         board1.printBoard();

         board1.addToken(0, "x");
         board1.addToken(0, "x");
         board1.addToken(0, "x");
         board1.addToken(1, "y");
         board1.addToken(1, "z");
         board1.addToken(1, "w");
         board1.addToken(0, "x");

         System.out.println("Board for testing checkVertical");
         System.out.println("Board 1 check vertical with x returns -> " + board1.checkVertical("x"));
         System.out.println("Board 1 check vertical with y returns -> " + board1.checkVertical("y"));

         board1.printBoard();

         Board board2 = new Board();
          //Test with at least a 4-by-4 size board.
         board2.boardSetUp();
         board2.printBoard();

         board2.addToken(0, "x");
         board2.addToken(0, "x");
         board2.addToken(0, "w");
         board2.addToken(0, "w");
         board2.addToken(1, "y");
         board2.addToken(1, "x");
         board2.addToken(1, "w");
         board2.addToken(2, "y");
         board2.addToken(2, "w");
         board2.addToken(2, "x");
         board2.addToken(3, "w");
         board2.addToken(3, "w");
         board2.addToken(3, "w");
         board2.addToken(3, "x");

         System.out.println("Board for testing diagonals");
         System.out.println("Board 2 check right diagonal with x returns -> " + board2.checkRightDiagonal("x"));
         System.out.println("Board 2 check right diagonal y returns -> " + board2.checkRightDiagonal("y"));
         System.out.println("Board 2 check left diagonal w returns -> " + board2.checkLeftDiagonal("w"));

         board2.printBoard();
     }

}