package patterns.builder.faceted;

public class PersonAddressBuilder extends PersonBuilder {
  public PersonAddressBuilder(final Person person) {
    this.person = person;
  }

  public PersonAddressBuilder at(final String streetAddress) {
    person.streetAddress = streetAddress;
    return this;
  }

  public PersonAddressBuilder in(final String city) {
    person.city = city;
    return this;
  }

  public PersonAddressBuilder withPostcode(final String postcode) {
    person.postcode = postcode;
    return this;
  }
}
