import java.util.HashMap;
import java.util.Scanner;

public class EasyDifficulty extends Board{
	Board board = new Board();
	Scanner scnr = new Scanner(System.in);
	String brake = "";
	HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
	boolean gameEndCpu = false;
	boolean gameEndPlayer = false;
	char player = '0';
	int pos;
	char cpu;
	int cpuPos;
	
	public EasyDifficulty() {
	}
	
	public void easyMode() {
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
			while(!gameEndCpu || !gameEndPlayer) {
				System.out.println("\n" + board + "\n");
				
				// Position phase player 1
				while(true) {
					System.out.println("Please enter your position which you want to choose.");
					System.out.println("(enter 1-9)\n");
					// TODO If user enters a string program will crash
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
				gameEndCpu = board.checkIfDraw();
				gameEndCpu = board.checkGame(cpu);
				gameEndPlayer = board.checkGame(player);
				// Run & change cpu position
				cpuPos = pos;
				while(true && !gameEndPlayer) {
					cpuPos = (int) Math.floor((Math.random() * 9) + 1);
					if(cpuPos != pos && !values.containsValue(cpuPos)) {
						board.boardChanger(cpuPos, cpu);
						pos = cpuPos;
						values.put(pos, pos);
						break;
					}
				}
				gameEndCpu = board.checkGame(cpu);				
				
				// Determines is the game is over and if the user wants to play another game
				if(gameEndCpu || gameEndPlayer) {
					System.out.println("\n" + board + "\n");
					System.out.println("Do you want to play another game? (enter yes or no)\n");
					brake = scnr.next();
					gameEndCpu = true;
					gameEndPlayer = true;
//					System.out.println(brake.equals("no"));
					// Doesn't work with all strings
					if(!brake.equals("no")) {
						board.wipe();
						values.clear();
						gameEndCpu = false;
						gameEndPlayer = false;
					}
				}
			}
		}
	}
}
