public class EmpWageBuilder{
	public static void main(String[] args){
		//Welcome message
		System.out.println("Welcome to Employee wage problem statement");
		//Employee present or not
		int IS_FULL_TIME=1;
		double empCheck= Math.floor(Math.random() *10)% 2;
		if(empCheck == IS_FULL_TIME){
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
	}
}
