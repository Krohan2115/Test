import java.util.Scanner;

public class CalculateTotalPay
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the employee");
        String name = sc.next();

        System.out.println("Enter base pay of the employee");
        double basePay = sc.nextDouble();

        System.out.println("Enter number of hours worked by the employee");
        int hoursWorked = sc.nextInt();

        CalculateTotalPay calculateTotalPay = new CalculateTotalPay();
        double salary = calculateTotalPay.calculateHourlyWages(basePay, hoursWorked);

        System.out.println("Name :: " + name);
        System.out.println("Base pay :: " + basePay + "$");
        System.out.println("Hours worked :: " + hoursWorked);
        System.out.println();
        System.out.println("Salary of employee :: " + salary + "$");

    }

     //Function to calculate wage of employee by analysing base pay and hours worked by employee
    public double calculateHourlyWages(double basePay, int hoursWorked) 
	{
		int overtime;
 		double pay;
 		CalculateTotalPay totalPay=new CalculateTotalPay();
 		if(basePay>=12 && hoursWorked>0)
		{
 				if(totalPay.calculateOnHourlyBasis(hoursWorked))
				{
 					overtime=hoursWorked-40;
				 	pay=basePay*40+(2*(basePay*overtime));
 				}
 				else
 				{
 					pay=basePay*hoursWorked;
 				}
 		return pay;
 		}
 		else
 		return 0;
        //return -1;
    }

     //Function to estimate if an employee has worked more than 40 hrs to get overtime pay
    public boolean calculateOnHourlyBasis(int hoursWorked)
	{
		if(hoursWorked>40 && hoursWorked<60)
 			return true; 
 		else
 			return false;
        
    }

    // Function to check if base pay is more than minimum wage
    public boolean checkBasePay(double basePay)
	{
        	boolean basePayMoreThanMinimumWage;
 			if(basePay>=12)
			{
 				basePayMoreThanMinimumWage = true;
 			}
 			else
			{
 				basePayMoreThanMinimumWage = false;
 			}
 			return basePayMoreThanMinimumWage;
    }
}