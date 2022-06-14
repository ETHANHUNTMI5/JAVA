package recursion;

import java.util.Scanner;

public class TowerOfH {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
  toh(n, "SRC", "DEST", "HELP");
	System.out.println(tohcount(n, "SRC", "DEST", "HELP"));
	}
public static void toh(int n,String SRC,String DEST ,String HELP)
{
	
	if(n==0)
	{return;}
	
	toh(n-1,SRC,HELP,DEST);
	System.out.println("move " + n +" th disc from " + SRC + " to " + DEST );
	toh(n-1,HELP,DEST,SRC);
	

}
public static int tohcount(int n,String T1,String T2 ,String T3)
{
	
	if(n==0)
	{return 0;}
	int c=0;
	c=c+tohcount(n-1,T1,T3,T2);
	c++;
	c=c+tohcount(n-1,T3,T2,T1);
	
return c;
}


}
