package Nischal;

import java.util.Scanner;

public class Employee {
public  void CreateEmployee(){
        System.out.println("enter the number to obtain the details of the employee");
		int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
		String Username;
		String Password;
	switch(n) {	
	case 1:
		Password = "123456";
		Username = "Suraj";
		System.out.println("Enter Username : ");
		String username = sc.next();
		System.out.println("Enter Password : ");
		String password = sc.next();

		if (username.equals(Username) && password.equals(Password)) {

			System.out.println("Access Granted! Welcome!");
		}

		else if (username.equals(Username)) {
			System.out.println("Invalid Password!");
		} else if (password.equals(Password)) {
			System.out.println("Invalid Username!");
		} else {
			System.out.println("Invalid Username & Password!");
		}
      break;
	case 2:
		Password = "1234567";
		Username = "Nischal";
		System.out.println("Enter Username : ");
		String username1 = sc.next();
		System.out.println("Enter Password : ");
		String password1 = sc.next();

		if (username1.equals(Username) && password1.equals(Password)) {

			System.out.println("Access Granted! Welcome!");
		}

		else if (username1.equals(Username)) {
			System.out.println("Invalid Password!");
		} else if (password1.equals(Password)) {
			System.out.println("Invalid Username!");
		} else {
			System.out.println("Invalid Username & Password!");
		}
      break;
	case 3:
		Password = "12345678";
		Username = "Shiva";
		System.out.println("Enter Username : ");
		String username2 = sc.next();
		System.out.println("Enter Password : ");
		String password2 = sc.next();

		if (username2.equals(Username) && password2.equals(Password)) {

			System.out.println("Access Granted! Welcome!");
		}

		else if (username2.equals(Username)) {
			System.out.println("Invalid Password!");
		} else if (password2.equals(Password)) {
			System.out.println("Invalid Username!");
		} else {
			System.out.println("Invalid Username & Password!");
		}
      break;
	case 4:
		Password = "123456789";
		Username = "Magesh";
		System.out.println("Enter Username : ");
		String username3 = sc.next();
		System.out.println("Enter Password : ");
		String password3 = sc.next();

		if (username3.equals(Username) && password3.equals(Password)) {

			System.out.println("Access Granted! Welcome!");
		}

		else if (username3.equals(Username)) {
			System.out.println("Invalid Password!");
		} else if (password3.equals(Password)) {
			System.out.println("Invalid Username!");
		} else {
			System.out.println("Invalid Username & Password!");
		}
      break;
	case 5:
		Password = "1234567890";
		Username = "Hari";
		System.out.println("Enter Username : ");
		String username4 = sc.next();
		System.out.println("Enter Password : ");
		String password4 = sc.next();

		if (username4.equals(Username) && password4.equals(Password)) {

			System.out.println("Access Granted! Welcome!");
		}

		else if (username4.equals(Username)) {
			System.out.println("Invalid Password!");
		} else if (password4.equals(Password)) {
			System.out.println("Invalid Username!");
		} else {
			System.out.println("Invalid Username & Password!");
		}
      break;
	}

}







}
