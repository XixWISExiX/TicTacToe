import java.util.Arrays;

public class Board {
	private char[] boardValues;
	private char[][] board;
	
	public Board() {
//		board = "___|___|___" + System.lineSeparator();
//		         ___|___|___
//				 ___|___|___
//		            |   |
//		
//		 x | o |
//		---+---+---
//		   |   |
//		---+---+---
//		   |   |
//		
//		
//		
		
		boardValues = new char[9];
		char[][] boardHolder = { {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				  {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
				  {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				  {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
				  {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '} };
		board = boardHolder;
	}
	
	public String toString() {
//		for(int i = 0; i < board.length; ++i) {
//			System.out.println(board[i]);
//		}
//		return Arrays.deepToString(board);
		
		String table = "";
		for(int i = 0; i < board.length; ++i) {
			for(int k = 0; k < board[0].length; ++k) {
				table += board[i][k];
			}
			table += System.lineSeparator();
		}
		return table;
	}
	
}