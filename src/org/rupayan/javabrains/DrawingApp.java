package org.rupayan.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle= new Triangle();
		
		//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("springDemo.xml"));
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springDemo.xml");
		
		//Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		System.out.println("Type: " + triangle.getType());
	}

}
