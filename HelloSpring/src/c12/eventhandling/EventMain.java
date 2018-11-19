package c12.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("c12/eventhandling/Beans.xml");
		
		context.start();
		
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		hw.getMessage();
		
		context.stop();

	}

}
