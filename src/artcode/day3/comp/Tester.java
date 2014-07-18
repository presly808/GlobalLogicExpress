package artcode.day3.comp;

/**
 * Created by admin on 15.07.2014.
 */
public class Tester extends Worker {

    private String type;

    //super
    public Tester() {
        super();
    }

    public Tester(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void test(){
        System.out.println("Tester is testing");
    }

    public void work(){
        System.out.println("Tester is working");
    }


}
