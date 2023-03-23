package exercise_2;

import java.util.HashMap;

class PlayerFactory {

  private static HashMap < String, Player > hm = new HashMap < String, Player > ();

  public static Player getPlayer(String type) {
    Player p = null;

    if (hm.containsKey(type))
      p = hm.get(type);
    else {

      switch (type) {
      case "Hero":
        System.out.println("Hero Created");
        p = new Hero();
        break;
      case "Villain":
        System.out.println("Villain Created");
        p = new Villain();
        break;
      default:
        System.out.println("Unreachable code!");
      }

      hm.put(type, p);
    }
    return p;
  }
}