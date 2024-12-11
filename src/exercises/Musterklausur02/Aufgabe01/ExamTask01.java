package exercises.Musterklausur02.Aufgabe01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static exercises.Musterklausur02.Aufgabe01.DateManager.*;

public class ExamTask01 {
    private static LocalDate birthday;

    public static void main(String[] args) {
        System.out.println("Today is " + getCurrentDate() + ". It's currently " + getCurrentTime());
        System.out.println("Please enter the date you wish to examine. Utilize the format yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        int year = Integer.valueOf(date.split("-")[0]);
        int month = Integer.valueOf(date.split("-")[1]);
        int day = Integer.valueOf(date.split("-")[2]);

        birthday = LocalDate.of(year, month, day);

        System.out.println("You were born on a " + DateManager.getWeekDay(birthday));
        System.out.println("You are roughly " + DateManager.calculateDaysBetween(birthday) + " ms old.");

    }
}
