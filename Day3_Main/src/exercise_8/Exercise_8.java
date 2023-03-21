package exercise_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise_8 {
  public static void main(String[] args) {
    StringBuffer character = new StringBuffer("A");

    ExecutorService executorService = Executors.newFixedThreadPool(3);
    IterativeCharacter iterativeChar = new IterativeCharacter();
    executorService.execute(() -> {

      iterativeChar.characterIteration(character);

    });
    executorService.execute(() -> {

      iterativeChar.characterIteration(character);

    });
    executorService.execute(() -> {

      iterativeChar.characterIteration(character);

    });
    executorService.shutdown();

  }

}