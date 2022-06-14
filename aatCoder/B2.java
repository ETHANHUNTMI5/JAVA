package aatCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> ll = new ArrayList<Integer>();
		int[] arr = new int[n];
		for(int a=0;a<n;a++)
		{
		int p = scn.nextInt();
		ll.add(p);
		}
		
		Collections.sort(ll);
	
		int co=0;
		for(int a=0;a<ll.size();a++)
		{
			if(ll.get(a)!=a+1)
			{
				System.out.println("No");
				co++;
				break;
			}
		}
		
		if(co==0)
		{System.out.println("Yes");}
	}
	
	

}
