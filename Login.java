package Nischal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {
	public static void login()  {
		Scanner scan = new Scanner(System.in);
		String user_name = "Nischal";
		String pass_word = "123456";
		System.out.println("Enter username");
		String user_name1 = scan.nextLine();
		System.out.println("Enter password");
		String password1 = scan.nextLine();
		if (user_name.equals("Nischal") && pass_word.equals("123456")) {
			System.out.println("Logged in successfully");
			EmployeeMenu emp = new EmployeeMenu();
			emp.Menu();
		} else {
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
	}
}