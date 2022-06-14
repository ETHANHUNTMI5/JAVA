package challenges_DP;

import java.util.Scanner;

public class CountBinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=0;a<t;a++)
		{
			int n = scn.nextInt();
			
			
			long [] one = new long[n];
			long [] zero= new long[n];
			
			one[0]=1;
			zero[0]=1;
			
			for(int k=1;k<n;k++)
			{
				one[k]=zero[k-1];
				zero[k]=zero[k-1]+one[k-1];
			}
			
			
			System.out.println(one[n-1]+zero[n-1]);
			
		}
	}
}