import java.util.Scanner;
public class MainTesttwo{
   public static void main(String[] args)throws BonusTooHighException{
      Scanner scan = new Scanner(System.in);
      int validCount = 0;
      double totalpay = 0;
      
      
      System.out.println("How many executives does your company have? ");
      int exCount = scan.nextInt();
      scan.nextLine();
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
         scan.nextLine();
         
         System.out.println(" Enter executive bonus: ");
         double bonus = scan.nextDouble();
         scan.nextLine();
         
         Executive abc = new Executive(name, address, num, ssn, payrate);
         
         try{
            if(bonus>10000){
               throw new BonusTooHighException(" You entered too much !!! Bonus cannot be more than $10,000");
            }
            abc.awardBonus(bonus);
            validCount++;
         }catch (BonusTooHighException e){
            System.out.println("Dont make me Error" + e.getMessage());
            abc.awardBonus(0);
         }
         totalpay += abc.pay();   
         boss[i] = abc;
         
         
      
      }
      
      System.out.println("Executives with valid bonuses: " + validCount);
      System.out.println(" Average " +totalpay/exCount);
           }


}