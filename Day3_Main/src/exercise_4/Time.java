package exercise_4;

import java.util.Calendar;
public class Time {
  Calendar calendar = Calendar.getInstance();

  int hour = calendar.get(Calendar.HOUR_OF_DAY);
  int min = calendar.get(Calendar.MINUTE);
  int sec = calendar.get(Calendar.SECOND);
  synchronized void hours() {
    try {
      wait();
      if (min == 60) {
        min = 0;

        if (hour == 23) {
          hour = 0;
          notify();
        } else {
          hour++;
        }

      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  synchronized void minutes() {

    try {
      wait();
      if (sec == 59) {
        sec = 0;
        min += 1;
      }
    } catch (Exception e) {
      e.printStackTrace();

    }
  }
  synchronized public void seconds() {
    try {
      wait(1000);
      System.out.println(hour + " " + min + " " + sec);
      if (sec == 59) {
        notifyAll();
      } else {
        sec += 1;
      }

    } catch (Exception e) {
      e.printStackTrace();

    }

  }

}