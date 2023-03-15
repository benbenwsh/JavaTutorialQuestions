package src.q014e;

import java.util.*;

public class Q014e {
  public static void main(String[] args){
    int x = Integer.parseInt(args[0]);
    System.out.println("Generating random numbers:");
    // Can use set and check its length
    // Can use a counter, but its difficult and its complexity is prob similar to set as you have to traverse through
    // the entire list of visited nos, which is basically the same as Set
    Set<Integer> visited = new HashSet<>();
    List<Integer> generated = new ArrayList<>();

    while (visited.size() < x) {
      Random random = new Random();

      int randomNo = random.nextInt(x);
      generated.add(randomNo);
      visited.add(randomNo);
    }
    // Not familiar with how to use reduce
    // You must use the same type for the two parameters in the function
    // Revise the slide on reduce (Functional programming)
    // There is no toString in primitive types such as int
    System.out.println(generated.stream().map(String::valueOf).reduce((i, j) -> i + ", " + j).orElse(""));
    System.out.println("I had to generate " + visited.size() + " random numbers between 0 and " + Integer.toString(x - 1) +
            " to have produced all such numbers at least once");
  }
}

// Took longer than expected due to:
// 1. Being unfamiliar with reduce
// 2. No default methods for primitive types
// 3. Deciding how to implement the logic of when to stop after generating the nos
// 4. Not knowing how to convert String to int