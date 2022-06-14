package sheet;

import java.util.Arrays;

public class SmallestSubset {

	public static void main(String[] args) {
		int [] arr = {3,4,5,6,6,1};
		int n = arr.length;
		Arrays.sort(arr);
		
		int ans=0;
		int sum=0;
		
		for(int a=0;a<n;a++)
		{sum+=arr[a];}
		
		int rsum=0;
		int lsum=sum;
		int t=0;
		for(int a=n-1;a>=0;a--)
		{rsum+=arr[a];
		lsum+=-arr[a];
		t++;
		if(rsum>lsum)
		{System.out.println(t);
		break;}
		}

	}

}
