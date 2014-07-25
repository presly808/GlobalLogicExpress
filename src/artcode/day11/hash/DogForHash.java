package artcode.day11.hash;

/**
 * Created by admin on 25.07.2014.
 */
public class DogForHash {

    private String name;
    private int age;
    private double weight;

    public DogForHash(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int res = 1;
        res = 31 * res  + (name != null ? name.hashCode() : 0);
        res = 31 * res + age;
        res = 31 * res + (int)(Double.doubleToLongBits(weight) >>> 32);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogForHash that = (DogForHash) o;

        if (age != that.age) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }
}
