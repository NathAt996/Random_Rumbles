package Single_Class_Programs;

import java.util.Date;

public class DateDisplay {

    public static void main(String[] args) {

        long values[] = {
                10000l,
                100000l,
                1000000l,
                10000000l,
                100000000l,
                1000000000l,
                10000000000l,
                100000000000l
        };

        Date date = new Date ();

        for(long time : values) {
            date.setTime(time);

            System.out.println("Time elapsed: " + time + " ms ---> date: " + date);

        }
    }
}
