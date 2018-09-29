package com.zsh.yhd.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String bookName;
	
//	public Book(String bookName) {
//		super();
//		this.bookName = bookName;
//	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}
}
