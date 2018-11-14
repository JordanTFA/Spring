package c04.postprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("c04/postprocessor/Beans.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("postProc");
		obj.getMessage();
		context.registerShutdownHook();

	}

}
