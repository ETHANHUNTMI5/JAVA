package dynamicProgramming;

public class EditDistance {

	public static void main(String[] args) {
		
		String s1 = "Sunday";
		String s2 = "Saturday";
		System.out.println(Edit(s1, s2));
		System.out.println(EditVI(s1, s2, 0, 0));
		System.out.println(EditVITop(s1, s2, 0, 0, new int[s1.length()][s2.length()]));
		System.out.println(EDBU(s1, s2));
		
		
	}
	public static int Edit(String s1,String s2)
	{
		if(s1.length()==0 ||s2.length()==0)
		{return Math.max(s1.length(), s2.length());}
		
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		
		int ans=0;
		if(c1==c2)
		{
			ans=Edit(s1.substring(1),s2.substring(1));
		}
		
		else
		{
			int val1 = Edit(s1.substring(1),s2.substring(1));
			int val2 = Edit(s1,s2.substring(1));
			int val3 = Edit(s1.substring(1),s2);
			ans = 1 +Math.min(val1, Math.min(val2, val3));
					
		}
		return ans;
	}

	public static int EditVI(String s1,String s2,int v1,int v2)
	{
		if(v1==s1.length() || v2==s2.length())
		{return Math.max(s1.length()-v1, s2.length()-v2);}
		
		char c1 = s1.charAt(v1);
		char c2 = s2.charAt(v2);
		
		int ans=0;
		if(c1==c2)
		{
			ans=EditVI(s1,s2,v1+1,v2+1);
		}
		
		else
		{
			int val1 = EditVI(s1, s2, v1+1, v2+1);
			int val2 = EditVI(s1, s2, v1+1, v2);
			int val3 = EditVI(s1, s2, v1, v2+1);
			ans = 1 +Math.min(val1, Math.min(val2, val3));
					
		}
		return ans;
	}
	
	public static int EditVITop(String s1,String s2,int v1,int v2, int [][] strg)
	{
		if(v1==s1.length() || v2==s2.length())
		{return Math.max(s1.length()-v1, s2.length()-v2);}
		
		char c1 = s1.charAt(v1);
		char c2 = s2.charAt(v2);
		
		if(strg[v1][v2]!=0)return strg[v1][v2];
		int ans=0;
		if(c1==c2)
		{
			ans=EditVITop(s1,s2,v1+1,v2+1,strg);
		}
		
		else
		{
			int val1 = EditVITop(s1, s2, v1+1, v2+1,strg);
			int val2 = EditVITop(s1, s2, v1+1, v2,strg);
			int val3 = EditVITop(s1, s2, v1, v2+1,strg);
			ans = 1 +Math.min(val1, Math.min(val2, val3));
					
		}
		return strg[v1][v2]=ans;
	}
	
	public static int EDBU(String word1 , String word2)
	{
		int n = word1.length();
        int m = word2.length();
        
        int [][] dp = new int[n+1][m+1];
        
        for(int a=m-1;a>=0;a--)
        {
            dp[n][a] = m-a;
        }
        
        for(int a=n-1;a>=0;a--)
        {
            dp[a][m] = n-a;
        }
        
        
        for(int row = n-1;row>=0;row--)
        {
            for(int col = m-1;col>=0;col--)
            {
                if(word1.charAt(row)==word2.charAt(col))
                {dp[row][col]=dp[row+1][col+1];}
                
                else
                {
                    dp[row][col]=1+Math.min(dp[row+1][col+1],Math.min(dp[row][col+1],dp[row+1][col]));
                }
            }
        }
		return dp[0][0];
        
	}
}
