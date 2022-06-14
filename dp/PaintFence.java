package dp;

import java.util.Arrays;

public class PaintFence {
public static int [][] dp = new int[1001][1001];
	public static void main(String[] args) {
		int n =3;
		int k= 2;
		for(int a=0;a<=1000;a++)
		{
			Arrays.fill(dp[a], -1);
		}
		System.out.println(help(n, k, 0, 0, 0));

	}
	public static int help(int n , int k ,int freq ,int idx,int pre)
    {
        int i=0;
        if(idx==n)
        {return 1;}

        
        if(dp[n][k]!=-1)
        {return dp[idx][pre];}
        
        for(int a=1;a<=k;a++)
        {
            if(a==pre && freq<2)
            {
            	
                i+=help(n,k,++freq,idx+1,pre);
            }

            else if(a!=pre)
            {
                i+= help(n,k,1,idx+1,a);
            }

            
        }
        dp[idx][pre]=i;
return i;
    }
}