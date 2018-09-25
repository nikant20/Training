package com.opteamix.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opteamix.Book;

public class TestBook {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("operators.xml");
		Book book = (Book) context.getBean("book");
		System.out.println("*********Before Update***************");
		System.out.println("ISBN no: "+book.getIsbn());
		System.out.println("Author Name: "+book.getAuthor());
		System.out.println("Book price: "+book.getPrice());
		System.out.println("Title: "+book.getTitle());
		System.out.println("*************After Update************");
		book.setAuthor("Harekrishna");
		book.setPrice(10000);
		System.out.println(book.getIsbn()+" "+book.getTitle()+" "+book.getPrice()+" "+book.getAuthor());
		

	}

}
