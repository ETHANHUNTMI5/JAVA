package codeFORCES;

import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count =0;
		int p=0,q=0;
		for(int a=0;a<n;a++)
		{int x = scn.nextInt();
		int y = scn.nextInt();
		
		
		if(x!=y)
		{count++;
			break;}
		
		
		
		
		if(a!=0 && x>p)
		{
		
			count=2;
			break;
			}
		
		p=x;
		q=y;
		}

		if(count==1)
		{System.out.println("rated");}
		
		else if(count==2)
		{System.out.println("unrated");}
		
		else
		{System.out.println("maybe");}
	
		
	}

}
