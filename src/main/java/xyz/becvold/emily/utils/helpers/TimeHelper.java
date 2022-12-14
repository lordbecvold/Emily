package xyz.becvold.emily.utils.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author Lukáš Bečvář on 18.11.22
 * @project Emily
 */
public class TimeHelper {

    // get actual time in string by format
    public static String getTime(String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    // get actual date in string
    public static String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.YY");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    // get actual date in string by custom format
    public static String getDateWithCustomFormat(String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    // get day name
    public static String getDayName() {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_WEEK);

        if (day == 1) {
            return "Sunday";
        } else if (day == 2) {
            return "Monday";
        } else if (day == 3) {
            return "Tuesday";
        } else if (day == 4) {
            return "Wednesday";
        } else if (day == 5) {
            return "Thursday";
        } else if (day == 6) {
            return "Friday";
        } else if (day == 7) {
            return "Saturday";
        } else {
            return null;
        }
    }

    // check of time is morning
    public static boolean isMorningTime() {
        if (getTime("HH").equals("5")) {
            return true;
        } else if (getTime("HH").equals("6")) {
            return true;
        } else if (getTime("HH").equals("7")) {
            return true;
        } else if (getTime("HH").equals("8")) {
            return true;
        } else if (getTime("HH").equals("9")) {
            return true;
        } else {
            return false;
        }
    }

    // check of time is after morning
    public static boolean isAfterMorningTime() {
        if (getTime("HH").equals("10")) {
            return true;
        } else if (getTime("HH").equals("11")) {
            return true;
        } else {
            return false;
        }
    }

    // check of time is noon
    public static boolean isNoonTime() {
        if (getTime("HH").equals("12")) {
            return true;
        } else {
            return false;
        }
    }

    // check of time is early evning
    public static boolean isEarlyEveningTime() {
        if (getTime("HH").equals("17")) {
            return true;
        } else if (getTime("HH").equals("18")) {
            return true;
        } else if (getTime("HH").equals("19")) {
            return true;
        }  else {
            return false;
        }
    }

    // check of time is after noon
    public static boolean isAafternoonTime() {
        if (getTime("HH").equals("12")) {
            return true;
        } else if (getTime("HH").equals("13")) {
            return true;
        } else if (getTime("HH").equals("14")) {
            return true;
        } else if (getTime("HH").equals("15")) {
            return true;
        } else if (getTime("HH").equals("16")) {
            return true;
        } else if (getTime("HH").equals("17")) {
            return true;
        }  else {
            return false;
        }
    }

    // check of time is eeavning
    public static boolean isEveningTime() {
        if (getTime("HH").equals("20")) {
            return true;
        } else if (getTime("HH").equals("21")) {
            return true;
        } else if (getTime("HH").equals("22")) {
            return true;
        } else if (getTime("HH").equals("23")) {
            return true;
        } else {
            return false;
        }
    }

    // check of time is night
    public static boolean isNightTime() {
        if (getTime("HH").equals("0")) {
            return true;
        } else if (getTime("HH").equals("1")) {
            return true;
        } else if (getTime("HH").equals("2")) {
            return true;
        } else if (getTime("HH").equals("3")) {
            return true;
        } else if (getTime("HH").equals("4")) {
            return true;
        } else {
            return false;
        }
    }
}
