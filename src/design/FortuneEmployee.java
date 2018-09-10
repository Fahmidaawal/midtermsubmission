package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception{
		EmployeeInfo em1 = new EmployeeInfo( 102);
		EmployeeInfo em2 = new EmployeeInfo("shama",101);
		em1.yearlyVacation();
		Bonus bonus = new Bonus( 5);
		bonus.yearlyVacation();
		bonus.yearlyVacation("alif");


		em1.setPerformance(3);
		System.out.println(em1.getPerformance());

		EmployeeInfo.calculateEmployeeBonus(120000,2);
		EmployeeInfo.calculateEmployeePension(240000);
	}
		


	}


