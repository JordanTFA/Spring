package c9.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("c9/autowiring/bytype/Beans.xml");
		TextEditor te = (TextEditor)context.getBean("textEditor");
		
		te.spellCheck();

	}

}
