package library.management;

import java.util.Scanner;

public class Admin {
	static Scanner scanner = new Scanner(System.in);
	AddedBooks a1 = new AddedBooks();

	public void checkingAdmin() {
		System.out.println("please enter the password :");
		String password = scanner.nextLine();
		check1(password);
	}

	public void check1(String string) {
		String actualValue = "dontknow";
		if (string.equals(actualValue)) {
			actualWork();
		} else {
			checkingAdmin();
		}
	}

	public void actualWork() {
		System.out.println("Hello Admin");
		System.out.println("if you wanna view or manage books list please type view or manage :");
		String vi = scanner.nextLine();
		if (vi.equalsIgnoreCase("view")) {
			a1.addingBooks();
		} else if (vi.equalsIgnoreCase("manage")) {
			a1.modify();
		}

	}

}