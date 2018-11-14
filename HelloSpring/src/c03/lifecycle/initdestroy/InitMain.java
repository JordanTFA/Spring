package c03.lifecycle.initdestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("c03/lifecycle/initdestroy/Beans.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("initDestroy");
		obj.getMessage();
		context.registerShutdownHook();

	}

}