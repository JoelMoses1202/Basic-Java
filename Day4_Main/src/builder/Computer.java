package builder;

class Computer {
  Cabinet cabinet;
  Monitor monitor;
  KeyBoard keyboard;

  public Computer(Cabinet cabinet, Monitor monitor, KeyBoard keyBoard) {
    this.cabinet = cabinet;
    this.monitor = monitor;
    this.keyboard = keyBoard;
  }

  static class BuildComputer {
    Monitor monitor;
    KeyBoard keyBoard;
    Cabinet cabinet;

    public BuildComputer setMonitor(Monitor monitor) {
      this.monitor = monitor;
      return this;
    }
    public BuildComputer setCabinet(Cabinet cabinet) {
      this.cabinet = cabinet;
      return this;
    }

    public BuildComputer setKeyBoard(KeyBoard keyBoard) {
      this.keyBoard = keyBoard;
      return this;
    }

    public Computer build() {
      return new Computer(cabinet, monitor, keyBoard);
    }
  }

  @Override
  public String toString() {
    return "Computer [cabinet=" + cabinet + ", moniter=" + monitor + ", keyboard=" + keyboard + "]";
  }

}