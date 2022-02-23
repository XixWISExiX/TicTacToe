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
		board = {{' ', ' '. ' ', '|', ' ', ' '. ' ', '|', ' ', ' '. ' '},
				{'-', '-'. '-', '+', '-', '-'. '-', '+', '-', '-'. '-'},
				{' ', ' '. ' ', '|', ' ', ' '. ' ', '|', ' ', ' '. ' '},
				{'-', '-'. '-', '+', '-', '-'. '-', '+', '-', '-'. '-'},
				{' ', ' '. ' ', '|', ' ', ' '. ' ', '|', ' ', ' '. ' '}};
	}
	
	public String toString() {
//		for(int i = 0; i < board.length; ++i) {
//			System.out.println(board[i]);
//		}
		System.out.println(Arrays.toString(board));
	}
	
}