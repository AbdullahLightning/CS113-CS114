// ABDULLAH YILDIRIM
import java.util.Random;
public class RandomPlate
{
   public static void main(String[] args)
   {
   String letters = "QWERTYUIOPASDFGHJKLZXCVBNM";
   int num1, num2;
   char letter1, letter2, letter3, letter4, letter5;
  
   Random generator = new Random();
   
   int index1 = generator.nextInt(26);
   int index2 = generator.nextInt(26);
   int index3 = generator.nextInt(26);
   int index4 = generator.nextInt(26);
   int index5 = generator.nextInt(26);
   
   letter1 = letters.charAt(index1);
   letter2 = letters.charAt(index2);
   letter3 = letters.charAt(index3);
   letter4 = letters.charAt(index4);
   letter5 = letters.charAt(index5);
   
   num1 = generator.nextInt(0,10); 
   num2 = generator.nextInt(0,10);
   
   System.out.println("Random License plate: "+letter1+letter2+letter3+letter4+letter5+num1+num2);
   
   }

}
