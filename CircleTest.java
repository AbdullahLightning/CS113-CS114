import java.util.Random;
import java.util.Scanner;
public class CircleTest{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      int x = generator.nextInt(1, 26);
      int y = generator.nextInt(1, 26);
      
      Point point1 = new Point(x, y);
      Point point2 = new Point(0, 0);
      
      System.out.println("Please enter thevalue of radius:  ");
      int radius1 = scan.nextInt();   
      
      Circle circle1 = new Circle(point1, radius1);
      Circle circle2 = new Circle(point2, 5);
      System.out.println("First circle is : " + circle1 + "and the second circle is : " + circle2);
      
      if(circle1.equals(circle2)) {
            double distance = point1.distance(point2);
            System.out.println("Center distance between two circles  " + distance);
        } else {
            double avgCircumference = (circle1.circumference() + circle2.circumference()) / 2.0;
            System.out.println(" Average circumference: " + avgCircumference);
        }
      
      scan.close();
 
   }  
   
}