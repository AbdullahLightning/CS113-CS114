import java.util.Random;
public class IntegerList{
   private int[] list;
  
   public IntegerList(int size){
      list = new int[size];
   }
   public int[] getList(){
      return list;
   }
   public void setList(int[] list){
      this.list=list;
   }
   public void randomize(){
      Random generator = new Random();
      for (int i=0;i<list.length;i++){
         list[i]=generator.nextInt(1, 101);
      }
   }
   public String toString(){
      String s = " ";
      for (int i = 0; i<list.length; i++){
         s+=list[i] + " ";
      }
      return s;
   }
   public IntegerList merge(IntegerList other){
      int sizeofList1 = list.length;
      int sizeofList2 = other.list.length;
      int[] merger = new int[sizeofList1 + sizeofList2];
      
      for (int i = 0; i<sizeofList1;i++){
         merger[i] = list[i];
         }
      for (int i = 0; i<sizeofList2;i++){
         merger[sizeofList1+i] = other.list[i];
      }
      IntegerList mergedList = new IntegerList(sizeofList1 + sizeofList2);
      mergedList.setList(merger);
      return mergedList;
   } 

}