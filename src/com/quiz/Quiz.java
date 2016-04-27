/*Napisati jednostavnu math quiz aplikaciju. Aplikacija treba da generise random matematicka
pitanja iz oblasti:
a. Sabiranja - Marina
b. Oduzimanja - Marina
c. Mnozenja - Ahmed
d. Djeljenja - Ahmed
e. Korjenovanja - Edin
f. Kvadriranja - Edin
Koristiti github kao issue tracking / to-do alat te commitati sav rad na aplikaciji koristeci
feature branch workflow.
Sve metode trebaju da implementiraju prikladan exception handling.
 * */

package com.quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
	static Scanner scan;

	public static void main(String[] args) {
		//ask the user how many math questions he wants 
		System.out.println("How many questions do you want? ");
		scan = new Scanner(System.in);
		int numQuestions = scan.nextInt();

		//create a Random object
		Random rand = new Random();

		//create that number of math questions
		for (int i = 0; i < numQuestions; i++) {
			//create two random numbers from 0 to 999
			int num1 = rand.nextInt(1000);
			int num2 = rand.nextInt(1000);
			
			switch (rand.nextInt(6)) { //generates a random question from 0 to 5
			case 0://in case the random question is 0
				sumQuiz(num1, num2);//than create a sum quiz with arguments num1 and num2
				break;
			case 1:
				subQuiz(num1, num2);
				break;
			case 2:
				multiplicationQuiz(num1, num2);
				break;
			case 3:
				divideQuiz(num1, num2);
				break;
			case 4:
				squareQuiz(num1);
				break;
			case 5:
				sqrtQuiz(num2);
				break;
			}
		}
	}

	/**
	 * Creates a sum question num1+num2, prints it to the user<br/>
	 * and checks if the answer is right.<br/>
	 * 
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void sumQuiz(int num1, int num2) {
		scan = new Scanner(System.in);
		System.out.println(num1 + " + " + num2 + " = ");
		try {
			int rez = scan.nextInt();
			if (rez == num1 + num2) {
				System.out.println("Excellent!");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
			scan.nextLine();
		}
	}
	
	/**
	 * Creates a subtraction question num1-num2, prints it to the user<br/>
	 * and checks if the answer is right.<br/>
	 * 
	 * 
	 * @param num1
	 * @param num2
	 */
	private static void subQuiz(int num1, int num2) {
		// TODO Auto-generated method stubscan = new Scanner(System.in);
		System.out.println(num1 + " - " + num2 + " = ");
		try {
			int rez = scan.nextInt();
			if (rez == num1 - num2) {
				System.out.println("Excellent!");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
			scan.nextLine();
		}
	}

	private static void multiplicationQuiz(int num1, int num2) {
		// TODO Auto-generated method stub

	}

	private static void divideQuiz(int num1, int num2) {
		// TODO Auto-generated method stub

	}

	private static void squareQuiz(int num1) {
		// TODO Auto-generated method stub

	}

	private static void sqrtQuiz(int num2) {
		// TODO Auto-generated method stub

	}

}
