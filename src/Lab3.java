import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {


		// declare variables and scan
		String userInput;
		Scanner num = new Scanner(System.in);

		// begin in a place that will not be redundant if the user chooses to continue
		do { System.out.println("Please enter a number 1 - 100: ");

			// this is a good place to assign the variable so that it wont keep showing up during iteration 
			int userNum = num.nextInt();

			if (userNum % 2 != 0 && userNum <= 60) {
				System.out.println(userNum + " is an odd number.");
			} else if (userNum >= 2 && userNum <= 25 && userNum % 2 == 0) {
				System.out.println(userNum + "is a number that is even and less than 25.");
			} else if (userNum >= 26 && userNum % 2 == 0) {
				System.out.println(userNum + " is an even number.");
			} else if (userNum > 60 && userNum % 2 != 0) {
				System.out.println(userNum + " is an odd number over 60.");
			} 

			// ask if user would like to continue
			System.out.println("would you like to continue (y/n) ?");
			Scanner cont = new Scanner(System.in);
			userInput = cont.next();
		} while (userInput.equalsIgnoreCase("Y"));
		num.next();

	}

}
