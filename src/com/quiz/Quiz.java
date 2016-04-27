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
Sve aplikacije trebaju da implementiraju prikladan exception handling
 * */

package com.quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
	
	/**
	 * Creates a sum question of two random generated numbers.
	 * Checks if the answer is good or not.
	 */
	public static void sumQuiz(){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt();
		int num2 = rand.nextInt();
		
		System.out.println(num1+" + "+num2+" = ");
		try{
			int rez = scan.nextInt();
			if(rez == num1+num2){
				System.out.println("Excellent!");
			}else{
				System.out.println("Wrong answer.");
			}
		}catch(InputMismatchException e){
			System.out.println("Invalid input.");
		}
		scan.close();
	}
	
	
}
