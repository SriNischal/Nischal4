package Nischal;

import java.util.Scanner;

public class Menudriven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the operation required:");
		System.out.println("1.Factorial 2.Prime number 3.Fibonacci");
		System.out.println("enter the value of n:");
		n = sc.nextInt();

		Factorial fact = new Factorial();
		Primenumber prime = new Primenumber();
		Fibonacci fibo = new Fibonacci();

		switch (n) {
		case 1:
			System.out.println();
			fact.FactorialNumber();
			break;
		case 2:
			System.out.println();
			prime.NextPrimeNumber();
			break;
		case 3:
			System.out.println();
			fibo.FibonacciSeries();

			break;

		}
	}
}
