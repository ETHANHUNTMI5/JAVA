package dynamicProgramming;

import java.util.Arrays;

public class WildCardMatching {

	public static void main(String[] args) {
		
		String s1 = "abacde";
		String s2 = "a?**de";

		System.out.println(WR(s1, s2));
		int[][] dp = new int[s1.length()][s2.length()];
		for(int [] a:dp)
		{Arrays.fill(a, -1);}
		System.out.println(WTD(s1, s2, 0, 0,dp));
		System.out.println(WCBU(s1, s2));
	}

	public static boolean WR(String s1 , String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			if(s1.length()==0 && s2.length()==0)return true;
			
			if(s2.length()!=0)
			{
				for(int a=0;a<s2.length();a++)
				{
					if(s2.charAt(a)!='*')return false;
				}
			return true;
			}

			return false;
				
		}
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		
		if(c2!='*' && c2!='?')
		{
			if(c1==c2)
			{return WR(s1.substring(1), s2.substring(1));}
			else
			{return false;}
		}
		
		else if(c2=='?')
		{
			return WR(s1.substring(1), s2.substring(1));
		}
		
		else
		{
			boolean a = WR(s1, s2.substring(1));
			boolean b = WR(s1.substring(1), s2.substring(1));
			boolean c = WR(s1.substring(1), s2);
			return a|| b ||c;
		}
		
	}
	
	public static boolean WTD(String s1 , String s2,int v1,int v2,int [][] dp)
	{
		if(s1.length()==v1 || s2.length()==v2)
		{
			if(s1.length()==v1 && s2.length()==v2)return true;
			
			if(s2.length()!=v2)
			{
				for(int a=v2;a<s2.length();a++)
				{
					if(s2.charAt(a)!='*')return false;
				}
			return true;
			}

			return false;
				
		}
		if(dp[v1][v2]!=-1)return dp[v1][v2]==1;
		boolean ans;
		char c1 = s1.charAt(v1);
		char c2 = s2.charAt(v2);
		
		if(c2!='*' && c2!='?')
		{
			if(c1==c2)
			{ans=WTD(s1,s2,v1+1,v2+1, dp);}
			else
			{ans=false;}
		}
		
		else if(c2=='?')
		{
			ans= WTD(s1, s2,v1+1,v2+1, dp);
		}
		
		else
		{
			boolean a = WTD(s1, s2,v1,v2+1, dp);
			boolean b = WTD(s1, s2,v1+1,v2+1,dp);
			boolean c = WTD(s1, s2,v1+1,v2,dp);
			ans= a|| b ||c;
		}
		dp[v1][v2]=ans?1:0;
		return ans;
	}
	public static boolean WCBU(String s, String p) {
	    
        int l1 = s.length();
        int l2 = p.length();
        
        if(l1==0)
        {
            for(int a=0;a<l2;a++)
            {if(p.charAt(a)!='*')return false;}
            return true;
        }
        
        if(l2==0 && l1!=0)return false;
        
        boolean [][] dp = new boolean[l2+1][l1+1];
        
        dp[l2][l1] = true;
        
        if(p.charAt(l2-1)=='*')
        {
            dp[l2-1][l1]=true;
        }
        
        for(int row=l2-1;row>=0;row--)
        {
            char c1 = p.charAt(row);
            for(int col= l1-1;col>=0;col--)
            {
                char c2 = s.charAt(col);
                
                if(c1=='?' || c1==c2 )
                {
                    dp[row][col] = dp[row+1][col+1];
                }
                else if(c1=='*')
                {
                    for(int x=col;x<=l1;x++)
                    {
                        dp[row][col] = dp[row][col]|dp[row+1][x];
                    }
                    
                    if(dp[row+1][l1])dp[row][l1]=true;
                    
                }
               
                else
                {dp[row][col]=false;}
                    
            }
            
           
            
        }
         
    return dp[0][0];}
}