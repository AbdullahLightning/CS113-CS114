public class Die
{
   // attributes 
   private int faceValue;
   
   //default constructor
   public Die(){
      roll();
   }
   //constructor with parameters
   public Die(int number){
      faceValue = number;
   }
   
   //methods
   public void roll()
   {
      faceValue = (int)(Math.random() * 6) + 1;
      
   }
   //getter method
   public int getFaceValue(){
      return faceValue;
   }
   
   // setter method for faceValue
   public void setFaceValue(int number){
      faceValue = number;
   }
   //toString() method
   public String toString(){
      String result = "Die with face value " + faceValue;
      return result;
   }
   
   //equals method
   public boolean equals(Die other){
      if (faceValue == other.faceValue) { //faceValue==other.FaceValue()
         return true;
      } else{
         return false;
      }
      //one-liner: return faceValue == other.faceValue;   
   }
   //compare method
   public int compareTo(Die other) {
      if (faceValue > other.faceValue){
         return 1;
      } else if (faceValue == other.faceValue){
         return 0;
      } else {
         return -1;
      }
      
               
   }
}