package sheet;

import java.util.ArrayList;
import java.util.Scanner;

public class KMP {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		
		for(int w=1;w<=n;w++)
		{
			String s = scn.next();
			String p = scn.next();
			scn.nextLine();
			ArrayList<Integer> ll = new ArrayList<Integer>();
			
			for(int a=0;a<s.length();a++)
			{
				boolean z=true;
				for(int b=0;b<p.length();b++)
				{
					if(s.charAt(a)!=p.charAt(b))
					{
						z=false;
						continue;
					}
					
					
					if(z)
					{ll.add(a+1);}
					
					
				}
				}
			
		if(ll.size()==0)
			{System.out.println("Not Found");}
		else
			{
			for(int i:ll)
			{System.out.print(i+" ");}
			
			System.out.println();}}

	System.out.println();}

}
