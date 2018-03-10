package com.usingScanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//		// for reading string use scanner.nextLine()
		System.out.print("Enter some string: ");
		String someString = scanner.nextLine();
		System.out.println("you entered - " + someString);

		//		// for reading int use scanner.nextInt()
		System.out.print("Enter some int: ");
		int someInt = scanner.nextInt();
		System.out.println("you entered integer - " + someInt);

		//		// for reading float use scanner.nextFloat()
		System.out.print("Enter some float: ");
		float someFloat = scanner.nextFloat();
		System.out.println("you entered float- " + someFloat);

		//		// for reading double use scanner.nextDouble()
		System.out.print("Enter some double: ");
		double someDouble = scanner.nextDouble();
		System.out.println("you entered double " + someDouble);

	}
}
