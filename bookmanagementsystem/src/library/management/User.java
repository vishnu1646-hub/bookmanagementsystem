package library.management;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class User {
	static Scanner scanner = new Scanner(System.in);
	AddedBooks a1 = new AddedBooks();

	public void usersData() {
		ArrayList<String> aList1 = new ArrayList<>();
		System.out.println("please enter username :");
		String userName = scanner.nextLine();
		String currentName = "vishnu";
		String currentName1 = "balaji";
		String currentName2 = "srikanth";
		if (userName.equalsIgnoreCase(currentName)) {
			ArrayList<String> aList = new ArrayList<>();
			aList.add("power of your subconsious mind by joseph murphy");
			aList.add("thinking out of box by sudha murthty");
			aList.add("think like a monk by jay shetty");
			aList.add("The Immortals of Meluha by Amish Tripathi");
			System.out.println("Already purchased books of " + userName + " are :");
			aList.stream().collect(Collectors.toList()).forEach(System.out::println);
			System.out.println();
			additionalData(userName);
		} else if (userName.equalsIgnoreCase(currentName1)) {
			ArrayList<String> aList = new ArrayList<>();
			aList.add("Bhagavath Gita by ISCKON");
			aList.add("Alchemist by paulo coelho");
			aList.add("you can win by shiv kher");
			System.out.println("Already purchased books of " + userName + " are :");
			aList.stream().collect(Collectors.toList()).forEach(System.out::println);
			System.out.println();
			additionalData(userName);
		} else if (userName.equalsIgnoreCase(currentName2)) {
			ArrayList<String> aList = new ArrayList<>();
			aList.add("Two States by chetan bhagath");
			aList.add("Wings of Fire by A.P.J.Abdul kalam");
			aList.add("DEATH by sadhguru");
			System.out.println("Already purchased books of " + userName + " are :");
			aList.stream().collect(Collectors.toList()).forEach(System.out::println);
			System.out.println();
			additionalData(userName);
		} else {
			System.out.println("please register your name here :");
			String string = scanner.nextLine();
			aList1.add(string);
			additionalData(string);

		}

	}

	public void additionalData(String s6) {
		System.out.println("Available books are :");
		a1.addingBooks();
		task();
	}

	public void task() {
		System.out.println("if you want to buy a new book type yes else no");
		String action = scanner.nextLine();
		if (action.equalsIgnoreCase("yes")) {
			System.out.println("please select bookId:");
			int i = scanner.nextInt();
			a1.toGet(i);
		} else if (action.equalsIgnoreCase("no")) {
			System.out.println("**********Thank You for Visiting**********");
		} else {
			task();
		}
	}

}
