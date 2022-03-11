package Q5;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ApplicationContext context = new ClassPathXmlApplicationContext("human.xml");
	        human humanBeing = (human) context.getBean("Human");
	        gender gender =humanBeing.getG();
	        phone no=humanBeing.getP();
	        System.out.println(gender);
	        System.out.println(no);
	        System.out.println(humanBeing);
	}

}
