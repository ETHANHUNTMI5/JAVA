package codeFORCES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RoundHouse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a= scn.nextInt();
		int b= scn.nextInt();
		
	
		int ans =0;
		
		int x=0;
		
		if(b>=0)
		{
			ans = (a+b%n)%n;	
		}
		if(b<0)
		{
			b=(b*-1);
			ans = (a-b%n);
			
			if(ans<0)
			{ans=(n+ans)%n;}
			else
			{ans =ans%n;}
			
			if(ans<0)
			{ans=ans*-1;}
			
		}
		if(ans==0)
		{ans=n;}
		System.out.println(ans);
		ArrayList<Integer> ll = new ArrayList<Integer>();
		Collections.sort(ll);
	}

}
