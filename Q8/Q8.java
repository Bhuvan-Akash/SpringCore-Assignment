package Q8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        ((ConfigurableApplicationContext) context).registerShutdownHook();
        Student obj = (Student) context.getBean("student");
        obj.getDetails();
	}

}
