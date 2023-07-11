// TASK D --> Write a program to print an American Flag on the screen

package Task_2;
public class Task_D {
	public static void main(String[] args) {  
       int x =  15;  
       int y = 41;  
       for(int i = 0; i<= x; i++) {  
            for(int j = 0; j <= y; j++){  
                if(i < 9 && j > 14){  
                    if((i + j) % 2 != 0 && j < 26){  
                        System.out.print("*");  
                    } else if(j > 26){  
                        System.out.print("=");  
                    } else {  
                        System.out.print(" ");  
                    }  
                } else {    
                    if(i > 9 && i <= x && j > 11 && j <y-2) {  
                        System.out.print("=");  
                    }  
                }
            } 
            if(i==9) {
            	int p=27;
            	while(p-->0) {
            		System.out.print("=");
            	}
            }
            System.out.print("\n");       
        }  
    }  
}
