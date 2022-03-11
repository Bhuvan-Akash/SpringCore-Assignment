package HelloWorld;
public class greet {
	String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello World I'm "+getName());
    }
}
