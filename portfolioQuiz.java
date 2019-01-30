package Jerzy;

import java.util.Scanner;

public class portfolioQuiz {
	public static void main(String [] args) {
		
		String q1 = "What is Java?\n"
					+ "(a) Popular programing language\n(b) Type of coffee\n(c) Spaceship\n ";
		String q2 = "For what reason we learn Java?\n"
				+ "(a) Because coffee is our favourite beverage\n(b) Because it is widely used and programers friendly\n(c) For no reason\n ";
		
		Question [] questions = {
				new Question(q1, "a"),
				new Question(q2, "b")
		};
		
		takeTest(questions);
		
		
	}
	
	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
	}
	
	
}


