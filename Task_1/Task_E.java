// TASK E --> Find a Non-Unique Duplicate in an Array of Integers. 

package Task_1;
import java.util.*;
import java.util.Map.Entry;
public class Task_E {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1, 2, 3, 4, 4, 5, 5, 6};
		int n = nums.length;
		System.out.print("Non-Unique Duplicate Elements are : ");
		NonUniqueDuplicates(nums, n);
	}
	public static void NonUniqueDuplicates(int[] nums, int n)
	{
		Map<Integer,Integer> mp = new HashMap<>();
		int c = 0;
		boolean flag = false;
		for(int i = 0; i < n; i++){
			if(mp.containsKey(nums[i])){
				c = mp.get(nums[i]);
				mp.put(nums[i], c + 1);
			}
			else{
				mp.put(nums[i], 1);
			}
		}
		for(Entry<Integer,Integer> et : mp.entrySet())
		{
			if(et.getValue() > 1){
				System.out.print(et.getKey()+ " ");
				flag = true;
			}
		}
		if(!flag){
			System.out.println("-1");
		}
	}
}