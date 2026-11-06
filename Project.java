public class Project
{
   private String title;
   private int pages;
   //Constructor
   public Project(String newTitle, int newPages){
      title = newTitle;
      pages = newPages;
   }
   //setter
   public void setTitle(String newTitle){
      title = newTitle;
   }
   //getter
   public int getPages(){
      return pages;
   }
   //addPages method 
   public void addPages(int morePages){
      pages += morePages;
   }
   public String toString(){
      String result = "Project Title: " + title + " , Number of pages: " + pages;
      return result;
   }
   public boolean equals(Project other){
      return (pages == other.pages) && title.equals(other.title);
      
   }

}