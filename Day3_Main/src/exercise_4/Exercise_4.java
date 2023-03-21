package exercise_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise_4 {

  public static void main(String[] args) {

    Time time = new Time();
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    executorService.execute(() -> {

      while (true) {

        time.seconds();

      }
    });
    executorService.execute(() -> {

      while (true) {

        time.minutes();

      }
    });
    executorService.execute(() -> {

      while (true) {

        time.hours();

      }
    });
    executorService.close();

  }
}