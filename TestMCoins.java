public class TestMCoins{
   public static void main(String[] args){
      MonetaryCoin[][] test = new MonetaryCoin[3][5];
      for(int i=0;i<test.length;i++){
         for(int j=0;j<test[i].length;j++){
            test[i][j] = new MonetaryCoin();
            test[i][j].flip();
         }}
      for (int i=0; i<test.length;i++){
         int Htotal=0;
         for(int j=0; j<test[i].length;j++){
            System.out.println(test[i][j]);
            
            if (test[i][j].isHeads()){
               Htotal += test[i][j].getMonetaryCoin();
            }
         
         }
         System.out.println(Htotal);
      
      }
   
   }

}
