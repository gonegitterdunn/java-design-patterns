package patterns.builder.fluent;

public class LuxuryCarBuilder extends CarBuilder<LuxuryCarBuilder> {

  public LuxuryCarBuilder withWinterPackage(final boolean with) {
    car.winterPackage = with;
    return self();
  }

  public LuxuryCarBuilder withNiceRims(final boolean with) {
    car.niceRims = with;
    return self();
  }

  public LuxuryCarBuilder withUpgradedSoundSystem(final boolean with) {
    car.upgradedSoundSystem = with;
    return self();
  }

  @Override
  protected LuxuryCarBuilder self() {
    return this;
  }
}
