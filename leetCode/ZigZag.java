package leetCode;

import java.util.ArrayList;

public class ZigZag {

	public static void main(String[] args) {
		String s = "A";
		int n =3;
		
		for(int a=0;a<n;a++)
		{
			if(a>=s.length())
			{break;}
			
			ArrayList<Character> ll = new ArrayList<Character>();
			if(a==0)
			{
				int b=0;
				int c=1;
				while(b<s.length())
				{
					ll.add(s.charAt(b));
				
				b=2*(n-1)*c;
				c++;}

				for(char c1 : ll)
				{System.out.print(c1);}
				
			}
			
			else if(a==n-1)
			{
				
				int b=0;
				int c=1;
				while(b+a<s.length())
				{
					ll.add(s.charAt(b+a));
				
				b=2*(n-1)*c;
				c++;}

			
				for(char c1 : ll)
				{System.out.print(c1);}
			}
			else
			{
				int m1=(n-1)*2-2*a;
				int m2=(n-1)*2-m1;
				
				int b=a;
				ll.add(s.charAt(b));
				int t=0;
				while(b<s.length())
				{
					if(t%2==0)
					{
						b=b+(m1);
					
					}
					
					
					else
					{
						b=b+(m2);
					}
					
					t++;
					if(b<s.length())
					{ll.add(s.charAt(b));}
					
				}
				
				for(char c1 : ll)
				{System.out.print(c1);}
				
			}
		}
		

	}

}
