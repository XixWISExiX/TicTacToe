import java.util.Arrays;

public class Board {
	private char[] boardPos;
	private char[][] board;
	
	public Board() {
		boardPos = new char[9];
		char[][] boardHolder = { {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				  {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
				  {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				  {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
				  {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '} };
		board = boardHolder;
	}
	
	public void boardChanger(int pos, char player) {
		switch (pos) {
			case 1: board[0][1] = player;
				break;
			case 2: board[0][5] = player;
				break;
			case 3: board[0][9] = player;
				break;
			case 4: board[2][1] = player;
				break;
			case 5: board[2][5] = player;
				break;
			case 6: board[2][9] = player;
				break;
			case 7: board[4][1] = player;
				break;
			case 8: board[4][5] = player;
				break;
			case 9: board[4][9] = player;
				break;
		}
	}
	
	public String toString() {
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