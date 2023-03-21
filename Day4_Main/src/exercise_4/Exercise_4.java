package exercise_4;

public class Exercise_4 {

  public static void main(String[] args) {

    Pen pen = new Pen();
    pen.ink = new BlackInk();
    System.out.println(pen.getInk());
  }
}