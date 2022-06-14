package linkedListChallenges;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class CircularLL {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(n!=-1)
		{
			if(map.containsKey(n))
			{break;}
			
			
			ll.add(n);
			map.put(n,1);
			n = scn.nextInt();
		}
		for(int i : ll)
		{System.out.print(i+" ");}
	
	}

}
