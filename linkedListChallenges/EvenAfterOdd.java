package linkedListChallenges;

import java.util.LinkedList;
import java.util.Scanner;

public class EvenAfterOdd {

	public static void main(String[] args) {
 
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner scn = new Scanner(System.in);
 
		int n = scn.nextInt();
		
		for(int a=1;a<=n;a++)
		{
			ll.addLast(scn.nextInt());
		}
		
		LinkedList<Integer> even = new LinkedList<Integer>();
		
		while(!ll.isEmpty())
		{
			int t = ll.removeFirst();
			
			if(t%2!=0)
			{System.out.print(t+" ");}
			else
			{even.addLast(t);}
			
			
			
		}
		
		while(!even.isEmpty())
		{
			System.out.print(even.removeFirst()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
