package Nischal;

import java.util.ArrayList;

/**
 * fetch employee class is have the Fetch Employee constructor And this
 * fetchEmployee class is inherited by the createEmployee class
 */
public class FetchEmployee extends CreateEmployee {
// this constructor is implementing the fetching the details of employee based on the employee id 
	public void FetchEmlpoyee(ArrayList<String[]> employe) {
		if (employe.isEmpty()) {
			System.out.println("Employee database is empty");
		} else {
			System.out.println("Enter the Employee id to find the Employee");
			int Emp_id = sc.nextInt();
			System.out.println("Employee_id\t Employee_name\t Employee_age\t Employee_Designation \t Employee_salary");
			for (int initial1 = 0; initial1 < employe.size(); initial1++) {
				String[] TempEmp = employe.get(initial1);
				if (TempEmp[0].equals(Integer.toString(Emp_id))) {

					for (String str : TempEmp) {
						System.out.printf(str + "\t\t");
					}
					System.out.println();
				}

			}
		}
	}

}