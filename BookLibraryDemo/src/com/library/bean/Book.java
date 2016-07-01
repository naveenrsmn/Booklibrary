package com.library.bean;

import java.io.Serializable;

public class Book implements Serializable {

	private String title,author;
	private double bookid;
	private String category;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double bookid, String category) {
		super();
		this.title = title;
		this.author = author;
		this.bookid = bookid;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getBookid() {
		return bookid;
	}
	public void setBookid(double bookid) {
		this.bookid = bookid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookid=" + bookid + ", category=" + category + "]";
	}
	
	
	
}
