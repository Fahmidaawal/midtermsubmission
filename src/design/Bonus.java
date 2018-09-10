package design;

public class Bonus extends EmployeeInfo {

    public Bonus(int employeeId) {
        super(employeeId);

    }
     public void yearlyVacation(){
         System.out.println( "no paind vacation" );
     }
     public void  yearlyVacation( String name ){
         System.out.println("New employee name is alif");

     }
}
