// TASK C --> Create a Named Loop.

package Task_1;
public class Task_C {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Outer:     //Outer Label for outer loop. 
		for(int i=0;i<n;i++) {
			Inner:   //Inner Label for inner loop.
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1) {
					System.out.print("*"+" "+" ");
				}
				else {
					System.out.print(" "+" "+" ");
				}
			}System.out.println();
		}
	}
}
