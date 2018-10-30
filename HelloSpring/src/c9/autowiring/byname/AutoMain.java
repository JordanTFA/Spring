package c9.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("c9/autowiring/byname/Beans.xml");
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();

	}

}
