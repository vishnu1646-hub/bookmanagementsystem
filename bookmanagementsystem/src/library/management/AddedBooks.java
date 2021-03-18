package library.management;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddedBooks {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<BooksInLibrary> aLibraries = new ArrayList<>();

	public void booksStorage() {
		aLibraries.add(new BooksInLibrary(1, "ikigai", 10));
		aLibraries.add(new BooksInLibrary(2, "attitude is everything", 10));
		aLibraries.add(new BooksInLibrary(3, "think and grow rich", 9));
		aLibraries.add(new BooksInLibrary(4, "lifes amazing secrets", 8));
		aLibraries.add(new BooksInLibrary(5, "the rudest book ever", 8));
		aLibraries.add(new BooksInLibrary(6, "deep learn", 7));
		aLibraries.add(new BooksInLibrary(7, "you can win", 7));
		aLibraries.add(new BooksInLibrary(8, "the power of habit", 6));
		aLibraries.add(new BooksInLibrary(9, "dharma", 6));
		aLibraries.add(new BooksInLibrary(10, "secret", 15));

	}

	public void addingBooks() {
		System.out.println("Books present are : ");
		booksStorage();
		display(aLibraries);
	}

	public void display(ArrayList<BooksInLibrary> aLi) {
		aLi.stream().collect(Collectors.toList()).forEach(s -> {
			System.out.println("Id: " + s.bookId + " ,BookName: " + s.bookName + " ,BookRating: " + s.bookRating);
		});
	}

	public void modify() {
		booksStorage();
		System.out.println("if you wanna -add- books or -remove- books type meaningful word:");
		String word = scanner.nextLine();
		if (word.equalsIgnoreCase("add")) {
			System.out.println("Add bookName :");
			String bookName = scanner.nextLine();
			System.out.println("Add Book Id :");
			int bookId = scanner.nextInt();
			System.out.println("Add Book rating");
			int bookRating = scanner.nextInt();
			aLibraries.add(new BooksInLibrary(bookId, bookName, bookRating));
			System.out.println("showing book list with added information ");
			showing(aLibraries);
		} else if (word.equalsIgnoreCase("remove")) {
			System.out.println("please mention Id if you wanna delete a particular book:");
			int index = scanner.nextInt();
			int ac = index - 1;
			aLibraries.remove(ac);
			System.out.println("*******");
			removing(aLibraries);
		}
	}

	public void toGet(int i) {
		if(i<=10){
		int index = i - 1;
		booksStorage();
		BooksInLibrary ref = aLibraries.get(index);
		System.out.println();
		System.out.println("the book you bought is :");
		System.out.println("Id: " + ref.bookId + " ,BookName: " + ref.bookName + " ,BookRating: " + ref.bookRating);
		System.out.println("**********Thank You for Visiting**********");
		}else{
			System.out.println("Wrong Id");
		}
	}

	public void removing(ArrayList<BooksInLibrary> aLibraries2) {
		System.out.println("list after removing particular book:");
		aLibraries2.stream().collect(Collectors.toList()).forEach(s -> {
			System.out.println("Id: " + s.bookId + " ,BookName: " + s.bookName + " ,BookRating: " + s.bookRating);
		});

	}

	public void showing(ArrayList<BooksInLibrary> aLibraries2) {
		aLibraries2.stream().collect(Collectors.toList()).forEach(s -> {
			System.out.println("Id: " + s.bookId + " ,BookName: " + s.bookName + " ,BookRating: " + s.bookRating);
		});

	}

}