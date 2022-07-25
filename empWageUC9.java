package Ten;

public class empWageUC9 {

	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;

	private final String Company;
	private String totalEmpWage;
	private static int empRatePerHrs;
	private static int noOfWorkingDays;
	private static int maxHrsPerMonth;

	public empWageUC9(String Company, int empRatePerHrs, int noOfWorkingDays,
			int maxHrsPerMonth){
		this.Company = Company;
		this.empRatePerHrs = empRatePerHrs;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	public void computeEmpWage(){
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
			System.out.println("Days: "+ totalWorkingDays+ "Emp Hrs: "+ empHrs);
		}
		int  totalEmpWage = totalEmpHrs + empRatePerHrs;
	}
	
	@Override
	public String toString(){
		return "Total emp wage for company: " + Company + " is" + totalEmpWage;
	}
	public static void main(String[] args){
		empWageUC9 DMart = new empWageUC9("DMart",20,2,10);
		empWageUC9 BigBazar = new empWageUC9("BigBazar",10,4,20);
		DMart.computeEmpWage();
		System.out.println(DMart);
		BigBazar.computeEmpWage();
		System.out.println(BigBazar);
	}
}


