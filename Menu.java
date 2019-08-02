package Nischal;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) throws Exception  
		{
		Scanner scan=new Scanner(System.in);
		Login login=new Login();
		Create input=new Create();
		int option;
		System.out.println("1.EMPLOYEE MANAGEMENT 2.FILEHANDLING EMPLOYEE MANAGEMENT");
		System.out.println("Choose the required option");
		option=scan.nextInt();
		switch(option) {
		case 1:
		System.out.println("EMPLOYEE MANAGEMENT");
		Login.login();
		case 2:
		System.out.println("FILEHANDLING EMPLOYEE MANAGEMENT");
		input.dispaly();
		}
		}
}
