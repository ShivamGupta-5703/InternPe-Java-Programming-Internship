// TASK B --> Write a program that takes three numbers as input to calculate and print the average of the numbers.

package Task_2;
import java.util.Scanner;
public class Task_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number to calculate average of the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int average = (a + b + c) / 3;
		System.out.println("Average of given numbers is : "+average);
		sc.close();
	}
}
