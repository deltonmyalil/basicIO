package com.usingConsole;

import java.io.Console;

// Console can be used to read without echoing. Useful to read passwords.
// Will give NullPointerException when run on intelliJ
// Need console

public class Main {
	public static void main(String[] args) {
		Console console = System.console();
		System.out.print("Enter username: ");
		String username = console.readLine();
		System.out.print("Enter Password: ");
		char[] password = console.readPassword();  //reads only char[]
	}
}
