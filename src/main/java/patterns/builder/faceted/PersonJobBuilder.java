package patterns.builder.faceted;

public class PersonJobBuilder extends PersonBuilder {

  public PersonJobBuilder(final Person person) {
    this.person = person;
  }

  public PersonJobBuilder worksAt(final String companyName) {
    person.companyName = companyName;
    return this;
  }

  public PersonJobBuilder asA(final String jobPosition) {
    person.position = jobPosition;
    return this;
  }

  public PersonJobBuilder withAnnualIncome(final String annualIncome) {
    person.annualIncome = annualIncome;
    return this;
  }
}
