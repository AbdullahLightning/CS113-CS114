public class Dog{
   private int age;
   private String breed;
   
   public Dog(int newAge, String newBreed){
      age = newAge;
      breed = newBreed;  
   }
   public int getAge(){
      return age;
   }
   public String getBreed(){
      return breed;
   }
   public void setAge(int newAge){
      age = newAge;
   }
   public void setBreed(String newBreed){
      breed = newBreed;
   }
   public String toString(){
      return "Breed: " + breed + ", Age: " + age; 
   }
   public boolean equals(Dog other){
      return breed.equals(other.getBreed());
   }
   public int compareTo(Dog other){
      if (age < other.getAge()){
         return -1;
      }else if (age > other.getAge()){
         return 1;
      }else {
         return 0;
      }         
   }
}