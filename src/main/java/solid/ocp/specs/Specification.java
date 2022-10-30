package solid.ocp.specs;

public interface Specification<T> {
  boolean isSatisfied(T item);
}
