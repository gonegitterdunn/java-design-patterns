package solid.ocp.specs;

import solid.ocp.Color;
import solid.ocp.Product;

public class ColorSpecification implements Specification<Product> {

  private Color color;

  public ColorSpecification(final Color color) {
    this.color = color;
  }

  @Override
  public boolean isSatisfied(final Product item) {
    return item.color == color;
  }

  public String getColor() {
    return color.getColor();
  }
}
