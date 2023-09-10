package com.mendonca.part8;

public class Book {

	private String author;
	private String title;
	private int page;
	private Type type;
	
	public Book(String author, String title, int page, Type type) {
		super();
		this.author = author;
		this.title = title;
		this.page = page;
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", page=" + page + ", type=" + type + "]";
	}
	
	
	
}
