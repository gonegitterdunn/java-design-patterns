package solid.lsp;

public class Square extends Rectangle {
  public Square() {}

  public Square(final int size) {
    width = height = size;
  }

  @Override
  public void setWidth(final int width) {
    super.setWidth(width);
    super.setHeight(width);
  }

  @Override
  public void setHeight(final int height) {
    super.setHeight(height);
    super.setWidth(height);
  }
}
