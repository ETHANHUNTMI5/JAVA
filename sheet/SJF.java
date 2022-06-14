package sheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SJF {

	public static void main(String[] args) {
//		Process ID      Arrival Time    Burst Time
//		1               2               3
//		2               0               4
//		3               4               2
//		4               5               4

		int n = 4;
		int [] arrival = {2,0,4,5};
		int [] burst =   {3,4,2,4};
		
		int [][] arr = new int[n][3];
		
		for(int a=0;a<n;a++)
		{
			arr[a][0] = arrival[a];
			arr[a][1] = burst[a];
			arr[a][2]=  a+1;
		}
		
		Arrays.sort(arr,(a,b)->a[0]-b[0]);
		
		for(int a=0;a<n;a++)
		{System.out.println(arr[a][0]+" "+arr[a][1]+" "+arr[a][2]);}
		System.out.println("*************");
//		
		int s= arr[0][0];
		int e = s+arr[0][1];
		Set<Integer> ss = new HashSet<>();
		ss.add(0);
		System.out.println("P"+(arr[0][2])+" "+e);
		for(int a=1;a<n;a++)
		{
			int min = Integer.MAX_VALUE;
			int min_idx =-2;
			//System.out.println(e+" "+ss);
			for(int b=0;b<n;b++)
			{
				if(arr[b][1]<min && !ss.contains(b) && arr[b][0]<=e)
				{min=arr[b][1];
				min_idx=b;}
			}
			ss.add(min_idx);
			e+=min;
			System.out.println("P"+(arr[min_idx][2])+" "+e);
		}
	
	}

}
