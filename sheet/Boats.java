package sheet;

import java.util.Arrays;

public class Boats {

	public static void main(String[] args) {
		
		int [] arr = {3,5,3,4};
		int lim =5;
		Arrays.sort(arr);
		int count=0;
		int n = arr.length;
		
		
		int lo =0;
		int hi = n-1;
		
		while(lo<hi)
		{
			if(arr[lo]+arr[hi]<=lim)
			{
				count++;
				lo++;
				hi--;
			}
			
			else
			{
				count++;
				hi--;
			}
			
		}
		
		if(lo==hi)
		{count++;}
		
		System.out.println(count);
		
		
	}

}
