package Nischal;

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;

public class Create {
	private String[] args;

	public void dispaly() throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter how many employees details has to be created");
		int size = scan.nextInt();
		int[] a = new int[size];
		InputStream in = System.in;
		for (int i = 0; i < a.length; i++) {
			System.out.println("create Employee details of:" + (i+1));
			System.out.println("enter the Employee_id");
			int Employee_id = scan.nextInt();
			System.out.println("enter the Employee_name");
			String Employee_name = scan.next();
			System.out.println("enter the Employee_age");
			int Employee_age = scan.nextInt();
			System.out.println("enter the Employee_Designation");
			String Employee_Designation = scan.next();
			System.out.println("enter the Employee_salary ");
			double Employee_salary = scan.nextDouble();
            BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:\\Users\\Srinischal.Thiparani\\git\\Nischal\\Calculator\\src\\Nischal\\Create.txt",true));
			String s = "\n" + Employee_id + "," + Employee_name + "," + Employee_age + "," + Employee_Designation + "," + Employee_salary + "\n";
			bw.write(s);
			bw.flush();
				
		}
		
	Fetch.main(args);	
	}

	
}