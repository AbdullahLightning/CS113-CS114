public class CircleMidterm{
   private Point center;
   private double radius;

   public CircleMidterm(Point center, double radius){  //constructor
      this.center=center;
      this.radius=radius;
   }
   public Point getCenter(){    //getter return en bastaki
      return center;
   }
   public void setRadius(double r){  //setter setter constructordaki parametre
      radius=r;
   }
   public boolean liesOnCircle(Point p){
      return p.distance(center) == radius;
                
   }
}