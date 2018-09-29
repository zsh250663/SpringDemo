package com.zsh.yhd.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Book book = new Book();
//    	book.setBookName("xxxx");
    	
    	ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//    	Book book = (Book) applicationContext.getBean("mybook");
//    	System.out.println(book);
    	
    	Student student = (Student) applicationContext.getBean("myStudent");
    	System.out.println(student);
    }
}