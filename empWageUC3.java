package Ten;

public class empWageUC3 {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	empWageUC3(int x){
		int empRatePerHrs=20;
		int salary;
		if (x==IS_FULL_TIME) {
			int empHrs=8;
			salary = empRatePerHrs*empHrs;
			System.out.println("Employee Daily Wage is "+salary);
		}
		else if(x==IS_PART_TIME){
			int empHrs=4;
			salary = empRatePerHrs*empHrs;
			System.out.println("Employee Daily Wage is "+salary);
		}
		else {
			System.out.println("Employee Daily Wage is 0");
		}
	}
	public static void main(String[] args) {
		int empCheck = (int)Math.floor(Math.random()*10%3);
		empWageUC3 obj = new empWageUC3(empCheck);
	}
}
