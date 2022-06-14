package leetCode;

import java.util.ArrayList;

public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> ll;
	public static void main(String[] args) {
	
		ll = new ArrayList<ArrayList<Long>>();
		
		//kar(0, 5);
		System.out.println(ll);
			 
		System.out.println(combi(14, 1));
	}
public static void kar(long i ,long n)
{

	if(i==n)
	{
		return;
	}
	ArrayList<Long> bc = new ArrayList<Long>();
	
	for(long a=0;a<=i;a++)
	{
		bc.add((long) combi(i, a));
	}

	
    ll.add(new ArrayList<Long>(bc));
    
    bc.clear();

    kar(i+1, n);
}
public static long combi(long n , long r)
{
	long num = fact(n);
	long den = fact(n-r)*fact(r);
	
	System.out.println(num + " "+den);
	
	return num/den;

}
public static long fact(long n )
{
	
if(n==0 || n==1)
{
	return 1;}
	
long fnm1 = fact(n-1);
return fnm1*n;
}
}
