package singleton;
public class Singleton_Demo {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    singleton.getInstance();
    singleton.getInstance();
    singleton.getInstance();

    System.out.println(singleton);

  }

}