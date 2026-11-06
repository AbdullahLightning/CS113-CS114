public class TestRecursion{
   public static void printDigits(int num){
      if (num<10){
         System.out.println(num);
      }else{printDigits(num/10);
      
         System.out.println(num%10);
      }
      }
   public static int sumArray(int[] numArray, int count){
      if (count == 1){
          return numArray[0];
      }else{
         int recursion = numArray[count-1]+sumArray(numArray,count-1);
         return recursion;
      }  
      }
   public static void main(String[] args){
      printDigits(123147);
      int[] test = {1,3,2,5};
      System.out.println(sumArray(test,1));
      System.out.println(sumArray(test,2));
      System.out.println(sumArray(test,3));
      System.out.println(sumArray(test,4));
      
   }
}