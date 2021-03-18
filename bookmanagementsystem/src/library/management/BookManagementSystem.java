package library.management;

import java.util.Scanner;

public class BookManagementSystem {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("//////////*****Welcome To Techouts Book Management System*****\\\\\\\\\\");
		ask();

	}

	public static void ask() {
		System.out.println("please mention if you are admin or user :");
		String name = scanner.nextLine();
		User user = new User();
		Admin admin = new Admin();
		if (name.equalsIgnoreCase("user"))
			user.usersData();
		else if (name.equalsIgnoreCase("admin"))
			admin.checkingAdmin();
		else
			ask();

	}

}
