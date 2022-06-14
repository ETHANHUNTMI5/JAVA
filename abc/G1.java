package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
	
		int [] nums = {3,5,2,3};
		ArrayList<Integer> ll = new ArrayList<Integer>();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int a=0;a<nums.length;a++)
		{
			arr.add(nums[a]);
		}
		
		Collections.sort(arr);
		
		for(int a=0;a<nums.length/2;a++)
		{
			
			ll.add(arr.get(a)+arr.get(nums.length-1-a));
		}
		
		int max= ll.get(0);
		
		for(int i : ll)
		{
			if(i>max)
			{max=i;}
		}
		
		System.out.println(max);
	}

}
