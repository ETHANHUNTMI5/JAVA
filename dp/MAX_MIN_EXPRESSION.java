package dp;

import java.util.ArrayList;
import java.util.Arrays;

public class MAX_MIN_EXPRESSION {

	public static void main(String[] args) {
		
		String s = "1+2*3+4*5";
		
		int n = s.length();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Character> oprs = new ArrayList<Character>();

		for(int a=0;a<n;a++)
		{
			char cc = s.charAt(a);
			
			if(cc=='+' || cc=='*')
			{oprs.add(cc);}
			else
			{nums.add(cc-48);}
		}
		
		oprs.add('+');
		nums.add(0);
	
		int l = nums.size()-1;
		int [][] dp = new int[l][l];
		
		
		for(int gap =1;gap<=l;gap++)
		{
			if(gap==1)
			{
				for(int a=0;a<l;a++)
				{dp[a][a]=nums.get(a);}
			}
			else
			{
				for(int i=0,j=gap-1;j<l;i++,j++)
				{
					//System.out.println(gap+" "+i+" "+j);
					int max = Integer.MIN_VALUE;
					for(int k=i;k<=j;k++)
					{
						
						int val1 = dp[i][k];
						int val2 = (k+1>=l)?0:dp[k+1][j];
						
						char op = oprs.get(k);
						int fval = 0;
						if(op=='+')
						{
							fval = val1+val2;
						}
						else
						{
							fval = val1*val2;
						}
						max = Math.max(max, fval);
					}
				dp[i][j]= max;}
			}
		}
		
		for(int i=0;i<l;i++){
			{
				for(int j=0;j<l;j++)
				{System.out.print(dp[i][j]+" ");}
				System.out.println();
			}
		}
		
		System.out.println("*********************");
		
		dp = new int[l][l];
		for(int a=0;a<l;a++)
		{Arrays.fill(dp[a], Integer.MAX_VALUE);}
		
		for(int gap =1;gap<=l;gap++)
		{
			if(gap==1)
			{
				for(int a=0;a<l;a++)
				{dp[a][a]=nums.get(a);}
			}
			else
			{
				for(int i=0,j=gap-1;j<l;i++,j++)
				{
					
					int min = Integer.MAX_VALUE;
					for(int k=i;k<=j;k++)
					{
						
						int val1 = dp[i][k];
						int val2 = (k+1>=l)?0:dp[k+1][j];
						if(val1==Integer.MAX_VALUE || val2==Integer.MAX_VALUE)
							continue;
						
						char op = oprs.get(k);
						int fval = 0;
						if(op=='+')
						{
							fval = val1+val2;
						}
						else
						{
							fval = val1*val2;
						}
						min = Math.min(min, fval);
					}
				dp[i][j]= min;}
			}
		}
		
		for(int i=0;i<l;i++){
			{
				for(int j=0;j<l;j++)
				{System.out.print(dp[i][j]+" ");}
				System.out.println();
			}
		}

	}

}
