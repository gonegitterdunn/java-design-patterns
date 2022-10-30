package patterns.builder.fluent;

public class CarBuilder<SELF extends CarBuilder<SELF>> {

  protected Car car = new Car();

  public SELF year(final String year) {
    car.year = year;
    return self();
  }

  public SELF withColor(final String color) {
    car.color = color;
    return self();
  }

  public SELF make(final String make) {
    car.make = make;
    return self();
  }

  public Car build() {
    return car;
  }

  protected SELF self() {
    return (SELF) this;
  }
}
