package src.Q0f05;

// Perfect!
// Just remember that you cannot extend a record as it is a final class
public class Point {

  private final double x;
  private final double y;
  private final double z;

  public Point(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double euclideanDistance(Point point) {
    // Used ^ instead of Math.pow
    // Do not need to do 2.0 to indicate double
    return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2) + Math.pow(z - point.z, 2));
  }

  public Point origin() {
    return new Point(0, 0, 0);
  }

  public double magnitude() {
    return euclideanDistance(origin());
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }

  // short-circuit evaluation
  // Other than boolean operators, JVM mainly uses strict evaluation
  @Override
  public boolean equals(Object obj) {
    return (obj instanceof Point point) && (x == point.x && y == point.y && z == point.z);
  }


}

