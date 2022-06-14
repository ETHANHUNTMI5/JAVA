package challenges_DP;

import java.util.Scanner;

public class UGLYNum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		
		for(int b=1;b<=t;b++)
		{
			int n = scn.nextInt();
					
		long[] arr = new long[n];
		
		arr[0]=1;
		int i2=0,i3=0,i5=0;
		for(int a=1;a<n;a++)
		{
			
			arr[a]= Math.min(arr[i2]*2, Math.min(arr[i3]*3, arr[i5]*5));
			
			
			if(arr[a]==arr[i2]*2)
			{
				i2++;
			}
			if(arr[a]==arr[i3]*3)
			{
				i3++;
			}
			if(arr[a]==arr[i5]*5)
			{
				i5++;
			}
			
			
		}
		
		System.out.print(arr[n-1]+" ");
		}
	}
	

}
