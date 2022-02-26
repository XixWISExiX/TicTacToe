/**
 *  This is tic tac toe, a game which you can play.
 *  
 *  @author Joshua Wiseman
 *  @version 1.4
 */
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	// TODO make difficulty settings
	public static void main(String[] args) {
//		Board board = new Board();
		EasyDifficulty easy = new EasyDifficulty();
		Scanner scnr = new Scanner(System.in);
		
		// Introduction
		System.out.println("Welcome to tic tac toe!\n");
		
//		System.out.println("Do you want to play easy, medium, or hard? (enter easy, medium, or hard)");
		
		easy.easyMode();
		
		
		System.out.println("\nOk, hopefully you had fun!");
		scnr.close();
	}
}
