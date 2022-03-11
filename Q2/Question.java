package Q2;
 

import java.util.List;
 
public class Question {
	 private int questionId;
	    private String question;
	    private List<String> answer;
        public Question(int questionId, String question, List<String> answer) {
	        this.questionId = questionId;
	        this.question = question;
	        this.answer = answer;
	     }

	    public int getQuestionId() {
	        return questionId;
	    }
	    public String getQuestion() {
	        return question;
	    }
 
	    public List<String> getAnswers() {
	        return answer;
	    }


	    @Override
	    public String toString() {
	        return "Question{" +
	                "questionId=" + questionId +
	                ", question='" + question + '\'' +
	                ", answer=" + answer +
	                '}';
	    }
}
