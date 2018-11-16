package c10.annotation.jsr250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JSR250Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("c10/annotation/jsr250/Beans.xml");
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		
		hw.getMessage();
		context.registerShutdownHook();
	}
}
