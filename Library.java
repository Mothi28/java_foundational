package com.library.management.system;

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
		libMem.setNoOfBooksInHand(2);


		LibraryOperations libOperation = new LibraryOperations();
		libOperation.addBooks(book1);
		libOperation.addMembers(libMem);
		
		libOperation.listAllBooks();
		libOperation.listAllMembers();
		System.out.println(libOperation.searchBook("mothi"));
		
	}
}
