package com.library.service;

import com.library.bean.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookImpl implements IBook {

	ArrayList<Book> booklist = new ArrayList<Book>();

	@Override
	public void addBook(Book book) {
		booklist.add(book);
	}

	public void serializebook() {
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		try {
			fs = new FileOutputStream("testbook.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(booklist);
			System.out.println("before serialization");
			System.out.println(booklist);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

		finally {
			try {

				if (os != null)
					os.close();
				if (fs != null)
					fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
	
	public ArrayList<Book> deserialize()
	{

		FileInputStream fs =null;
		ObjectInputStream os = null;
		
		ArrayList<Book> deserial;
		try {
			fs=new FileInputStream("testbook.ser");
			os=new ObjectInputStream(fs);
			deserial=(ArrayList<Book>)os.readObject();
			System.out.println("before serialization");
			System.out.println(booklist);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try{
			os.close();
			fs.close();
			
		}catch (Exception e)
		{e.printStackTrace();}
		}
		return deserial;
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Serialize() {
		// TODO Auto-generated method stub
		
	}

	
	}
	

