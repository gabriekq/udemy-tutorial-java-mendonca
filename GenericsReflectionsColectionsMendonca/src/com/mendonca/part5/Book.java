package com.mendonca.part5;

import java.util.Comparator;

public class Book  implements Comparator<Book> {// implements Comparable<Book> {

	private String name;
	private String title;
	private int numberOfPages;

	public Book() {

	}

	public Book(String name, String title, int numberOfPages) {
		super();
		this.name = name;
		this.title = title;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", title=" + title + ", numberOfPages=" + numberOfPages + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public int compare(Book book, Book book2) {
		
	return Integer.compare(book.getNumberOfPages()  , book2.getNumberOfPages())	;
		
	
	}

	/*
	 * @Override public int compareTo(Book book) {
	 * 
	 * // return this.getName().compareTo(book.getName());
	 * 
	 * if (this.getNumberOfPages() > book.getNumberOfPages()) { return 1; }
	 * 
	 * if (this.getNumberOfPages() < book.getNumberOfPages()) { return -1; }
	 * 
	 * return 0; }
	 */

}
