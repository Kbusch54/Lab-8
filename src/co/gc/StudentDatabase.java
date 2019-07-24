package co.gc;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDatabase {

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
		boolean cont =true;
		while(cont) {
			
		String choice1;
		String choice2;
		int numInput;
		numInput = scan.nextInt();
		int i = (numInput - 1);
		boolean cont4 = true;
		while(cont4) {
		
		scan.nextLine();
		if (numInput > 10 || numInput < 1) {
			System.out.println("The student does not exist. Please try again. (enter a number 1 - 10): ");
			numInput=scan.nextInt();
			
		} else if(numInput>0 && numInput <=10){
			System.out.println("Student " + numInput + " is " + names[i] + ". What would you like to know about "
					+ names[i] + "? (enter \"hometown\" or \"favorite food\"): "); 
			cont4=false;
			cont=false;
		}
		else {System.out.println("Enter a whole number");}
		choice1 = scan.nextLine();
		boolean cont3 =true;
		if (choice1.equalsIgnoreCase("hometown")) {
			System.out.println(
					names[i] + " is from " + homeT[i] + ". Would you like to know more? (enter \"yes\" or \"no\"):");
			while(cont3) {
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
		}
		
		
	}	else if (choice1.equalsIgnoreCase("favorite food")) {
			System.out.println(names[i] + "favorite food is " + food[i]
					+ ". Would you like to know more? (enter \"yes\" or \"no\"):");
			choice2 = scan.nextLine();
			boolean cont2 = true;
			while(cont2)
			if (choice2.equalsIgnoreCase("yes")) {
				System.out.println(names[i] + "is from " + homeT[i]);
				cont2 = false;
				cont =false;
			} else if (choice2.equalsIgnoreCase("no")) {
				cont = false;
				cont2 = false;
			} else {
				System.out.println("That data does not exist. Please try again. (enter \"yes\" or \"no\"): ");
				choice2 = scan.nextLine();
			}
		} else {

			System.out.println(
					"The data does not exist heres a list of student to choose from");
			System.out.println(Arrays.toString(names));
			
		}
		}
		System.out.println("Thanks!");
		scan.close();
	}
}
}
