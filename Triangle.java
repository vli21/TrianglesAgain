public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,
                  double x2, double y2,
                  double x3, double y3){
    Point v1= new Point (x1, y1);
    Point v2= new Point (x2, y2);
    Point v3= new Point (x3, y3);
  }

  public double getPerimeter(){
    double x = v1.distanceTo(v2);
    double y = v2.distanceTo(v3);
    double z = v3.distanceTo(v1);
    return (x+y+z);
  }

  public double getArea() {
    double s = getPerimeter()/2;
    double x = v1.distanceTo(v2);
    double y = v2.distanceTo(v3);
    double z = v3.distanceTo(v1);
    return (Math.sqrt(s*(s-x)*(s-y)*(s-z)));
  }
}
