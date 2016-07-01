package com.library.service;
import java.util.ArrayList;
import java.util.List;

import com.library.bean.*;
public interface IBook {	
	
		 
		void addBook(Book book);
		List<Book> getAllBooks();
		List<Book> getBookByAuthor(String author);
		List<Book> getBookByCategory(String category);
		public void Serialize();
		public ArrayList<Book> Deserialize();  
  
	
}
