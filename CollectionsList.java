package com.library.management.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsList {
	
	public static void main(String [] args) {
	
	List<String> bookList = new ArrayList<String>(); //ArrayList Implementation 
	bookList.add("Good Vibes,Good life");
	bookList.add("Spring in action");
	bookList.add("12 years");
	
	System.out.println("ArrayList "+bookList);

	
	List<String> bookLinkedList = new LinkedList<String>(); //LinkedList Implemenation 
	bookLinkedList.add("Lost in secret");
	bookLinkedList.add("Origin of secrets");
	
	
	System.out.println("LinkedList "+bookLinkedList);
	
	ListIterator<String> bookListIterator = bookList.listIterator(); //ListIterator created with bookList arrayList. 
	//ListIterator is bi-directional. Elements can be traversed with both forward and backward. 
	
	//Move iterator to the END of the bookListIterator
	while (bookListIterator.hasNext()) {
		bookListIterator.next();
	}
	
	
	while(bookListIterator.hasPrevious()) {
		String avl=bookListIterator.previous();
		if(avl.equals("12 years")) {
			//bookListIterator.remove();
			bookListIterator.set("AWS");
		}
	}
	System.out.println("ArrayList after making changes "+bookList);
	
	
	Iterator<String> bookLinkedListIterator = bookLinkedList.iterator(); //ListIterator created with bookList arrayList. 
	//Iterator is uni-directional. Elements can be traversed with forward. 

	while(bookLinkedListIterator.hasNext()) {
		System.out.println("Books in LinkedList Iterator "+bookLinkedListIterator.next());
		
	}
}
}