package Occurances;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeDifference {

	public static void main(String[] args) throws ParseException {
		String time1 = "11:00";
		String time2 = "12:00";

		if(time2=="00:00")
			time2="24:00";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		
		long difference = date2.getTime() - date1.getTime(); 
		//System.out.println(difference);
		long diffMinutes = difference / (60 * 1000);     
		
		System.out.println("Time in minutes: " + diffMinutes + " minutes.");         
		
	}

}
