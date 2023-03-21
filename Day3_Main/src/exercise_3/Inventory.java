package exercise_3;
class Inventory {
  boolean goods;
  synchronized public void produce() {
    try {
      if (goods) {
        wait();
      }
      System.out.println("PRODUCE....");

      Thread.sleep(1000);

      goods = true;
      notify();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
  synchronized public void consume() {
    try {
      if (!goods) {

        wait();
      }
      System.out.println("CONSUME.....");

      Thread.sleep(1000);

      goods = false;
      notify();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}