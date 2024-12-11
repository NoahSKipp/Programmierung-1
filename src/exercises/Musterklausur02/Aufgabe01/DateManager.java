package exercises.Musterklausur02.Aufgabe01;

import java.time.*;

public class DateManager {

    public static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    public static LocalTime getCurrentTime(){
        return LocalTime.now();
    }

    public static long calculateDaysBetween(LocalDate birthday){
         ZonedDateTime birthdayZoned = birthday.atStartOfDay(ZoneId.systemDefault());
         ZonedDateTime nowZoned = ZonedDateTime.now(ZoneId.systemDefault());
         Duration duration = Duration.between(birthdayZoned, nowZoned);
         return duration.toMillis();
    }

    public static String getWeekDay(LocalDate birthday){
        return birthday.getDayOfWeek().toString();
    }
}
