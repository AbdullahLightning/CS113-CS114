// ABDULLAH YILDIRIM 
// Part 1: Write a class called Book that contains instance data that represents the book’s title, 
//title, as a String and number of pages, pages, as an integer. In addition, the class should include 
//the following methods:
//A default constructor that initializes title to “Java Programming” and pages to 200
//Getter methods for each instance data
//Setter methods for each instance data
//A toString() method that returns a one-line description of the book, including its title and the number of pages.
public class Book
{
   private String title;
   private int pages;
   
   public Book(){
      title = "Java Programming";
      pages = 200;
      
   }
   //getter
   public String getTitle(){
      return title;
   }
   //getter
   public int getPages(){
      return pages;
   }
   //setter
   public void setTitle(String word){
      title = word;
   }
   //setter
   public void setPages(int number){
      pages = number;
   }
   //toString() method
   public String toString(){
      String result = "Book's name is: " + title + " number of pages: " + pages;
      return result; 
   }
      
}

