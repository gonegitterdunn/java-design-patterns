package solid;

import solid.dip.Person;
import solid.dip.Relationships;
import solid.dip.Research;
import solid.lsp.Rectangle;
import solid.lsp.Square;
import solid.ocp.Color;
import solid.ocp.Product;
import solid.ocp.Size;
import solid.ocp.filters.AndSpecification;
import solid.ocp.filters.BetterFilter;
import solid.ocp.specs.ColorSpecification;
import solid.ocp.specs.SizeSpecification;

import java.util.List;

public class Application {

  public static void main(final String[] args) {
//    ospDemo();
//    lspDemo();
//    dipDemo();
  }

  public static void dipDemo() {
    Person parent = new Person("John");
    Person child1 = new Person("Chris");
    Person child2 = new Person("Matt");

    Relationships relationships = new Relationships();
    relationships.addParentAndChild(parent, child1);
    relationships.addParentAndChild(parent, child2);

    new Research(relationships);
  }

  public static void lspDemo() {
    useIt(new Rectangle(2, 3));

    Rectangle square = new Square();
    square.setWidth(5);
    useIt(square);
  }

  private static void useIt(final Rectangle r) {
    final int width = r.getWidth();
    // Breaks the liskov substitution principle
    // square's implementation of setHeight also sets the width
    r.setHeight(10);
    System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
  }

  public static void ospDemo() {
    final Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
    final Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    final Product house = new Product("House", Color.BLUE, Size.LARGE);

    final List<Product> products = List.of(apple, tree, house);

    final BetterFilter betterFilter = new BetterFilter();
    final ColorSpecification greenSpec = new ColorSpecification(Color.GREEN);
    betterFilter
        .filter(products, greenSpec)
        .forEach(p -> System.out.println(" - " + p.name + " is " + greenSpec.getColor()));

    final ColorSpecification blueSpec = new ColorSpecification(Color.BLUE);
    final SizeSpecification largeSpec = new SizeSpecification(Size.LARGE);

    betterFilter
        .filter(products, new AndSpecification<>(blueSpec, largeSpec))
        .forEach(
            p ->
                System.out.println(
                    " - " + p.name + " is " + blueSpec.getColor() + " and " + largeSpec.getSize()));
  }
}
