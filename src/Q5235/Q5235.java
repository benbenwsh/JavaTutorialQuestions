package src.Q5235;

import src.Q0f05.ColouredPoint;
import src.Q0f05.Point;

public class Q5235 {
  public static void main(String[] args){
    Point point1 = new Point(1, 2, 3);
    Point point2 = new Point(1, 2, 3);
    Point cPoint1 = new ColouredPoint(1, 2, 3, "654321");
    Point cPoint2 = new ColouredPoint(1, 2, 3, "123456");
    Point cPoint3 = new ColouredPoint(1, 2, 3, "123456");

    System.out.println(point1 == point2);
    System.out.println(point1.equals(point2));

    System.out.println(cPoint1.equals(cPoint2));
    System.out.println(cPoint2.equals(cPoint3));

    System.out.println(point1.equals(cPoint1));
    System.out.println(cPoint1.equals(point1));
  }
}
