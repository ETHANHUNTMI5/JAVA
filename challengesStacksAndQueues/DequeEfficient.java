package challengesStacksAndQueues;

import java.util.LinkedList;
import java.util.Scanner;

public class DequeEfficient {

	
	public static void main(String[] args) {
	
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 LinkedList<Integer> q = new LinkedList<Integer>();
		 
		 
		 for(int i =0;i<n;i++)
		 {q.addFirst(i);}
		 
		 
		 while(!q.isEmpty())
		 {
			 System.out.print(q.removeLast()+" ");
			 
			 
			 
		 }
	}

}
