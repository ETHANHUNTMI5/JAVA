package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class FirstPositive {

	public static void main(String[] args) {
		int [] arr = {1,1,1,1,2,0};

		ArrayList<Integer> dp = new ArrayList<Integer>();
		
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]>0)
			dp.add(arr[a]);
		}
	System.out.println(dp);
	Collections.sort(dp);
	int x= dp.get(0);
		ArrayList<Integer> dp2 = new ArrayList<Integer>();
	
		dp2.add(x);
	for(int i=1;i<dp.size();i++)
	{
		if(dp.get(i)!=x)
		{
			dp2.add(dp.get(i));
			x= dp.get(i);
		}
		
	}
	
	
	
	
	
	
	System.out.println(dp2);
		
		int ans =0;
		for(int a=0;a<dp2.size();a++)
		{
			if(dp2.get(a)!=a+1)
			{ans = a+1;
			break;}
		}
		
		if(ans==0)
		{ans = dp2.size()+1;}
	System.out.println(ans);
	}
}