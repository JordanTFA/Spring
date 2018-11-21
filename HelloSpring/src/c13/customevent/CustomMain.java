package c13.customevent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("c13/customevent/Beans.xml");
		
		CustomEventPublisher cep =
				(CustomEventPublisher) context.getBean("customEventPublisher");
		
		cep.publish();
		cep.publish();

	}

}
