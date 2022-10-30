package patterns.builder.fluent;

public class Car {
  // VIN details
  public String color;
  public String year;
  public String make;

  // customer details
  public boolean winterPackage;
  public boolean niceRims;
  public boolean upgradedSoundSystem;

  @Override
  public String toString() {
    return "Car{"
        + "color='"
        + color
        + '\''
        + ", year='"
        + year
        + '\''
        + ", make='"
        + make
        + '\''
        + ", winterPackage="
        + winterPackage
        + ", niceRims="
        + niceRims
        + ", upgradedSoundSystem="
        + upgradedSoundSystem
        + '}';
  }
}
