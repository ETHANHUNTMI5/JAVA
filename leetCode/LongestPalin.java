package leetCode;

public class LongestPalin {

	public static void main(String[] args) {
	
		String s = "ac";
 
		
		int max=1;
		String ans = "";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
			boolean b = isPal(s, i, j);
			if(b)
			{ 
				
				if(j-i+1>=max)
				{max= j-i+1;
				ans = s.substring(i,j+1);}
			}
				
			}

					
		}
		
	
		System.out.println(ans);
		
	}
	public static boolean isPal(String s , int si,int ei)
	{
	
		if(si>=ei)
		{return true;}
		
		if(s.charAt(si)!=s.charAt(ei))
		{
			return false;
		}
		
		return isPal(s, si+1, ei-1);
		
	}

}
