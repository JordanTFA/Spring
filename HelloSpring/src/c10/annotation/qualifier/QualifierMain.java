package c10.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("c10/annotation/qualifier/Beans.xml");
		
		Profile profile = (Profile)context.getBean("profile");
		profile.printAge();
		profile.printName();

	}

}
