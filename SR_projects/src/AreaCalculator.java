import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
		AreaCalculator a = new AreaCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();

        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it
		a.calculateAreaOfFence(choice);
		scanner.close();
    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice) {
		double ans;
		Scanner sc = new Scanner(System.in);
    	switch(choice) {
    	case 1:
    		System.out.print("Enter side of square : ");
    		double side = sc.nextInt();
    		ans = calculateAreaOfSquare(side);
    		System.out.print("Area of square fence for chickens is "+ans);
    		break;
    	case 2:
    		System.out.print("Enter radius of circle : ");
    		double radius = sc.nextInt();
    		ans = calculateAreaOfCircle(radius);
    		System.out.print("Area of circular fence for ducks is "+ans);
    		break;
    	case 3:
    		System.out.print("Enter length of rectangle : ");
    		System.out.print("Enter breadth of rectangle : ");
    		double length = sc.nextInt();
    		double breadth = sc.nextInt();
    		ans = calculateAreaOfRectangle(length,breadth);
    		System.out.print("Area of rectangular fence for cows is "+ans);
    		break;
    	default:
    		System.out.print("Wrong Choice : ");
    		break;
    	}
    	sc.close();
    }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
		double a = (double)(side*side);
        return a;
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
		double b = (double)(3.14*radius*radius);
        return b;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
		double c = (double)(length*breadth);
        return c;
    }
}
