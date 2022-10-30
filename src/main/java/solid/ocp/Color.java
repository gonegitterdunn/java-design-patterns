package solid.ocp;

public enum Color {
  RED("red"),
  GREEN("green"),
  BLUE("blue");

  private String color;

  Color(final String value) {
    this.color = value;
  }

  public String getColor() {
   return color;
  }
}
