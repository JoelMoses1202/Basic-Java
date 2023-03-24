package builder;

class Cabinet {
  MotherBoard motherBoard;
  Ram ram;
  HardDisk hardDisk;
  VGACard vgaCard;
  public Cabinet(MotherBoard motherBoard, Ram ram, HardDisk hardDisk, VGACard vgaCard) {
    this.motherBoard = motherBoard;
    this.ram = ram;
    this.hardDisk = hardDisk;
    this.vgaCard = vgaCard;
  }

  static class BuildCabinet {
    MotherBoard motherBoard;
    Ram ram;
    HardDisk hardDisk;
    VGACard vgaCard;
    public BuildCabinet setMotherBoard(MotherBoard motherBoard) {
      this.motherBoard = motherBoard;
      return this;
    }
    public BuildCabinet setRam(Ram ram) {
      this.ram = ram;
      return this;
    }
    public BuildCabinet setVGACard(VGACard vgaCard) {
      this.vgaCard = vgaCard;
      return this;
    }
    public BuildCabinet setHardDisk(HardDisk hardDisk) {
      this.hardDisk = hardDisk;
      return this;
    }
    public Cabinet build() {
      return new Cabinet(motherBoard, ram, hardDisk, vgaCard);
    }
  }

  @Override
  public String toString() {
    return "Cabinet [motherboard=" + motherBoard + ", ram=" + ram + ", hardisk=" + hardDisk + ", vgaCard=" + vgaCard + "]";
  }

}