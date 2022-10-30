package patterns.builder.faceted;

public class Person {
  // Address
  public String streetAddress;
  public String postcode;
  public String city;

  // Job
  public String companyName;
  public String position;
  public String annualIncome;

  @Override
  public String toString() {
    return "Person{"
        + "streetAddress='"
        + streetAddress
        + '\''
        + ", postCode='"
        + postcode
        + '\''
        + ", city='"
        + city
        + '\''
        + ", companyName='"
        + companyName
        + '\''
        + ", position='"
        + position
        + '\''
        + ", annualIncome='"
        + annualIncome
        + '\''
        + '}';
  }
}
