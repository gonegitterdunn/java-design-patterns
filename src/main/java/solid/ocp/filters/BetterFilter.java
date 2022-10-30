package solid.ocp.filters;

import solid.ocp.Product;
import solid.ocp.specs.Specification;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

  @Override
  public Stream<Product> filter(final List<Product> items, final Specification<Product> spec) {
    return items.stream().filter(spec::isSatisfied);
  }
}
