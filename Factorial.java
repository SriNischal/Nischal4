package Nischal;

import java.util.*;

public class Factorial {

	Scanner scan = new Scanner(System.in);

	public void FactorialNumber() {
		int number = scan.nextInt();
		int mul = 1;
		if (number < 0)
			System.out.println("error");
		else {
			for (int i = number; i > 0; i--)

				mul = mul * i;
		}
		System.out.println(mul);

	}

}
