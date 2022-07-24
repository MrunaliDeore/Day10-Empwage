package Ten;

public class empWageUC6 {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int NUM_OF_WORKING_DAY=20;
	public static final int MAX_HRS=100;
	empWageUC6(){
		int empRatePerHrs=20;
		int totalSalary=0;
		int salary;
		int empHrs;
		int totalEmpHrs=0;
		int totalWorkingDays =0;
		while(totalEmpHrs<=MAX_HRS && totalWorkingDays<= NUM_OF_WORKING_DAY){ 
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck)	{
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs =0;
			}
			salary = empRatePerHrs*empHrs;
			totalSalary = totalSalary + salary;
			totalEmpHrs = totalEmpHrs + empHrs;
			totalWorkingDays++;
		}
		System.out.println("Monthly Wage is "+ totalSalary);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		empWageUC6 obj = new empWageUC6();
	}
}
