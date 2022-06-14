package codeFORCES;

import java.util.Scanner;

public class Petya {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		int n = s1.length();
		
		for(int a=0;a<n;a++)
		{
          char ch1= s1.charAt(a);
          char ch2 = s2.charAt(a);
		
          int x1=ch1;
          int x2 =ch2;
          
         if(x1>=65 && x1<=90)
         {
        	 x1=x1+32;
        	 ch1=(char)x1;
         }
         if(x2>=65 && x2<=90)
         {
        	 x2=x2+32;
        	 ch2=(char)x2;
         }
          
         s1 = s1.substring(0,a)+ch1+s1.substring(a+1);
         s2 = s2.substring(0,a)+ch2+s2.substring(a+1); 
		}
		
		int ans= s1.compareTo(s2);
		
		if(ans==0)
		{System.out.println(ans);}
		else if(ans<0)
		{
			System.out.println("-1");
		}
		else
		{System.out.println("1");}
		
	}
	}

