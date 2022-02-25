
/**
 *  This is the Board class which contains many functions to play tic tac toe.
 *  
 *  @author Joshua Wiseman
 *  @version 1.0
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Board {
	private char[] boardPos;
	private char[][] board;
	
	/**
	 *  Creates the tic tac toe board.
	 */
	public Board() {
		boardPos = new char[9];
		char[][] boardHolder = { {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				  {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
				  {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
				  {'-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
				  {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '} };
		board = boardHolder;
	}
	
	/**
	 *  Adds the players input to the board.
	 *  
	 * @param pos  the position of the given character
	 * @param player  the character of the player
	 */
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
	
	/**
	 *  Checks for a winner.
	 * @param player  the character of the player.
	 * @return returns true if someone has won the game of tic tac toe.
	 */
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
	
	/**
	 *  Determines if there is a winner and if the game is a draw.
	 *  
	 * @param player  the character of the player.
	 * @param allFill  a variable which is given from checkIfDraw() to determine if the game is a draw or not.
	 * @return returns true if the game is over.
	 */
	public boolean checkGame(char player) {
		if(Character.compare(player, 'x') == 0 && checkWinner('x')) {
			System.out.println("\nx Wins!\n");
			return true;
		}
		if(Character.compare(player, 'o') == 0 && checkWinner('o')) {
			System.out.println("\no Wins!\n");
			return true;
		}
		if(checkIfDraw()) {
			System.out.println("\nDraw\n");
			return true;
		}
		return false;
	}
	
	/**
	 * Checks for a draw.
	 * 
	 * @return returns true if the game is a draw.
	 */
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
	
	/**
	 *  Wipes the board clean.
	 */
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
	
	/**
	 * Prints out the current table to the user.
	 */
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