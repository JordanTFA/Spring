package c8.injection.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("c8/injection/collections/Beans.xml");
		JavaCollection jc = (JavaCollection)context.getBean("javaCollection");

		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
	}

}
