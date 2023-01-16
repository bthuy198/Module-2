import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static String pattern = "yyyy-MM-dd hh:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    public static void main(String[] args) throws ParseException {
        String today = "2022-01-31 09:47:34";
        System.out.println(parseDate(today));
        System.out.println(convertDateToString(new Date()));

    }

    public static Date parseDate(String strDate) {
        try {
            return simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertDateToString(Date date) {
        return simpleDateFormat.format(date);
    }
}
