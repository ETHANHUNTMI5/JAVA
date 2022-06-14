package sheet;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int [] arr = {1, -2, 1, 0, 5};
		int tar =0;
		
		Arrays.sort(arr);
		
		int l =0;
		int r=arr.length-1;
		int ans=-1;
		while(l<r)
		{
			int sum=arr[l]+arr[r];
			
			if(sum==tar)
			{System.out.println(arr[l]+" "+arr[r]);
			ans=1;
			break;}
			else if(sum>tar)
			{
				r=r-1;
			}
			else
			{l=l+1;}
			
		}
		if(ans==-1)
		{System.out.println("No");}
		
	}

}
