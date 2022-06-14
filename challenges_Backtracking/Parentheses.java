package challenges_Backtracking;

import java.util.Scanner;

public class Parentheses {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		paren(n, "",0,0);
		
	}
	public static void paren(int m,String ans,int ob,int cb)
	{
		if(ob>m || cb>m )
		{return;}
		
		if(cb>ob)
		{return;}
		
			
		if(ans.length()==2*m)
		{System.out.println(ans);
		return;}
		                                                                 
		
		paren(m, ans+")",ob,cb+1);
		paren(m, ans+"(",ob+1,cb);
		
		
		
	}

}
