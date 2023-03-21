package exercise_1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise_1 {

	  public static void main(String[] args) {
	    ExecutorService executorService = Executors.newFixedThreadPool(2);
	    Number number = new Number();
	    executorService.execute(() -> {
	      number.odd();
	    });

	    executorService.execute(() -> {
	      number.even();
	    });
	    executorService.shutdown();
	  }
	}
