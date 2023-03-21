package exercise_1;

class Number {
	  synchronized public void odd() {
	    try {
	      System.out.print("Odd Numbers-->");
	      for (int i = 1; i <= 100; i++){
	        if (i % 2 != 0)
	          System.out.print(i + " ");
	        Thread.sleep(100);
	      }
	      System.out.println();

	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }

	  }
	  synchronized public void even() {
	    System.out.print("Even Numbers-->");
	    try {
	      for (int i = 1; i <= 100; i++){
	        if (i % 2 == 0)
	          System.out.print(i + " ");
	        Thread.sleep(100);
	      }
	      System.out.println();
	    } catch (InterruptedException e) {
	      	      e.printStackTrace();
	    }

	  }
	}
