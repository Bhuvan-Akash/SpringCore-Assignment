package Q5;
import javax.annotation.Resource;
@Component
public class phone {
    long number;

    public phone(long number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "phone{" +
                "number=" + number +
                '}';
    }
}
