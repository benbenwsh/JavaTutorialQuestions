package src.Q0f05;

import java.util.Objects;

public class ColouredPoint extends Point {

  private final String hex;

  public ColouredPoint(double x, double y, double z, String hex) {
    super(x, y, z);
    this.hex = hex;
  }

  @Override
  public String toString() {
    return super.toString() + " Colour: " + hex;
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ColouredPoint cp) && super.equals(cp) && hex.equals(cp.hex);
  }

}
