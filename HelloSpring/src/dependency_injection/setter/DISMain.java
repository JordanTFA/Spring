package dependency_injection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("dependency_injection/setter/Beans.xml");
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();

	}

}
