package org.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.cars.*; 
import org.study.interfaces.*;

public class App{

	public static void main(String[] args) {

		//Car swift = new Swift();
		//Car corolla = new Corolla();
		//System.out.println(swift.specs());
		//System.out.println(corolla.specs());
		
		//Corolla cr = new Corolla();
		//System.out.println(cr.specs());
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("corolla" , Car.class);
		myCar.specs();
		System.out.println(myCar.specs());
		context.close();
		
		
	}

	
}
