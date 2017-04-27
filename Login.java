package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		// Sql address

		String url = "jdbc:mysql://localhost:3306/reservation?useSSL=false";
		String user = "root";
		String password = "1145";

		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		Scanner input = new Scanner(System.in);
		User u2 = new User();

		System.out.println("Type 1 if you forgot password or type 2 to enter login info");
		int number = input.nextInt();

		if (number == 1) {
			ForgotPassword.main(args);
		} else if (number == 2) {
			System.out.println("Enter username");
			String username = input.next();

			System.out.println("Enter password");
			String passcode = input.next();

			try {
				// Login

				// get connection to database

				Connection myConn = DriverManager.getConnection(url, user, password);

				// Create statement

				myStmt = myConn.prepareStatement("select ? From bookflight WHERE UserName=?");

				// set perameters
				myStmt.setString(1, "FlightNum");
				myStmt.setString(2, username);

				// execute
				myRs = myStmt.executeQuery();

				System.out.println("Select Complete");

			} catch (Exception ex) {
				System.out.println("Did not work");
			}
		           System.out.println("Enter 0 to go back to main menu \n Enter 1 to search for flight "
					+ "by depart city \n Enter 2 to search for flight based on arrival city \n Enter 3 to book/delete a flight"
					+ "\n or 4 to terminate ");
			number = input.nextInt();
			if (number == 0)
				MainMenu.main(args);
			else if (number == 1)
				SearchFlightFromCity.main(args);
			else if (number == 2)
				SearchFlightToCity.main(args);
			else if (number == 3)
				AddFlight.main(args);
			else if (number == 4)
				System.exit(0);
		}
	}

}
