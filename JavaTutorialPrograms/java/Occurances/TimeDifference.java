package Occurances;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeDifference {
    //Write program to calculate time difference in minute
    public static void main(String[] args) throws ParseException {
        calculateTime("11:20", "12:20");
    }
    public static void calculateTime(String timeOne, String timeSecond) {
        if (timeSecond == "00:00")
            timeSecond = "24:00";
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1;
        Date date2;
        long difference = 0;
        try {
            date1 = format.parse(timeOne);
            date2 = format.parse(timeSecond);
            difference = date2.getTime() - date1.getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long diffMinutes = difference / (60 * 1000);
        System.out.println("Time difference in minutes: " + diffMinutes + " minutes.");
    }
}