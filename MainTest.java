import java.util.Scanner;
public class MainTest{
   public static void main(String[] args)throws BonusTooHighException{
      Scanner scan = new Scanner(System.in);
      
      System.out.println("How many executives does your company have? ");
      int exCount = scan.nextInt();
      Executive[] boss = new Executive[exCount];
      
      for (int i=0; i<exCount;i++){
         System.out.println("Enter executive name: ");
         String name = scan.nextLine();
         
         System.out.println("Enter executive address: ");
         String address = scan.nextLine();
         
         System.out.println("Enter executive phone number: ");
         String num = scan.nextLine();
         
         System.out.println("Enter executive ssn: ");
         String ssn = scan.nextLine();
         
         System.out.println("Enter executives pay rate: ");
         double payrate = scan.nextDouble();
         
         System.out.println(" Enter executive bonus: ");
         double bonus = scan.nextDouble();
         
         if(bonus>1000){
            throw new BonusTooHighException("You entered too much !!! Bonus cannot be more than $10,000");
         }
            
         Executive abc = new Executive(name, address, num, ssn, payrate);
         abc.awardBonus(bonus);
         boss[i] = abc;
         
      
      }
   
   }


}