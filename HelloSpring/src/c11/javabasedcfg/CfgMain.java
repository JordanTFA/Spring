package c11.javabasedcfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CfgMain {

	public static void main(String[] args) {

		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld hw = ctx.getBean(HelloWorld.class);
		hw.setMessage("Hello World!");
		hw.getMessage();

	}

}
