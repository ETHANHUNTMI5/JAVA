package challenges_Array;
import java.lang.Math;
import java.util.Scanner;

public class KthRoot {
	
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int t = scn.nextInt();
		long x=0;
		for(int a=1;a<=t;a++)
		{
			long n = scn.nextLong();
			int k=  scn.nextInt();
		

			
			 double p=(Math.log10(n)/k);
			x=(long)Math.pow(10, p);
		System.out.println(x);
		}
		
		
	}

}
