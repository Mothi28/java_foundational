package com.library.management.system;

import java.util.ArrayList;
import java.util.List;

public class LibraryOperations {

	//listAllBooks()
	//listAllMembers()
	//searchBook(String keyword)
	private List<Book> books = new ArrayList<Book>();
	private List<LibraryMember> members = new ArrayList<LibraryMember>();

	
	public void addBooks(Book bookObj) {
		
	books.add(bookObj);

	}
	
	public void addMembers(LibraryMember memObj) {
		
		members.add(memObj);

		}
	
	
	public void listAllBooks() {
		
		for(Book book:books) {
			System.out.println(book.toString());
		}
		
		//return null;
		//return 
	}
	
	public void listAllMembers() {
		
		for(LibraryMember mem:members) {
			System.out.println(mem.toString());
		}
		
		//return null;
		//return 
	}
	
	public List<Book> searchBook(String keyword){
		
		keyword=keyword.toLowerCase();
		for(Book book:books) {
			if(book.getAuthor().toLowerCase().contains(keyword)||(book.getBookName().toLowerCase().contains(keyword))){
				System.out.println("Found the book ");
				return books;
			}
		}
		
		System.out.println("Sorry no such book!!");
		return null;
	}
    public void issueBook(int bookId,int memberId) {
		
		for(Book book:books) {
			if(book.getBookId()==bookId && book.isAvailableOrNot()==true) {
				for (LibraryMember mem:members) {
					if(mem.getMemberId()==memberId) {
						mem.getNoOfBooksInHand().add(bookId);
						book.setAvailableOrNot(false);
						break;
					}
				}
			}
		}
		
	}
}
