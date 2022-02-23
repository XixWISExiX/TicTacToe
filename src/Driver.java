import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Board board = new Board();
		Scanner scnr = new Scanner(System.in);
		String brake = "";
		int[] values = new int[9];
		
		System.out.println("Welcome to tic tac toe!\n");
		System.out.println("Do you want to be x or o? (enter x or o)\n");
		char player = scnr.next().charAt(0);
		while(!brake.equals("exit")) {
			System.out.println("\n" + board + "\n");
			
			System.out.println("Please enter your position which you want to choose.");
			System.out.println("(enter 1-9)");
			int pos = scnr.nextInt();
			
			// if that position has a space, then enter in the players position
			if() {
				
			}
		}
	}
}
