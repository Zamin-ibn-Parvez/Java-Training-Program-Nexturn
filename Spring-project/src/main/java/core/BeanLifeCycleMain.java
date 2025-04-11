package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BeanLifeCycle bean = context.getBean("beanlifecycle", BeanLifeCycle.class);
		System.out.println(bean.getUsername());

	}

}
