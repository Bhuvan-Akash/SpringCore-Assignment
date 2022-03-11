package Q1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Customer cust1 = (Customer) context.getBean("Customer");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        cust1.showDetails();
	}

}
