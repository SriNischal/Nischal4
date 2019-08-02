package Nischal;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMenu extends Exception {
//declare the list for store the Employee Details Array
	ArrayList<String[]> Employee = new ArrayList<String[]>(100);

	public void Menu()  {
		int options;
		Scanner scan = new Scanner(System.in);
		loop: do {
			System.out.println("MENU");
			System.out.println(" 1. Create Employee\n 2. Fetch Employee\n 3. Delete\n 4.search\n 5. Logout");
			System.out.println("Choose the options");
			options = scan.nextInt();
//switch case for the choose the operation
			switch (options) {
			case 1:
				CreateEmployee createEmp = new CreateEmployee();
				Employee.addAll(createEmp.PersonalDetails());
				break;
			case 2:
				FetchEmployee fetch = new FetchEmployee();
			fetch.FetchEmlpoyee(Employee);
				break;
			case 3:
				DeleteEmployee delete = new DeleteEmployee();
				delete.Delete_Employee(Employee);
				break;
			case 4:
//search the employee based on the name and designation 
				Search_Employee search = new Search_Employee();
				System.out.println("Search Name or Designation");
				System.out.println(" 1) Name\n 2) Designation\n choose Options");
				int Searchvariable = scan.nextInt();
				switch (Searchvariable) {
				case 1:
//search by the name to calling the Search method
					search.Search(Employee);
					break;
				case 2:
//search by the Designation  to calling the Search method
					System.out.println("Enter the Designation to find the Employee's");
					String Designation = scan.next();
					search.Search(Employee, Designation);
					break;
				}
				break;
			case 5:
				System.out.println("Logout successfully");
				break loop;
			}
		} while (true);
		Login log = new Login();
		log.login();
	}
}