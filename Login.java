package system;
import java.util.Scanner;
public class Login {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		User u1 = new User();

		System.out.println("Enter username");
		String username = input.next();
		if (username == u1.getUsername())
		

		System.out.println("Enter password");
		String password = input.next();
		if (password == u1.getPassword());

	}

}
