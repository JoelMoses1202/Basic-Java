package exercise_2;
class MessageInbox {

	  public synchronized void displayMessage(String message) {
	    System.out.print(message);
	  }
}