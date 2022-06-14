package recursionChallenges;

public class ToWER {

	public static void main(String[] args) {

		int n =TOHcount(2, "src", "help","des");

		System.out.println(n);
	}

	public static void TOH(int n ,String src,String help,String des)
	{
		if(n==0)
		{return;}
		
		TOH(n-1,src,des,help);
		System.out.println("Move "+n+" th disc from "+src+" to " + des);
		TOH(n-1,help,src,des);
		
		
		
	}
	
	public static int TOHcount(int n ,String src,String help,String des)
	{
		if(n==0)
		{return 1;}
		int count=0;
		count =count+TOHcount(n-1,src,des,help);
		//System.out.println("Move "+n+" th disc from "+src+" to " + des);
		count =count+TOHcount(n-1,help,src,des);
		
		
		return count;
	}
	
}
