import java.util.Random;
public class TestArrays{
//Part 1: Design and implement a method numberFreq() that takes no parameters. The method generates 100 random integers in the range 0-5, 
//inclusive, and counts how many occurrences of each are entered. The method employs an array to store the frequencies and returns this array. NO other arrays should be created.
   public static int[] numberFreq(){
      Random generator = new Random(); 
      int[] numList = new int[6];
      for (int i=0; i<100; i++)
      {
            int number = generator.nextInt(0, 6);
            numList[number]++;
         
      }
      return numList;
      }
//Part 2: Write a method named fibo that takes an integer parameter, total. The method will create,
// populate and return an array of the first total Fibonacci numbers in the sequence. This sequence starts with 1 and 1 as the first 2 elements and each element 
//thereafter is the sum of the previous two elements. (1, 1, 2, 3, 5, 8, 13…) 
   public static int[] fibo(int total){
      int[] array = new int[total];
      array[0] = 1;
      array[1] = 1;
      for (int i=2; i<total; i++){
         array[i] = array[i-2] + array[i-1];
      }
      return array; 
   }
//Part 3: Write a method oddDice() that takes an array of Die objects as a parameter. 
//The method rolls each die and returns the total number of dice that land in an odd face value.    
   public static int oddDice(Die[] dice){
      int oddFaceValue = 0;
      for(int i=0; i<dice.length; i++){
         dice[i].roll();
         if (dice[i].getFaceValue() % 2 == 1){
            oddFaceValue++;
         }   
      }
      return oddFaceValue;
   }
   public static void main(String[] args){
      int[] test = numberFreq();
      System.out.println("Frequencies between 0-5 (inclusive)   : ");
      for (int i=0; i<test.length; i++){
         System.out.println(test[i]);   
   }
   int max = 12;
   int[] fibo = fibo(max);
   for(int i=0; i<fibo.length; i++){
      System.out.println(fibo[i]);
   }
   Die[] dice = { new Die(), new Die()};
   System.out.println("Odd dice count: " + oddDice(dice));
   }  
}   