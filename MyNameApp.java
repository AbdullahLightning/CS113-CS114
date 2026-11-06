// ABDULLLAH YILDIRIM
import java.util.Scanner;

public class MyNameApp
{
   public static void main(String[] args)
   {
   String fname, lname;
   
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Enter your first name: ");
   fname = scan.nextLine();
   
   System.out.print("Enter your last name: ");
   lname = scan.nextLine();
   
   char initialname = fname.charAt(0);
   char initialsurname = lname.charAt(0);
   
   double averagelength = (fname.length() + lname.length()) / 2.0;
   
   System.out.println("Initials: " + initialname + initialsurname);
   System.out.println("Average length: " + averagelength);
   }


}