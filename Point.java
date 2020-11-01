public class Point{
  private double x,y;
  /*---------------------------
  Constructors to Define Point
  -----------------------------*/
  public Point(double X, double Y){
   x=X;
   y=Y;
 }

 public Point(Point p){
   x= p.x;  //private access in the same file is allowed!
   y= p.y;
 }
 /*------------------------------
 Returns the X value of the Point
 --------------------------------*/
 public double getX(){
    return x;
  }
  /*------------------------------
  Returns the Y value of the Point
  --------------------------------*/
  public double getY(){
    return y;
  }
  /*------------------------------------------------------
  Returns the disntance from this point to the other point
  --------------------------------------------------------*/
  public double distanceTo(Point other){
    return ((double) Math.sqrt(((this.x-other.x)*(this.x-other.x))+((this.y-other.y)*(this.y-other.y))));
  }
  /*-------------------------------------------------------
  Checks to see if this point and the other point are equal
  ---------------------------------------------------------*/
  public boolean equals( Point other) {
    return (this.x == other.x && this.y == other.y);
  }

}
