import java.util.Scanner;
public class Temperature
{
   public static void main(String[] args)
   {
      double fahrenheit, celcius;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the temp in Fahrenheit: ");
      fahrenheit = scan.nextDouble();
      
      celcius = (fahrenheit-32)*5/9;
      
      System.out.print("Temp in celcius is " + celcius + " celcius ");
        
   
   
   
   }


}