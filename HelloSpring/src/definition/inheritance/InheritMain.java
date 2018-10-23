package definition.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("definition/inheritance/Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getFirstMessage();
		objA.getSecondMessage();
		
		HelloScotland objB = (HelloScotland) context.getBean("helloScotland");
		objB.getFirstMessage();
		objB.getSecondMessage();
		objB.getThirdMessage();

	}

}
