package Jerzy;

import java.util.Scanner;

public class powtórka {
	public static void main(String [] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord = "java"; 
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord) && !outOfGuesses) {
			
			if(guessCount < guessLimit) {
				if(guessCount == 0) {
					System.out.print("Guess a name of one of the most popular programing languages: ");
					guess = keyboardInput.nextLine();
					guessCount++;
				} else if(guessCount == 1) {
					System.out.print("Would you like a coup of coffee? ");
					guess = keyboardInput.nextLine();
					guessCount++;
				} else if(guessCount == 2) {
					System.out.print("Name quite similar to JavaScript but language is based on different rules... ");
					guess = keyboardInput.nextLine();
					guessCount++;
				}
				
			} else {
				outOfGuesses = true;
			}
			
		} 
		if(outOfGuesses) {
			System.out.println("You lose!");
		} else {
			System.out.println("You win!");
		}
	}
	
	
}

