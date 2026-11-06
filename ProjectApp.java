public class ProjectApp{
   public static void main(String[] args){
      Project temp = new Project("Research Project", 10);    
      System.out.println(temp);
      Project project = new Project("Big Data", 0);
      
      int days = 0;
   
      while (project.getPages() < temp.getPages()){
         days++;
         int morePages = (int) (Math.random()*4);
         project.addPages(morePages);
         System.out.println("Day "+ days+": Pages added: "+ morePages);
      }
      System.out.println(project+"\n" + "Number of days to complete: "+ days);
   }



}