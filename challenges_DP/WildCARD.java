package challenges_DP;

public class WildCARD {

	public static void main(String[] args) {
 
		String s1 = "aa";
		String s2 = "a*a";

		System.out.println(CARD(s1, s2, 0, 0));
		System.out.println(CARDBU(s1, s2));
		int [][] arr = new int[s1.length()+1][s2.length()+1];
		for(int a=0;a<=s1.length();a++)
		{for(int j=0;j<=s2.length();j++)
			{
			arr[a][j]=2;
			}}
		
		System.out.println(CARDTD(s1, s2, 0, 0, arr));
	}

	public static int CARD(String s1,String s2,int vi1,int vi2)
	{
		
		if(vi1==s1.length() && vi2==s2.length())
		{return 1;
		}
			if(vi1==s1.length() && vi2!=s2.length())
			{
				for(int i = vi2;i<s2.length();i++)
				{
					if(s2.charAt(i)!='*')
						return 0;
				}
				
				return 1;
			}
		
			if(vi1!=s1.length() && vi2==s2.length())
			{return 0;}
		
		
		
		
		
		
		
    	char ch1 = s1.charAt(vi1);
	    char ch2 = s2.charAt(vi2);
		
		
		int ans =0;
		if(ch1==ch2)
		{ans = CARD(s1, s2, vi1+1, vi2+1);}
		
		else {
		if(ch2 =='?')
		{
			ans = CARD(s1, s2, vi1+1, vi2+1);
		}
		
		else if(ch2=='*')
		{int ans1  = CARD(s1, s2, vi1+1, vi2+1);
		int ans2 = CARD(s1, s2, vi1+1, vi2);
		
		if(ans1==1 || ans2==1)
		{ans =1;}
		else
		{ans=0;}
		
		}
		
		else
		{ans=0;}
		
		}
	return ans;
		
	}
	public static int CARDTD(String s1,String s2,int vi1,int vi2,int[][] strg)
	{
		
		if(vi1==s1.length() && vi2==s2.length())
		{return 1;
		}
			if(vi1==s1.length() && vi2!=s2.length())
			{
				for(int i = vi2;i<s2.length();i++)
				{
					if(s2.charAt(i)!='*')
						return 0;
				}
				
				return 1;
			}
		
			if(vi1!=s1.length() && vi2==s2.length())
			{return 0;}
		
		
		
		
		
		
			
		if(strg[vi1][vi2]!=2)
		{return strg[vi1][vi2];}
		
    	char ch1 = s1.charAt(vi1);
	    char ch2 = s2.charAt(vi2);
		
		
		int ans =0;
		if(ch1==ch2)
		{ans = CARDTD(s1, s2, vi1+1, vi2+1,strg);}
		
		else {
		if(ch2 =='?')
		{
			ans = CARDTD(s1, s2, vi1+1, vi2+1,strg);
		}
		
		else if(ch2=='*')
		{int ans1  = CARDTD(s1, s2, vi1+1, vi2+1,strg);
		int ans2 = CARDTD(s1, s2, vi1+1, vi2,strg);
		
		if(ans1==1 || ans2==1)
		{ans =1;}
		else
		{ans=0;}
		
		}
		
		else
		{ans=0;}
		
		}
		strg[vi1][vi2]=ans;
	return ans;
		
	}
	public static int CARDBU(String s1, String s2)
	{
		int [][] strg = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<=s1.length();i++)
		{
			for(int j =0;j<s2.length();j++)
			{
				
				strg[i][j]=2;}
			
			
		}
		strg[s1.length()][s2.length()]=1;
		
		for(int row=s1.length();row>=0;row--)
		{for(int col=s2.length()-1;col>=0;col--)
			{
			if(row==s1.length())
			{
				if(s2.charAt(col)=='*')
				{strg[row][col]=strg[row][col+1];}
				else
				{
					strg[row][col]=0;
					
				}
				continue;
			}
			char ch1 = s1.charAt(row);
		    char ch2 = s2.charAt(col);
			
			
			int ans =0;
			if(ch1==ch2 ||ch2 =='?')
			{ans = strg[row+1][col+1];}
			
			
			else if(ch2=='*')
			{int ans1  = strg[row][col+1];
			int ans2 = strg[row+1][col];
			
			if(ans1==1 || ans2==1)
			{ans =1;}
			else
			{ans=0;}
			
			}
			
			else
			{ans=0;}
			
			
			strg[row][col]=ans;
		
			

			
			
			
			}
		}
	return strg[0][0];}
}
