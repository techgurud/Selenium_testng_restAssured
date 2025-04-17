public class DateTimeUtils {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String TIME_FORMAT = "HH:mm:ss";
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrentDate() {
        return new SimpleDateFormat(DATE_FORMAT).format(new Date());
    }

    public static String getCurrentTime() {
        return new SimpleDateFormat(TIME_FORMAT).format(new Date());
    }

    public static String getCurrentDateTime() {
        return new SimpleDateFormat(DATE_TIME_FORMAT).format(new Date());
    }
    public static String formatDate(Date date) {
        return new SimpleDateFormat(DATE_FORMAT).format(date);
    }
}
