package src.Q1486;

public class Demo {

  public Demo() {

  }

  public static void transferStacks(StringStack dst, StringStack src) {
    // Not sure what will happen when null is pushed
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args){
    StringStack ssa = new StringStackArray();
    StringStack ssl = new StringStackList();

    ssa.push("a");
    ssa.push("b");
    ssa.push("c");

    transferStacks(ssl, ssa);

    assert ssa.isEmpty() == true;

    while (!ssl.isEmpty()) {
      System.out.println(ssl.pop());
    }
  }

}
