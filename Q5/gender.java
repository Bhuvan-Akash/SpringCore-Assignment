package Q5;
import javax.annotation.Resource;
@Component
public class gender {
    String gender;

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "gender{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
