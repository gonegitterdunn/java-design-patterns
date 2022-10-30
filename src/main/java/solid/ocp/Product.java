package solid.ocp;


public class Product {
  public String name;
  public Color color;
  public Size size;

  public Product(final String name, final Color color, final Size size) {
    this.name = name;
    this.color = color;
    this.size = size;
  }
}
