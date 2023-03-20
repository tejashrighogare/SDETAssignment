package Occurances;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeDifference {

    public static void main(String[] args) throws ParseException {

        calculateTime("11:20", "12:20");
    }

    public static void calculateTime(String time1, String time2) {
        if (time2 == "00:00")
            time2 = "24:00";
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1;
        Date date2;
        long difference = 0;
        try {
            date1 = format.parse(time1);
            date2 = format.parse(time2);
            difference = date2.getTime() - date1.getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long diffMinutes = difference / (60 * 1000);
        System.out.println("Time difference in minutes: " + diffMinutes + " minutes.");
    }

}
