package Nischal;

import java.util.Scanner;

public class Primenumber {
	Scanner sc = new Scanner(System.in);

	public void NextPrimeNumber() {
		System.out.println("enter the prime number");
		int number = sc.nextInt();
		int prime_number = number + 1;
		for (int i = 2; i <= (prime_number + 1) / 2; i++) {
			if (prime_number % i == 0) {

				prime_number++;
			}

		}
		System.out.println(" " + prime_number);

	}
}