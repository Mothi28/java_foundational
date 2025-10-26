package com.library.management.system;

import lombok.Data;


/*
 * Using Data of Lombok can generate the getters, setters, toString automatically. 
 * 
 * */
//@Data
public class Book {

	 private int bookId; 
	 private String bookName;
	 private String author;
	 private boolean isAvailableOrNot;
	
	 
	 public Book(int bookId, String bookName, String author, boolean isAvailableOrNot) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.isAvailableOrNot = isAvailableOrNot;
	}
	public Book() {
		// TODO Auto-generated constructor stub
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvailableOrNot() {
		return isAvailableOrNot;
	}
	public void setAvailableOrNot(boolean isAvailableOrNot) {
		this.isAvailableOrNot = isAvailableOrNot;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", isAvailableOrNot="
				+ isAvailableOrNot + "]";
	}
	
}
