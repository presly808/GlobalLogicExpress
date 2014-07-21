package artcode.day7;


import java.util.Date;

/**
 * Created by admin on 21.07.2014.
 */
//TODO override toString
public class SaleMan implements Comparable {

    private String name;
    private int id;
    private double salary;
    private Date date;

    public SaleMan() {
    }

    public SaleMan(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        SaleMan other = (SaleMan) o;
        return this.id < other.id ? -1 : this.id > other.id ? 1 : 0;
    }

    @Override
    public String toString() {
        return "SaleMan{" +
                "salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // == for prim || equals for objects(reference)
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if(!(obj instanceof SaleMan)){
           return false;
        }

        SaleMan other = (SaleMan) obj;

        if(this.id == other.id && (this.name != null && this.name.equals(other.name))
                && this.salary == other.salary){
            return true;
        }

        return false;
    }


}
