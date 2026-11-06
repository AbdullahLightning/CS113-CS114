import java.util.Scanner;
public class TestDog{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.println("the number of dogs in the kennel: ");
      int numDogs = scan.nextInt();
      scan.nextLine();
   
      double totalAge = 0;
      Dog oldestDog = null;
      for(int x=0; x<numDogs; x++){
         System.out.println("Enter dog breed");
         String breed = scan.nextLine();
         
         System.out.println("How old is your dog :");
         int age = scan.nextInt();
         scan.nextLine();
   
         Dog dog1 = new Dog(age, breed);
         totalAge += age;
   
         if (oldestDog == null || dog1.compareTo(oldestDog) > 0){
            oldestDog = dog1;
         }   
      }   
      double avgAge = totalAge / numDogs;
      System.out.println("Average dog age: " + avgAge);
      System.out.println("Oldest Dog is : " + oldestDog);   
   
   
   }
   
   
}