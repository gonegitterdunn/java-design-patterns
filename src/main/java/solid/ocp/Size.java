package solid.ocp;

public enum Size {
  SMALL("small"),
  MEDIUM("medium"),
  LARGE("large"),
  HUGE("huge");

  private String size;

  Size(final String size) {
    this.size = size;
  }

  public String getSize() {
    return size;
  }
}
