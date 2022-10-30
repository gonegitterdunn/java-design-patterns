package solid.lsp;

public class Rectangle {
  protected int width;
  protected int height;

  public Rectangle() {}

  public Rectangle(final int width, final int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(final int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(final int height) {
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }

  @Override
  public String toString() {
    return "Rectangle{" + "width=" + width + ", height=" + height + '}';
  }
}
