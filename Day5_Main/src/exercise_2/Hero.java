package exercise_2;

class Hero implements Player {
  //Intrinsic
  private final String TASK;
  //Extrinsic
  private String name;

  public Hero() {
    TASK = "Save People";
  }
  public void assignName(String name) {
    this.name = name;
  }
  public void mission() {
    System.out.println("Hero with name " + name + "and " + " Task is to " + TASK);
  }
}