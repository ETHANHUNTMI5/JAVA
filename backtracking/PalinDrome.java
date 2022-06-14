package backtracking;

import java.util.ArrayList;

public class PalinDrome {
	public static ArrayList<String> ans = new ArrayList<>();
	public static void main(String[] args) {
		String s = "nitin";
		
		palin(s,"");
		System.out.println(ans);
	}
	public static void palin(String s,String psf)
	{	
		int n = s.length();
		
		if(n==0)
		{
		ans.add(psf.trim());
		return;}
		for(int a=1;a<=n;a++)
		{
			String sp = s.substring(0,a);
			
			if(isPalin(sp))
			{
				if(a==n)
				{palin("",psf+" "+sp);}
				else
				{palin(s.substring(a),psf+" "+sp);}
			
			}
			
		}
		
	}
	
	public static boolean isPalin(String s)
	{
		if(s.length()==0 || s.length()==1)return true;
		
		int l = 0;
		int r = s.length()-1;
		
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))return false;
			r--;
			l++;
			
		}
	return true;}

}
