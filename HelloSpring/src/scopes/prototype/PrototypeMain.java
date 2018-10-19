package scopes.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld)context.getBean("prototype");
		
		objA.setMessage("I'm object A!");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld)context.getBean("prototype");
		objB.getMessage();

	}

}
