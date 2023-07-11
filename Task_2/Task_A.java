// TASK A --> Write a program to print the Area and Perimeter of a circle.

package Task_2;
import java.util.Scanner;
public class Task_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle : ");
		double radius = sc.nextDouble();
		double Perimeter = 2 * Math.PI * radius;
		double Area = Math.PI * Math.pow(radius, 2);
		System.out.println("Perimeter is = "+Perimeter);
		System.out.println("Area is = "+Area);
		sc.close();
	}

}
