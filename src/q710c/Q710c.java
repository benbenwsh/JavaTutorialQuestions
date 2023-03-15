package src.q710c;

import src.Q0f05.Point;

import java.util.HashSet;
import java.util.Set;

public class Q710c {
  public static void main(String[] args){
    Set<Point> pointSet = new HashSet<Point>();

    Point p = new Point(1, 2, 3);
    Point q = new Point(1, 2, 3);
    System.out.println(p.equals(q));
    pointSet.add(p);

//    Returns false if hashCode has not been overridden
//    But what method do they use to compare in Set? Because equals() works though
    System.out.println(pointSet.contains(q));
//    == method still returns false because it compares whether they point to the same object
//    This is because HashSet uses an object's hashcode to assign to buckets
    System.out.println(p == q);
//    It is not necessary to override hashCode in ColouredPoint, but it makes contains() operation more efficient?
//    Because less collision?
  }
//  Model answer used the power function in hashCode() as it reduces collisions
}
