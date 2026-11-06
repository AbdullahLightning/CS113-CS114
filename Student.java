public class Student{
   private String name;
   private GPA gpa;
   
   public int Student(String name, GPA gpa){
      this.name=name;
      this.gpa=gpa;
   }
   public GPA getGPA(){
      return gpa;
   }
   public void setName(String newName){
      name=newName;
   } 
   public boolean honorRoll(Gpa other){
      return gpa.compareTo(other) >= 0;
   }
   public String toString(){
      return name + " GPA : " + gpa;
   }

}