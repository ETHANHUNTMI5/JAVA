package challengesStacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceOfTime {

	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 Queue<Integer> call = new LinkedList<Integer>();
		 Queue<Integer> logic = new LinkedList<Integer>();
		 
		 for(int a=1;a<=n;a++)
		 {
			 call.add(scn.nextInt());
		 }
		  
		 for(int a=1;a<=n;a++)
		 {
			 logic.add(scn.nextInt());
		 }
		
		 int answer=0;
		 while(!call.isEmpty())
		 {
			 int get = call.peek();
			 
			 
			 if(logic.peek()==get)
			 {
				 answer=answer+1;
				 logic.remove();
				 call.remove();
			 }
			 
			 else
			 {
				 int getnew = call.peek();
				 call.remove();
				 call.add(getnew);
				 answer++;
			 }
			 
		 }
		 System.out.println(answer);
	}

}
