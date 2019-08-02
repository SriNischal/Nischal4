package Nischal;

import java.util.Scanner;

public class Fibonacci {
	Scanner sc = new Scanner(System.in);

	public void FibonacciSeries() {
		int number1 = 0, number2 = 1;

		int count = sc.nextInt();
		for (int i = 2; i <= count; ++i) {
			int number3 = number1 + number2;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;
		}
	}
}
