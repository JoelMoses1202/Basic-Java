package exercise_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise_3 {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(2);
    Inventory inventory = new Inventory();
    executorService.execute(() -> {

      while (true) {

        inventory.produce();

      }
    });
    executorService.execute(() -> {
      while (true) {

        inventory.consume();

      }
    });
    executorService.shutdown();
  }
}









