package artcode.day10.serial;

import java.io.Serializable;

/**
 * Created by admin on 24.07.2014.
 */
public class Cat implements Serializable {

    private String name;
    private int age;
    private Home home;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home=" + home +
                '}';
    }
}

class Home implements Serializable {

    private String city;
    private String street;

    Home(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
