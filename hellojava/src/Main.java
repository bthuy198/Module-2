import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void showCalendar(Calendar c) {
        int year = c.get(Calendar.YEAR);

        // Trả về giá trị từ 0 - 11
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millis = c.get(Calendar.MILLISECOND);

        System.out.println(" " + year + "-" + (month + 1) + "-" + day //
                + " " + hour + ":" + minute + ":" + second + " " + millis);
    }
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        Calendar c = Calendar.getInstance();
        c.setTime(now);

        System.out.println("Start..........: ");
        showCalendar(c);
        c.add(Calendar.MINUTE, 30);
        System.out.println("End..........: ");
        showCalendar(c);

        Date d1 = c.getTime();
        System.out.println(d1);
    }
//    public static void main(String[] args) throws ParseException {
//        String myTime = "14:10";
//        String durationTime = "02:50";
//        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
//        Date d = df.parse(myTime);
//        Date duration = df.parse(durationTime);
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(d);
//        cal.add(Calendar.HOUR, duration.getHours());
//        cal.add(Calendar.MINUTE, duration.getMinutes());
//        String newTime = df.format(cal.getTime());
//        System.out.println(newTime);
//    }
}