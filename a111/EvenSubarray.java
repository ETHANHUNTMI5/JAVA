package a111;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class EvenSubarray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			LinkedList<Integer> ll = new LinkedList<>();
			for(int a=0;a<n;a++)
			{ll.addFirst(scn.nextInt());}
		     
			int x = 1;
			int ele = ll.get(0);
			ll.addFirst(ele);
			int ans=0;
			while(x<n)
			{
				if(ll.get(x+1)==ele)
				{x++;
				continue;}
				ans++;
				x=x*2;
			}
			System.out.println(ans);
		}

	}

}
