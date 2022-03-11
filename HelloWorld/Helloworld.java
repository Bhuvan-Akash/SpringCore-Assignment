package HelloWorld;
 
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Helloworld {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Helloworld.xml")) {
			greet say= (greet) context.getBean("greet");
			say.greet();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
