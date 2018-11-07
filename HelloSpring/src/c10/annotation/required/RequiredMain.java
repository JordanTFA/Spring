package c10.annotation.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("c10/annotation/required/Beans.xml");
		
		Student student = (Student)context.getBean("student");
		System.out.println("Name : " + student.getName());
		//System.out.println("Age : " + student.getAge());

	}

}
