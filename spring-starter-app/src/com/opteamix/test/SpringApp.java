package com.opteamix.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opteamix.Customer;
import com.opteamix.ID;
import com.opteamix.TestScope;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	    System.out.println("****************Context Intialized*******************");
		ID id = (ID) applicationContext.getBean("obj1");
	    id.display();  	
	    
	    TestScope t1 = (TestScope) applicationContext.getBean("test1");
	    TestScope t2 = (TestScope) applicationContext.getBean("test1");
	    
	    System.out.println("Compare address, t1==t2: "+(t1==t2));
	    
	}
}
