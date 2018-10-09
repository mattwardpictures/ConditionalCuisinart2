package lab_3_package;

import java.util.Scanner;

public class ConditionalCuisinart {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String userName;
		String continueProgram;
		int userInt;

		// A Greeting...:
		System.out.println("=================================");
		System.out.println("Welcome to Conditional Cuisinart!");
		System.out.println("=================================");
		System.out.println(" ");
		System.out.println("What's your name?");
		userName = scnr.next();

		System.out.println(" ");
		System.out.println("Hello, " + userName + ".");

		do {
			System.out.println(" ");
			System.out.println("Feed me an integer between 1 and 100, and press Enter.");
			userInt = scnr.nextInt();
			while ((userInt < 1) || (userInt > 100)) { // While this condition exists, ...
				System.out.println(userInt + " is invalid. Come at me again, " + userName + "!");
				userInt = scnr.nextInt(); // ...print the above. Otherwise, read the input...
			} // ...and then perform the following:
			/*
			 * What's the one thing you can do with all even numbers that absolutely cannot
			 * be done with odds? Divide by two and get a whole number, that's what! Hence
			 * the modulus % 2.
			 */
			if ((userInt % 2 != 0) && (userInt <= 60)) {
				System.out.println(" ");
				System.out.println("Your integer is ODD, " + userName + ".");
				System.out.println("(Not that there's anything wrong with that.)");
			}
			if ((userInt % 2 == 0) && (userInt >= 2) && (userInt <= 25)) {
				System.out.println(" ");
				System.out.println("Your integer is EVEN, and less than 25, " + userName + "!");
			}
			if ((userInt % 2 == 0) && (userInt >= 26) && (userInt <= 60)) {
				System.out.println(" ");
				System.out.println("Your integer is EVEN, " + userName + "!");
			}
			if ((userInt % 2 == 0) && (userInt > 60)) {
				System.out.println(" ");
				System.out.println(userInt + " is EVEN, " + userName + "!");
			}
			if ((userInt % 2 != 0) && (userInt > 60)) {
				System.out.println(" ");
				System.out.println(userInt + " is ODD, and over 60.");
				System.out.println("Damn, " + userName + "!");
			}
			/*
			 * After executing the above, execute below:
			 */
			System.out.println(" ");
			System.out.println("Continue? (y/n)");
			continueProgram = scnr.next();
		} while (continueProgram.charAt(0) == 'y');

		System.out.println(" ");
		System.out.println("Very well, " + userName + ". See you later!");

		scnr.close();

	} // AND THAT'S THE END!

}
