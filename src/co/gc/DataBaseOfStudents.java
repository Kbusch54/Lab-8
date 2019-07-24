package co.gc;

import java.util.Arrays;
import java.util.Scanner;

public class DataBaseOfStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = { "Kevin Busch", "John Smith", "Jane Doe", "Bob Jones", "John Miller", "Mary Jane",
				"Joey Knut", "Frank Diaz", "Lindsey Sarosi", "Alexis Miggs" };
		String[] food = { "Pizza", "Chinese", "Pizza", "Salad", "Yogurt", "Mcdonalds", "Chips", "Cookies", "Pasta",
				"Chocolate" };
		String[] homeT = { "Ann Arbor, MI", "Oralando, FL", "Detroit, MI", "Ann Arbor, MI", "Los Angeles, CA",
				"Detroit, MI", "Houston, TX", "New York City, NY", "Canton, MI", "Novi, MI" };

		System.out.println(
				"Welcome to our Java Class. Which student would you like to learn more about? (enter a number 1 - 10): ");
	
		boolean cont = true;
		do {
			
		String choice1;
		String choice2;
		int numInput =0;
		numInput = scan.nextInt();
		scan.nextLine();
		int i = (numInput - 1);
		
		
		
		if (numInput > 10 || numInput < 1) {
			System.out.println("The student does not exist. Please try again. (enter a number 1 - 10): ");
			
			numInput = 0;
			
		
		} else if(numInput>0 && numInput <=10){
			System.out.println("Student " + numInput + " is " + names[i] + ". What would you like to know about "
					+ names[i] + "? (enter \"hometown\" or \"favorite food\"): "); 
			
			
		}
		
		else {System.out.println("Enter a whole number");}
		
		choice1 = scan.nextLine();
		boolean cont3 =true;
		if (choice1.equalsIgnoreCase("hometown")) {
			System.out.println(
					names[i] + " is from " + homeT[i] + ". Would you like to know more? (enter \"yes\" or \"no\"):");
			do {
			choice2 = scan.nextLine();
			if (choice2.equalsIgnoreCase("yes")) {
				System.out.println(names[i] + " favorite food is " + food[i]);
				cont = false;
				cont3=false;
			} else if (choice2.equalsIgnoreCase("no")) {
				cont = false;
				cont3=false;
			} else {
				System.out.println("That data does not exist. Please try again. (enter \"yes\" or \"no\"): ");
			}
		}while(cont3);
		
		
	}	else if (choice1.equalsIgnoreCase("favorite food")) {
			System.out.println(names[i] + "favorite food is " + food[i]
					+ ". Would you like to know more? (enter \"yes\" or \"no\"):");
			boolean cont2 = true;
			do {
				choice2 = scan.nextLine();
			if (choice2.equalsIgnoreCase("yes")) {
				System.out.println(names[i] + "is from " + homeT[i]);
				cont2 = false;
				cont =false;
				
			} else if (choice2.equalsIgnoreCase("no")) {
				
				cont2 = false;
				cont =false;
			} else {
				System.out.println("That data does not exist. Please try again. (enter \"yes\" or \"no\"): ");
			
			}
			}while(cont2);
		} else {

			System.out.println(
					"The data does not exist here is a list of student to choose from pick a number from 1 -10!");
			System.out.println(Arrays.toString(names));
			
			
		}
		}while(cont);
		System.out.println("Thanks!");
		scan.close();
	}
}


	


