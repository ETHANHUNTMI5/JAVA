package codeFORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class TMT {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=0;a<t;a++)
		{
			int n = scn.nextInt();
			scn.nextLine();
			String s = scn.nextLine();
		
			ArrayList<Integer> list = new ArrayList<Integer>();
			int nm=0; int nt=0;
			for(int c=0;c<s.length();c++)
			{
				if(s.charAt(c)=='M')
				{list.add(c);
				nm++;}
				else
				{nt++;}
				
			}
			
			if(nm!=n/3)
			{
				System.out.println("NO");
				continue;
			}
			
			
			
			
			int p=list.get(0);
			int z=list.get(list.size()-1);
			
			if(p==0 || z==s.length()-1)
			{System.out.println("NO");
			continue;}
			
			
			
			
			
			
		System.out.println("YES");}

	}

}
