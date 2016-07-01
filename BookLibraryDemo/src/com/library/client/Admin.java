package com.library.client;

import java.util.Scanner;

import com.library.bean.Book;
import com.library.service.BookImpl;
import com.library.service.IBook;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		IBook o1 = new BookImpl();
		for(int i=0;i<2;i++)
		{
			Book book = new Book();
			System.out.println("Enter Title");
			
			book.setTitle(sc.next());
			System.out.println("Enter Author");
			book.setAuthor(sc.next());
			System.out.println("Enter Category");
			book.setCategory(sc.next());
			System.out.println("Enter BookID");
			book.setBookid(sc.nextDouble());
			
			o1.addBook(book);
		}
		o1.();
		sc.close();
	
	}

}
