package Ten;

public class empWageUC5 {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int NUM_OF_WORKING_DAY=20;
	empWageUC5(){
		int empRatePerHrs=20;
		int totalSalary=0;
		int salary;
		int empHrs;
		for(int i=1;i<=NUM_OF_WORKING_DAY;i++){ 
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
		}
		System.out.println("Monthly Wage is "+ totalSalary);
	}
	public static void main(String[] args) {
		empWageUC5 obj = new empWageUC5();
	}
}
