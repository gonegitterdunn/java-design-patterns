package solid.dip;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// low level module
public class Relationships implements RelationshipBrowser {
  private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

  public void addParentAndChild(final Person parent, final Person child) {
    relations.add(new Triplet<>(parent, Relationship.PARENT, child));
    relations.add(new Triplet<>(child, Relationship.CHILD, parent));
  }

  @Override
  public List<Person> findAllChildrenOf(final String name) {
    return relations.stream()
        .filter(
            x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == Relationship.PARENT)
        .map(Triplet::getValue2)
        .collect(Collectors.toList());
  }
}
