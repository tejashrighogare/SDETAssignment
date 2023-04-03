package occurances;
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
        Date dateOne;
        Date dateSecond;
        long difference = 0;
        try {
            dateOne = format.parse(timeOne);
            dateSecond = format.parse(timeSecond);
            difference = dateSecond.getTime() - dateOne.getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long diffMinutes = difference / (60 * 1000);
        System.out.println("Time difference in minutes: " + diffMinutes + " minutes.");
    }
}