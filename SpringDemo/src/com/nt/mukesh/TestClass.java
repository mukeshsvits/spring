package com.nt.mukesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
             //read spring config container    
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	//get the bean from spring container
		Trainer train = context.getBean("testdrive",Trainer.class);
		//call a method on the bean
		System.out.println(train.getTraining());
		context.close();
	}

}
