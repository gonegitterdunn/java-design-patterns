package patterns.builder.html;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
  public String name;
  public String text;
  public ArrayList<HtmlElement> elements = new ArrayList<>();
  private final int indentSize = 2;
  private final String newLine = System.lineSeparator();

  public HtmlElement() {}

  public HtmlElement(final String name, final String text) {
    this.name = name;
    this.text = text;
  }

  private String toStringImpl(final int indent) {
    final StringBuilder sb = new StringBuilder();
    final String i = String.join("", Collections.nCopies(indent * indentSize, " "));

    sb.append(String.format("%s<%s>%s", i, name, newLine));
    if (text != null && !text.isEmpty()) {
      sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
          .append(text)
          .append(newLine);
    }

    for (final HtmlElement e : elements) {
      sb.append(e.toStringImpl(indent + 1));
    }

    sb.append(String.format("%s<%s>%s", i, name, newLine));
    return sb.toString();
  }

  @Override
  public String toString() {
    return toStringImpl(0);
  }
}
