// ABDULLAH YILDIRIM
//Part 2: Write an application called TestBook that creates two instances of the Book class 
//and modifies their titles and pages based on user input. The program should then display the information 
//about each object, i.e. utilizing the toString() method, as well as the average number of pages.
import java.util.Scanner;
public class TestBook
{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Book book1 = new Book();
      
      System.out.println("Enter name of the book: ");
      String title = scan.nextLine();
      book1.setTitle(title);
      System.out.println("Enter the number of pages: ");
      int pages = scan.nextInt();
      book1.setPages(pages);
      scan.nextLine();
         
      Book book2 = new Book();
      System.out.println("Enter name of the book: ");
      title = scan.nextLine();
      book2.setTitle(title);
      System.out.println("Enter the number of pages: ");
      pages = scan.nextInt();
      book2.setPages(pages);
      
      //display the info about each project
      System.out.println("Information about first and second book: ");
      System.out.println(book1.toString());
      System.out.println(book2.toString());
      
      double avgPage = (book1.getPages() + book2.getPages()) / 2.0;
      System.out.println("Average of page numbers: " + avgPage);
      scan.close(); 
   }
}