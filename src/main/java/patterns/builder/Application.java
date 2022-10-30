package patterns.builder;

import patterns.builder.faceted.Person;
import patterns.builder.faceted.PersonBuilder;
import patterns.builder.fluent.Car;
import patterns.builder.fluent.LuxuryCarBuilder;
import patterns.builder.html.HtmlBuilder;

public class Application {

  public static void main(final String[] args) {
    //    htmlDemo();
    //    genericRecursiveFluentBuilder();
    //    facetedBuilder();
  }

  private static void genericRecursiveFluentBuilder() {
    final Car car =
        new LuxuryCarBuilder()
            .withColor("white")
            .year("2020")
            .make("Honda")
            .withNiceRims(false)
            .withUpgradedSoundSystem(true)
            .withWinterPackage(true)
            .build();
    System.out.println(car);
  }

  private static void facetedBuilder() {
    final PersonBuilder personBuilder = new PersonBuilder();
    final Person person =
        personBuilder
            .lives()
            .at("1234 main street")
            .in("London")
            .withPostcode("23451")
            .works()
            .worksAt("Flowers forever")
            .asA("florist")
            .withAnnualIncome("34500")
            .build();

    System.out.println(person);
  }

  private static void htmlDemo() {
    final HtmlBuilder builder = new HtmlBuilder("ul");
    builder.addChild("li", "hello").addChild("li", "world");
    System.out.println(builder);
  }
}
