//ABDULLAH YILDIRIM
import java.util.Scanner;
public class TimeConverter
{
   public static void main(String[] args)
   {
   int seconds, hours, minutes, totalseconds;
   
   
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter total number of seconds: ");
   totalseconds = scan.nextInt();
   
   hours = totalseconds / 3600;
   minutes = ((totalseconds % 3600) / 60);
   seconds = (totalseconds % 60);
   
   System.out.print(hours + " hour, " + minutes + " minutes, " + seconds + " seconds");
   }
}