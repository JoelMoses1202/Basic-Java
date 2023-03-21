package exercise_2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise_2 {

	  public static void main(String[] args) {
	    ExecutorService executorService = Executors.newFixedThreadPool(5);
	    MessageInbox message = new MessageInbox();
	    executorService.execute(() -> {

	      message.displayMessage("[");

	    });
	    executorService.execute(() -> {

	      message.displayMessage("------");

	    });
	    executorService.execute(() -> {

	      message.displayMessage("Message");

	    });

	    executorService.execute(() -> {

	      message.displayMessage("------");

	    });
	    executorService.execute(() -> {

	      message.displayMessage("]");

	    });
	    executorService.shutdown();

	  }
	}

