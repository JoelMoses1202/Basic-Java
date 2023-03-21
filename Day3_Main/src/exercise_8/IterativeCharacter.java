package exercise_8;

class IterativeCharacter extends Thread {
  static StringBuffer a;

  synchronized void characterIteration(StringBuffer character) {
    try {

      for (int i = 1; i <= 100; i++) {
        System.out.print(character);
        Thread.sleep(100);

      }
      character.setCharAt(0, (char)(character.charAt(0) + 1));
      System.out.println();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}