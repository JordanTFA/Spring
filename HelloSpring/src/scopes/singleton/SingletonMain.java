package scopes.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld)context.getBean("singleton");
		
		objA.setMessage("I'm object A!");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld)context.getBean("singleton");
		objB.getMessage();

	}

}
