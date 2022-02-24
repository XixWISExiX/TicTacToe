import java.util.Arrays;
import java.util.HashMap;

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
	
	// Checks for a winner
	public boolean checkWinner(char player) {
		
		// Check diagonals
		if(board[0][1] == player && board[2][5] == player && board[4][9] == player) {
			return true;
		}
		if(board[0][9] == player && board[2][5] == player && board[4][1] == player) {
			return true;
		}
		// Check across
		for(int i = 0; i < 5; i += 2) {
			if(board[i][1] == player && board[i][5] == player && board[i][9] == player) {
				return true;
			}
		}
		// Check vertical
		for(int i = 1; i < 11; i += 4) {
			if(board[0][i] == player && board[2][i] == player && board[4][i] == player) {
				return true;
			}
		}
		return false;
	}
	
	// Determines if there is a winner and if the game is a draw
	public boolean checkGame(char player, boolean allFill) {
		if(Character.compare(player, 'x') == 0 && checkWinner('x')) {
			System.out.println("\nx Wins!\n");
			return true;
		}
		if(Character.compare(player, 'o') == 0 && checkWinner('o')) {
			System.out.println("\no Wins!\n");
			return true;
		}
		if(allFill) {
			System.out.println("\nDraw\n");
			return true;
		}
		return false;
	}
	
	// Checks for a draw
	public boolean checkIfDraw() {
		if(Character.compare(board[0][1], ' ') != 0 && Character.compare(board[0][5], ' ') != 0 && Character.compare(board[0][9], ' ') != 0
				&& Character.compare(board[2][1], ' ') != 0 && Character.compare(board[2][5], ' ') != 0
				&& Character.compare(board[2][9], ' ') != 0 && Character.compare(board[4][1], ' ') != 0
				&& Character.compare(board[4][5], ' ') != 0 && Character.compare(board[4][9], ' ') != 0
				) {
			return true;
		}
		return false;
	}
	
	// Wipes the board clean
	public void wipe() {
		board[0][1] = ' ';
		board[0][5] = ' ';
		board[0][9] = ' ';
		board[2][1] = ' ';
		board[2][5] = ' ';
		board[2][9] = ' ';
		board[4][1] = ' ';
		board[4][5] = ' ';
		board[4][9] = ' ';
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