package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qd3f5 {

  // I wanted to do a method reference thing in filter with instanceof, but did not know how to do, or maybe it is not
  // feasible
  // I also didn't know how to perform down-casting in map
  // In model answer, there are a few things that I like:
  // He used a filter at the end to check for positive integers, which I prefer because regardless of whether
  // the JVM evaluates lazily or not, it will execute properly.
  // He also checked whether it is positive or not by > 0, which is much simpler and readable than signum
  // He also used a lambda function to downcast the integer, which is, again, more readable
  public static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers.filter(x -> x instanceof Integer && Math.signum((Integer) x) == 1).map(Integer.class::cast);
  }

  public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2.5);
    numbers.add(3);
    numbers.add(3.14);
    numbers.add(-1);

    System.out.println("Positive integers from " + numbers + " are: "
            + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));

  }

}
