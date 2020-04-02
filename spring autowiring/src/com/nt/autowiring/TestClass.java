package com.nt.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
             //read spring config container  
		car vech = new  car();
		TestDriving train = new TestDriving(vech);
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml ");
	//get the bean from spring container
//		Trainer train = context.getBean("testDriving",Trainer.class);
		//call a method on the bean
		System.out.println(train.getDailyworkout());
		System.out.println(train.getTraining());
//		context.close();
	}

}
