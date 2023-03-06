package src.Q1486;

public class StringStackArray implements StringStack {

  // Don't use magic numbers
  private String[] strings;
  // private String[] strings = new String[100];
  // All upper case with underscores for constants
  private final int STACK_LIMIT = 100;
  // Initialise the var in constructor
  private int top = 0;

  // Creates an empty string stack
  public StringStackArray() {
    strings = new String[STACK_LIMIT];
  };

  // If the stack is full, does nothing.
  // Otherwise, pushes the given String on to the top of the stack
  @Override
  public void push(String s) {
    if (top < STACK_LIMIT) {
      strings[top] = s;
      top++;
    }
  };

  // If the stack is empty, leaves the stack unchanged and returns
  // null.  Otherwise, removes the string that is on the top of
  // the stack and returns it
  @Override
  public String pop() {
    if (isEmpty()) {
      return null;
    } else {
      top--;
      // Bug: Stuck here for a long time as I put top+1
      return strings[top];
    }
  };

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return top == 0;
  };
}
