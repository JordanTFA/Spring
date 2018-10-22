package lifecycle.initdestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/initdestroy/Beans.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("initDestroy");
		obj.getMessage();
		context.registerShutdownHook();

	}

}