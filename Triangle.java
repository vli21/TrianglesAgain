public class Triangle{
  private Point v1, v2, v3;

  /*------------------------------
  Constructors to Define Triangle
  --------------------------------*/
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
  /*------------------------------
  Finds The Perimeter of triangle.
  --------------------------------*/
  public double getPerimeter(){
    double x = v1.distanceTo(v2);
    double y = v2.distanceTo(v3);
    double z = v3.distanceTo(v1);
    return (x+y+z);
  }
  /*------------------------------------------------
  Returns the Area of triangle using Heron's Formula
  --------------------------------------------------*/
  public double getArea() {
    double s = getPerimeter()/2;
    double x = v1.distanceTo(v2);
    double y = v2.distanceTo(v3);
    double z = v3.distanceTo(v1);
    return (Math.sqrt(s*(s-x)*(s-y)*(s-z)));
  }
  /*---------------------------------------------------------------
  Classify Triangles based on "equilateral" "isosceles" or "scalene".
  -----------------------------------------------------------------*/
  public String classify(){
    double x = Math.round(v1.distanceTo (v2)/10000)*10000;
    double y = Math.round(v2.distanceTo (v3)/10000)*10000;
    double z = Math.round(v3.distanceTo (v1)/10000)*10000;
    if (x == y || y==z || x==z){
      return ("isosceles");
    }
    if (x==y && y==z){
      return ("equilateral");
    }
    return ("scalene");
  }

  public String toString(){
    return ("v1"+ "("+ v1.getX()+ ", "+ v1.getY()+") "+
            "v2"+ "("+ v2.getX()+ ", "+ v2.getY()+") "+
            "v3"+ "("+ v3.getX()+ ", "+ v3.getY()+") " 
            );
  }
}
