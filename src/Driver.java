/**
 *  This is tic tac toe, a game which you can play
 *  
 *  @author Joshua Wiseman
 *  @version 1.0
 */
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	// Put code into more methods
	public static void main(String[] args) {
		Board board = new Board();
		Scanner scnr = new Scanner(System.in);
		String brake = "";
		HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
		boolean allFill = false;
		boolean gameEnd = false;
		char player = '0';
		int pos;
		char cpu;
		int cpuPos;
		
		// Introduction
		System.out.println("Welcome to tic tac toe!\n");
		
		// Choose character phase
		while(Character.compare(player, 'x') != 0 && Character.compare(player, 'o') != 0) {
			System.out.println("Do you want to be x or o? (enter x or o)\n");
			player = scnr.next().charAt(0);
		}
		if(Character.compare(player, 'x') == 0) {
			cpu = 'o';
		}
		else {
			cpu = 'x';
		}
		// Main loop for user interface
		while(!brake.equals("no")) {
			
			// Game Portion (clarify position numbers)
			while(!gameEnd) {
				System.out.println("\n" + board + "\n");
				
				// Position phase player 1
				while(true) {
					System.out.println("Please enter your position which you want to choose.");
					System.out.println("(enter 1-9)\n");
					pos = scnr.nextInt();
					
					// if that position has a space, then enter in the players position
					if(pos <= 9 && pos >= 1 && !values.containsValue(pos)) {
						board.boardChanger(pos, player);
						values.put(pos, pos);
						break;
					}
					else {
						System.out.println("That is not a valid position\n");
					}
				}
				allFill = board.checkIfDraw();
				
				// Run & change cpu position
				cpuPos = pos;
				while(true && !allFill) {
					cpuPos = (int) Math.floor((Math.random() * 9) + 1);
					if(cpuPos != pos && !values.containsValue(cpuPos)) {
						board.boardChanger(cpuPos, cpu);
						pos = cpuPos;
						values.put(pos, pos);
						break;
					}
				}
				
				// TODO needs to check draw and ending needs work
				gameEnd = board.checkGame(player, allFill);
				if(gameEnd) {
					System.out.println("\n" + board + "\n");
					System.out.println("Do you want to play another game? (enter yes or no)\n");
					brake = scnr.next();	
					// Doesn't work with all strings
					if(!brake.equals("no")) {
						board.wipe();
						gameEnd = false;
					}
				}
			}
		}
		System.out.println("\nOk, hopefully you had fun!");
	}
}
