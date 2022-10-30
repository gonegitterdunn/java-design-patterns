package solid.dip;

import java.util.List;

// high level module
public class Research {

  public Research(final RelationshipBrowser browser) {

    final List<Person> children = browser.findAllChildrenOf("John");
    for (final Person child : children) {
      System.out.println("John has a child called " + child.name);
    }
 }
}
