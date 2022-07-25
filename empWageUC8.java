package Ten;

public class empWageUC8 {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	
	public static int computeEmpWage(String Company, int empRatePerHrs, int noOfWorkingDays,
			int maxHrsPerMonth){
		int empHrs;
		int totalEmpHrs=0;
		int totalWorkingDays =0;
		while(totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < noOfWorkingDays){
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
			System.out.println("Days: "+ totalWorkingDays+ " Emp Hrs: "+ empHrs);
		}
		int totalEmpWage = totalEmpHrs + empRatePerHrs;
		
		System.out.println("Total Emp Wage for company : "+ Company + " is " + totalEmpWage);
		System.out.println("---------------------------------");
		return totalEmpWage;
	}
	public static void main(String[] args){
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("BigBazar",10,4,20);
	}
	
}
