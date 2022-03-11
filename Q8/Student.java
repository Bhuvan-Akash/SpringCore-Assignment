package Q8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
public class Student {

    String name;

    public Student(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void getDetails()
    {
        System.out.println("the name of the student is: "+getName());
    }
    @PostConstruct
    public void myInit()
    {
        System.out.println("myInit method started");
    }
    @PreDestroy
    public void myDestroy()
    {
        System.out.println("myInit method started");
    }
}
