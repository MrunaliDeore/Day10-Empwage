package Ten;

public class empWageUC7 {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int NUM_OF_WORKING_DAY=2;
	public static final int MAX_HRS=100;
	public static final int EMP_RATE_PER_HRS=20;
	
	public static int computeEmpWage(){
		int empHrs;
		int totalEmpHrs=0;
		int totalWorkingDays =0;
		while(totalEmpHrs <= MAX_HRS && totalWorkingDays < NUM_OF_WORKING_DAY){
			totalWorkingDays ++;
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
			totalEmpHrs += empHrs;
			System.out.println("Days: "+ totalWorkingDays+ "Emp Hrs: "+ empHrs);
		}
		int totalEmpWage = totalEmpHrs + EMP_RATE_PER_HRS;
		System.out.println("Total Emp Wage : "+ totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args){
		computeEmpWage();
	}
}
