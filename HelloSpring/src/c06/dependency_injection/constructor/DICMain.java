package c06.dependency_injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DICMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("c06/dependency_injection/constructor/Beans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
