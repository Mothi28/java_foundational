package com.library.management.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library extends LibraryOperations {

	public static void main(String args[]) {
		/*private int bookId; 
		 private String bookName;
		 private String author;
		 private boolean isAvailableOrNot;*/
		Book book1 = new Book(1,"The Two ways of life","Mothi S",true); //One Way-->Setting value of Book via Parameterized Constructor. 
		
		LibraryMember libMem = new LibraryMember(); //Second way--->Setting value of Members via setters methods. 
		libMem.setMemberId(119);
		libMem.setMemberName("Vicky");
		
		/*Use Arrays.asList() when you just need a read-only or fixed-size list (e.g., for constants or testing).

		Use new ArrayList<>() when you plan to add or remove elements dynamically.
		*/
		
		List<Integer> issuedBooks = Arrays.asList(4, 2, 3);
		libMem.setNoOfBooksInHand(new ArrayList<Integer>(issuedBooks));


		LibraryOperations libOperation = new LibraryOperations();
		libOperation.addBooks(book1);
		libOperation.addMembers(libMem);

		libOperation.listAllBooks();
		libOperation.listAllMembers();
		System.out.println(libOperation.searchBook("mothi"));
		
		libOperation.issueBook(1,119);
		libOperation.listAllMembers();
		libOperation.listAllBooks();

	}
}
