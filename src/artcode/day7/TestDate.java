package artcode.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 21.07.2014.
 */
public class TestDate {

    //TODO: check time of work factorial of 30
    //TODO: BigInteger, Class MyTimer(start, stop, interval)

    public static void main(String[] args) throws ParseException {
        //interval from 1970.01.01 to now in millis
        Date date = new Date();
        long millis = date.getTime();
        System.out.println(millis);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d = sdf.parse("23/11/2008");
        String s = sdf.format(d);
        System.out.println(s);


    }
}
