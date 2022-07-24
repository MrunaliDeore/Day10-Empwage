//Check Employee is Present or Absent - UC1

package Ten;

public class empWageUC1 {
	public static void main(String[] args){
		int FULL_TIME=1;
		double empCheck = Math.floor (Math.random()*10)%2;
		if(empCheck == FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is not present");
	}
}
