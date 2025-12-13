package Single_Class_Programs;

import java.util.GregorianCalendar;

public class CalendarDisplay {
    
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);

        System.out.println("--- Current Date Information ---");
        System.out.println("Current Year: " + year);
        System.out.println("Current Month: " + month);
        System.out.println("Current Day: " + day);
        System.out.println("Current Day of Week (Constant): " + dayOfWeek);

        System.out.println("\n--------------------------------\n");


        long milliseconds = 1234567898765L;
        calendar.setTimeInMillis(milliseconds);

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH) + 1;
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("--- Date Information for 1234567898765L milliseconds ---");
        System.out.println("Milliseconds set: " + milliseconds + "L");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}