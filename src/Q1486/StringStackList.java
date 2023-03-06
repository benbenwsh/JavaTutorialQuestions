package src.Q1486;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack {

  // Initialise in constructor
  // Declare final var whenever possible
  private List<String> strings = new LinkedList<>();

  public StringStackList() {

  }

  @Override
  public void push(String s) {
    strings.add(s);
  }

  @Override
  public String pop() {
    return (isEmpty()) ? null : strings.remove(strings.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return strings.isEmpty();
  }
}
