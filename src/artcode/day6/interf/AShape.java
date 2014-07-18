package artcode.day6.interf;

/**
 * Created by admin on 18.07.2014.
 */
/*
 * 1. cant create instance of abstract class
 * 2. can has fields, methods, constructors
 * 3. can has abstract methods
 *
 * 45 - int
 * 4.6 - double
 *
 *
* */


public abstract class AShape {
    private String name;
    private double square;

    public AShape (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double square();
}

class Circle extends AShape {
    private double radius;

    //default constructor
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}

class TestAbstract {
    public static void main(String[] args) {
        AShape shape = new Circle("circle", 8);

        System.out.println(shape.square());
    }
}
