package arrayList;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderProcessor {
	int bookCount;
	Scanner scan = new Scanner(System.in);

	ArrayList<Book> getOrderfromCustomer() {
		// returning arraylist of type book
		System.out.println("enter the number of books to count: ");
		try {
			bookCount = scan.nextInt();
		} catch (InputMismatchException  Exception1) {
			System.err.println("enter only integer values");
		}
		ArrayList<Book> bookList = new ArrayList<Book>();

		Book oBook[] = new Book[bookCount];
		// directly input given to book

		for (int Intindex = 0; Intindex < bookCount; Intindex++) {

			oBook[Intindex] = getBookDataFromCustomer(bookCount);

			bookList.add(oBook[Intindex]);

		}
		return bookList;

	}

	Book getBookDataFromCustomer(int bookCount) {
		int id, quantity;
		String bookName, author, publisher;

		System.out.println("Enter id");
		id = scan.nextInt();
		System.out.println("Enter quantity");
		quantity = scan.nextInt();
		System.out.println("Enter name");
		bookName = scan.next();
		System.out.println("Enter author");
		author = scan.next();
		System.out.println("Enter publisher");
		publisher = scan.next();

		Book oBook1 = new Book(bookName, author, publisher, id, quantity);

		return oBook1;

	}

	void printOrderDetails(ArrayList<Book> bookList) {
		ArrayList<Book> tempVar = new ArrayList<Book>(bookList);
		for (Book oBook : tempVar) {

			System.out.println("BOOK STORE");
			System.out.println("Book id: " + oBook.id);
			System.out.println("Book quantity: " + oBook.quantity);
			System.out.println("Book name: " + oBook.bookName);
			System.out.println("Book author name: " + oBook.author);
			System.out.println("Book publisher name: " + oBook.publisher);
		}

	}
}
