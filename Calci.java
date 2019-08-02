
package Nischal;

import java.util.Scanner;

public class Calci extends Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String option;
		Calculator calc = new Calculator();
		for (;;) {
			System.out.println("Enter the method to calculate");
			System.out.println(
					"One.Addition Two.Subtraction Three.Multiplication Four.Division");
			option = s.nextLine();
			switch (option) {
			case "One":
				System.out.println("Addition");
				calc.addition();
				break;
			case "Two":
				System.out.println("Subtraction");
				calc.subtraction();
				break;
			case "Three":
				System.out.println("Multiply");
				calc.multiplication();
				break;
			case "Four":
				System.out.println("Division");
				calc.division();
				break;
			default:
				System.out.println("please enter the correct option with matching uppercase and lowercase letters");
				break;
			}
		}
	}

}