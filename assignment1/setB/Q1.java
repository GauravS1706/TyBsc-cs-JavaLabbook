/*
Set B
        a) Write a java program to display the system date and time in various formats shown below:
           Current date is : 31/08/2021 Current date is : 08-31-2021
           Current date is : Tuesday August 31 2021
           Current date and time is : Fri August 31 15:25:59 IST 2021 
           Current date and time is : 31/08/21 15:25:59 PM +0530 
           Current time is : 15:25:59
           Current week of year is : 35 
           Current week of month : 5 
           Current day of the year is : 243
Note: Use java.util.Date and java.text.SimpleDateFormat class

*/

package assignment1.setB;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q1 {
    public static void main(String[] args) {

        Date now = new Date();
        Calendar calendar = Calendar.getInstance();


        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + sdf1.format(now));

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + sdf2.format(now));

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + sdf3.format(now));

        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + sdf4.format(now));

        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date and time is : " + sdf5.format(now));

        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + sdf6.format(now));


        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Current week of year is : " + weekOfYear);


        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Current week of month : " + weekOfMonth);


        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("Current day of the year is : " + dayOfYear);
    }
}
