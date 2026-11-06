public class Grade{
   private int numGrade;
   private char letterGrade;
   
   public Grade(int num){
      numGrade=num;
      if (numGrade>=65)
         letterGrade='S';
      else
         letterGrade='U';
   }
   public int getNumgrade(){
      return numGrade;
   }
   public char getLettergrade(){
      return letterGrade;
   }
   public void setLettergrade(char newletterGrade){
      letterGrade = newletterGrade;  
   }
   public String toString(){
      return "Score: " + numGrade + ", Letter Grade: " + letterGrade ;
   }
   public boolean isSatisfactory(){
      return letterGrade == 'S';
   }
   public boolean equals(Grade other){
      return letterGrade == other.getLettergrade();
   }


}