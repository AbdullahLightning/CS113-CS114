import java.util.Random;
public class MonetaryCoin extends Coin{
   Random generator = new Random();
   private int cents=generator.nextInt(100)+1;
   
   public int getMonetaryCoin(){
      return cents;
   }
   public void setMonetaryCoin(int c){
      cents=c;
   }
   public String toString(){
      return "("+cents+", "+super.toString()+")"; 
   }
   
   
}