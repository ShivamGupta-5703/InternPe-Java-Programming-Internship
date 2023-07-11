// TASK D --> Find a Single Duplicate in an array of Integers.

package Task_1;
import java.util.*;
public class Task_D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5,6,7,8,6,10};
		System.out.println("Single Dupicate Elements : "+ Duplicate(nums));
	}
	public static int Duplicate(int nums[]) {
		Arrays.sort(nums);
        int cur=nums[0];
        int ans=cur;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==cur)
            {
                ans=nums[i];
                break;
            }
            cur=nums[i];
        }
        return ans;
	}
}
