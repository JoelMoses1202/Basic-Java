package exercise_1;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class Exercise_1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter distance");
    int distance = sc.nextInt();
    System.out.println("Enter speed");
    int speed = sc.nextInt();
    LocalTime localTime = LocalTime.parse("22:00:00");
    int localHour = localTime.getHour();
    int localMinute = localTime.getMinute();
    LocalDate localDate = LocalDate.now();

    System.out.println("Start date: " + localDate);
    System.out.println("Start time: " + localTime);

    double time = (double) distance / (double) speed;
    int hour = (int) Math.floor(time);
    double min = Math.round(time * 10);
    min /= 10;
    min -= hour;
    min *= 10;
    int minutes = (int)(min * 6) + hour * 60;
    int first = 0;

    while (true) {
      if (minutes == 0) {
        localDate = localDate.minusDays(1);

      }
      int dayOfMonth = localDate.getDayOfMonth();
      int day = localDate.getDayOfWeek().getValue();
      int month = localDate.getMonthValue();
      if (CheckHoliday.checkHoliday(dayOfMonth, month))

      {
        localDate = localDate.plusDays(1);
      } else if (day == 7) {
        localDate = localDate.plusDays(1);

      } else if (day == 6) {
        if (dayOfMonth > 7 && dayOfMonth < 15) {
          localDate = localDate.plusDays(1);

        } else {
          if (24 * 60 - localMinute > minutes && minutes <= 8 * 60 && first == 0) {

            localTime = localTime.plusMinutes(minutes);
            System.out.println(localDate);
            System.out.println(localTime);
            break;

          } else if (minutes <= 8 * 60 && first == 1) {

            localTime = localTime.parse("00:00:00");

            localTime = localTime.plusMinutes(minutes);
            System.out.println("End Date: " + localDate);
            System.out.println("End Time: " + localTime);

            break;
          } else {
            if (first == 0) {
              if (8 * 60 > (24 * 60 - (localHour * 60 + localMinute))) {
                minutes -= (24 * 60 - (localHour * 60 + localMinute));

              } else {

                minutes -= (8 * 60);
              }
              first = 1;

            } else {
              minutes -= (8 * 60);

            }
            localDate = localDate.plusDays(1);

          }
        }

      } else {
        if (24 * 60 - localMinute > minutes && minutes <= 8 * 60 && first == 0) {

          localTime = localTime.plusMinutes(minutes);
          System.out.println("End Date: " + localDate);
          System.out.println("End Time: " + localTime);
          break;

        } else if (minutes <= 8 * 60 && first == 1) {

          localTime = LocalTime.parse("00:00:00");

          localTime = localTime.plusMinutes(minutes);
          System.out.println("End Date: " + localDate);
          System.out.println("End Time: " + localTime);

          break;
        } else {

          if (first == 0) {

            if (8 * 60 > (24 * 60 - (localHour * 60 + localMinute))) {
              minutes -= (24 * 60 - (localHour * 60 + localMinute));

            } else {

              minutes -= (8 * 60);

            }
            first = 1;

          } else {
            minutes -= (8 * 60);

          }
          localDate = localDate.plusDays(1);

        }
      }
      if (first == 0)
        first = 1;
    }
  }

}