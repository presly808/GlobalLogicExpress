package artcode.day10.serial;

import java.io.*;

/**
 * Created by admin on 24.07.2014.
 */
public class TestSerial {

    private static final String PATH = "cat.dat";

    public static void main(String[] args) {
        Cat cat = new Cat("Mursic", 2);
        cat.setHome(new Home("Kiev", "Harmatna 51"));

        System.out.println("Before serial\n" + cat.toString());
        //Serialization
        try {
            FileOutputStream fos = new FileOutputStream(PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cat);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization
        try {
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Cat deserialCat = (Cat) ois.readObject();
            ois.close();
            System.out.println(deserialCat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
