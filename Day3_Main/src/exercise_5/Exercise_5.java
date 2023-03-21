package exercise_5;

public class Exercise_5 {

  public static void main(String[] args) {
    Thread greet = new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("hii");

      }
    });
    greet.start();
    System.out.println(greet.getState());
    greet.start();

  }

}