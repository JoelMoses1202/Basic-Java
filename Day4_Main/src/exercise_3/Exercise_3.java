package exercise_3;

public class Exercise_3 {

  public static void main(String[] args) {
    Computer com = new Computer.BuildComputer().setMonitor(new Monitor()).setKeyBoard(new KeyBoard()).setCabinet(new Cabinet.BuildCabinet().setHardDisk(new HardDisk()).build()).build();
    System.out.println(com);
  }
}