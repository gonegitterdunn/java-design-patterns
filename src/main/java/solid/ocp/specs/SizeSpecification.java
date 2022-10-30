package solid.ocp.specs;

import solid.ocp.Product;
import solid.ocp.Size;

public class SizeSpecification implements Specification<Product> {

  private Size size;

  public SizeSpecification(final Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(final Product item) {
    return item.size == size;
  }

  public String getSize() {
    return size.getSize();
  }
}
