import java.util.Scanner;
public class CircleTest1{
   public static void main(String[] args){
      int size = 50;
      Circle[] circles = new Circle[size];
      
      Scanner scan = new Scanner(System.in);
      int total = 0;
      Point origin = new Point(0,0);
      for (int i = 0; i<circles.length; i++){
         System.out.print("Coordinates of the center: ");
         int x = scan.nextInt();
         int y = scan.nextInt();         
         
         System.out.print("Enter radius: ");
         double radius = input.nextDouble();
         
         if (circles[i].liesOnCircle(origin))
            total++; 
      }
     System.out.println(total);
   }
   
}