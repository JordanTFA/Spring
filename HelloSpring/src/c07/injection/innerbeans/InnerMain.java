package c07.injection.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("c07/injection/innerbeans/Beans.xml");
		
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();
	}

}
