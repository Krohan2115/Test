import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int age;
		float salary;
		String name;
		
		System.out.println("Enter your Name");
		name = sc.nextLine();
		System.out.println("Enter your Age");
		age = sc.nextInt();
		System.out.println("Enter your Salary");
		salary = sc.nextFloat();
		
		System.out.println("Your Name is: " + name);
		
		System.out.println("Your Age is: " + age);
		
		System.out.println("Your Salary is: " + salary);
	}

}
