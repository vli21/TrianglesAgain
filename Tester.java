public class Tester{
  public static void main(String[]args){
    Point p = new Point (1,3);
    Point a = new Point (1,3);
    Point b = new Point (5,3);
    Point c = new Point (3,7);
    Triangle abc = new Triangle (a,b,c);

    /*------------------------------------
    checks to see if get X and get Y work
    -------------------------------------*/
    System.out.println (a.getX());
    System.out.println (a.getY());

    System.out.println (a.distanceTo(b));

    System.out.println (a.equals(b));
    System.out.println (a.equals(p));

    /*---------------------------------------------------------------
    checking the constructors accessors and mutators in Triangle.java
    -----------------------------------------------------------------*/
    System.out.println (abc.getPerimeter());
    System.out.println (abc.getArea());
    System.out.println (abc.classify());
    System.out.println (abc.toString());
    abc.setVertex(2, p);
    System.out.println ( abc.toString());

  }
}
