package system;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dont have an account? Create an account by pressing 1");

		System.out.println("If you have an account press 2 to enter login info");
		int number = input.nextInt();
		if (number == 1)
			Registration.main(args);
		else if (number == 2) {
			Login.main(args);
		}

	}

}
