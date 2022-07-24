//Calculate Daily Employee Wage - UC2

package Ten;

public class empWageUC2 
{
	empWageUC2(int x)
	{
		int empRatePerHrs=20;
		int empHrs=8;
		int salary;
		if (x==1) 
		{
			salary = empRatePerHrs*empHrs;
			System.out.println("Employee Daily Wage is "+salary);
		}
		else {
			System.out.println("Employee Daily Wage is 0");
		}
	}
	public static void main(String[] args) 
	{
		int empCheck = (int)Math.floor(Math.random()*10%2);
		empWageUC2 obj = new empWageUC2(empCheck);
	}
}
