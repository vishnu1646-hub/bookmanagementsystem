package library.management;

public class BooksInLibrary {
	int bookId;
	String bookName;
	int bookRating;

	public BooksInLibrary(int bookId, String bookName, int bookRating) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookRating = bookRating;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookRating() {
		return bookRating;
	}

	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}

}
