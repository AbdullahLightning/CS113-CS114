public class Circle {
  private Point center;
  private int radius;
  
  public Circle(Point newCenter, int newRadius){
      center = newCenter;
      radius = newRadius;
  }
   
  public Point getCenter(){
      return center;
  } 
  public int getRadius(){
      return radius;
  } 
  public void setCenter(Point newCenter){
      center = newCenter;
  } 
  public void setRadius(int newRadius){
      radius = newRadius;
  }
  public boolean equals(Circle secondCircle){
      if (radius == secondCircle.radius){
         return true;
      }  
      return false;
            
  }   
  public double circumference(){
      return radius * 2 * Math.PI;
          
  }   
  public String toString(){
      String result = ("Center is : " + center + " Radius is : " + radius + "Circumference is : " + circumference() );
      return result;
  }
}