package game;
import java.util.*;

public class Game {
	Scanner scnr = new Scanner(System.in);
	public int gamestate =0;
	
	public static void main(String args[]) {
		Game start = new Game();
	}//of main
	
	public Game(){
		while(gamestate==0) {
		int answer =generateIntNum(16,20);
		//System.out.println(answer);
		System.out.print("Enter your guess! :");
		int guess = scnr.nextInt();
		if(check(guess,answer)) {
			System.out.println("you guessed correctly!");
		}
		else {
			System.out.println("you were " + (int)Math.abs(answer-guess)+" away !!");
		}
		
		System.out.println("would you like to play again if so enter zero "+'\n'+ "if not please enter anything else");
		gamestate=scnr.nextInt();
		}
	}//of game call ps this is main method call
	
	public int generateIntNum(int max, int min) {
		
		return(int)(Math.random() * ((max - min) + 1)) + min;
		
	}//of generate number function
	
	public boolean check(int guess, int answer) {
		if(guess==answer) {
			return true;
		}//check answer 
		 return false;
	}//of check
}//of game class 
