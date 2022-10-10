import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;    
public class JavaDateTime {
	
	public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
       
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        
        // LocalDate date = LocalDate.of(year,month,day);
        // return date.getDayOfWeek().toString();


    }

	public static String findPrevDay(int month, int day, int year) throws ParseException {
		String dateString= ""+year+month+day;
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        // Get a Date object from the date string
        Date myDate = dateFormat.parse(dateString);

        // this calculation may skip a day (Standard-to-Daylight switch)...
        //oneDayBefore = new Date(myDate.getTime() - (24 * 3600000));

        // if the Date->time xform always places the time as YYYYMMDD 00:00:00
        //   this will be safer.
       Date oneDayBefore = new Date(myDate.getTime() - 2);

        String result = dateFormat.format(oneDayBefore);
        return result;
	}
	
	public static String previousDateString(String dateString) 
            throws ParseException {
        // Create a date formatter using your format string
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        // Parse the given date string into a Date object.
        // Note: This can throw a ParseException.
        Date myDate = dateFormat.parse(dateString);

        // Use the Calendar class to subtract one day
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.add(Calendar.DAY_OF_YEAR, -1);

        // Use the date formatter to produce a formatted date string
        Date previousDate = calendar.getTime();
        String result = dateFormat.format(previousDate);

        return result;
    }
	
}
