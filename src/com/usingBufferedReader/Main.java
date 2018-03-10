package com.usingBufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = reader.readLine();
		System.out.println("Your name is: " + name);
	}
}
