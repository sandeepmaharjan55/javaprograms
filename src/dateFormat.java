import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class dateFormat {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        // formats in hour min and am.pm
        SimpleDateFormat hew =new SimpleDateFormat("hh:mm aa");
        String time = hew.format(date);
        System.out.println(time);
        //month MMM
        SimpleDateFormat month =new SimpleDateFormat("MMM");
        String monthMMM = month.format(date);
        System.out.println(monthMMM);
        //current hour and current min
        SimpleDateFormat currentmoin =new SimpleDateFormat("hh:mm");
        String currentMMM = currentmoin.format(date);
        System.out.println(currentMMM);
        //(or we can also use formatter to format like)
        Calendar gfg_calender = Calendar.getInstance();
        Formatter format = new Formatter();
        format.format("%tl:%tM", gfg_calender,
                gfg_calender);

        System.out.println(format);

        int day = gfg_calender.get(Calendar.DATE); // returns the day
        int monthrty = gfg_calender.get(Calendar.MONTH) + 1; // month starts from 0
        int year = gfg_calender.get(Calendar.YEAR);
        System.out.println(day+" "+monthrty+" "+year+" ");
    }
}
