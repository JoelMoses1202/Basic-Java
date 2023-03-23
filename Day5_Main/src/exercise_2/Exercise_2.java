package exercise_2;
import java.util.Scanner;

public class Exercise_2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("TYPE HERO OR VILLAIN");
      String role = sc.next();
      Player p = PlayerFactory.getPlayer(role);
      System.out.println("Enter Name");
      String name = sc.next();
      p.assignName(name);
      p.mission();
    }

  }

}