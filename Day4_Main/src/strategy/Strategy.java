package strategy;

public class Strategy {

  public static void main(String[] args) {

    Pen pen = new Pen();
    pen.ink = new BlackInk();
    System.out.println(pen.getInk());
    pen.ink.color();
  }
}