public class Firm
{
//--------------------------------------------------------------
// Creates a staff of employees for a firm and pays them.
//--------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();
      personnel.payday();
      StaffMember[] StaffList = personnel.getStaffList();
      
      for (int i=0;i<StaffList.length;i++){
         StaffMember employee = StaffList[i];
         System.out.println(employee);
         System.out.println("Vacation days for employees: " + employee.vacation());
         System.out.println("---------------------------------------------");
      }
   }
}
