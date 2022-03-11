package Q2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

 
public class Q2 {

	private static ApplicationContext quizContext;

	public static void main(String[] args) {
		quizContext = new ClassPathXmlApplicationContext("quiz.xml");
        Question ques1 = (Question) quizContext.getBean("Question1");
        System.out.println(ques1);
	}

}
