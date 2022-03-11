package Q5;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
public class human {
	String name;

    phone p;

    @Resource
    gender g;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public gender getG() {
        return g;
    }
    public void setG(gender g) {
        this.g = g;
    }

    public phone getP() {
        return p;
    }
    @Required
    public void setP(phone p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name + '\'' +
                ", p=" + p +
                ", g=" + g +
                '}';
    }
}

