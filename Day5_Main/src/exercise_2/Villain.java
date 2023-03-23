package exercise_2;

class Villain implements Player {
  private final String TASK;

  private String name;

  public Villain() {
    TASK = "KILL PEOPLE";
  }
  public void assignName(String name) {
    this.name = name;
  }
  public void mission() {
    System.out.println("Villain with name " + name + "|" + " Task is to " + TASK);
  }
}