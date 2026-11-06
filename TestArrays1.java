import java.util.Arrays;
public class TestArrays1{
   static int[][] sales = new int[][]{
      {200, 350, 400},
      {150, 375, 225}
      };
   public static int[] salesRange(int[][] sales){ 
      int lowestSale = sales[0][0];
      int highestSales = sales[0][0];
      for (int row = 0; row<sales.length; row++){
         for (int colum = 0; colum<sales[row].length; colum++){
            if (sales[row][colum]<lowestSale){
               lowestSale = sales[row][colum];
            }else if (sales[row][colum]>highestSales){
               highestSales = sales[row][colum];
            }
         }
         
      }
      int range = highestSales - lowestSale;
      return new int[]{lowestSale, highestSales, range}; 
                                                     
   }
   public static int[] dieStats(Die[][] dice){
      int[] oddrowDice = new int[dice.length];
      
      for(int i =0; i<dice.length; i++){
         int counter = 0;
         for(int x=0; x<dice[i].length; x++){
            dice[i][x].roll();
            int face=dice[i][x].getFaceValue();
            if(face%2!=0){
               counter++;
            }
         }
         oddrowDice[i] = counter;
      }
      return oddrowDice;
   }
public static void main(String[] args){
   int[] Salestest = salesRange(sales);
   System.out.println("Sales Range Test: " + Salestest[0] +" , "+ Salestest[1]+" , " + Salestest[2]);
   
   
   Die[][] dice = new Die[2][3];
   for(int i=0; i<dice.length; i++){
      for(int x=0; x<dice[i].length; x++){
         dice[i][x] = new Die();
      }
   }      
   int[] TestDice = dieStats(dice);
   System.out.println("Die objects in each row that land in an odd number: " + TestDice[0] + " , " + TestDice[1]);
   
}
}