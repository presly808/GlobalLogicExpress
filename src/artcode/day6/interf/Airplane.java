package artcode.day6.interf;

/**
 * Created by admin on 18.07.2014.
 */
/*
* SuperClass - Object
* */
public class Airplane  {

    private int power;
    private String model;
    private String type;

    public Airplane(int power, String model, String type) {
        this.power = power;
        this.model = model;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
