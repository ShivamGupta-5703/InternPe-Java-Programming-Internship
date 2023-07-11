// TASK C --> Write a program to print the Area and Perimeter of a rectangle.

package Task_2;
import java.util.Scanner;
public class Task_C {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the width and height of the rectangle : ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		double area = width*height;
		System.out.println("Area of the rectangle is : "+area);
		sc.close();
	}
}
