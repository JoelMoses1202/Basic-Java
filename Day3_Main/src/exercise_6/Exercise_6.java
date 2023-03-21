package exercise_6;

import java.util.Scanner;

public class Exercise_6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    while (true) {
      int flag = 0;
      System.out.println("Enter character");
      String character = scanner.next();
      try {
        int number = Integer.parseInt(character);
      } catch (Exception e) {
        System.out.println("Count:" + count);
        count++;
        flag = 1;
      }
      if (flag == 0) {
        System.out.println("Numerical Characters are not allowed..");
        break;
      }
    }

  }

}