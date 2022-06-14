package queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntinK {

	public static void main(String[] args) {
		
		
		int [] arr = {12,-1,-7,8,-15,30,16,28};
		int k =3;
		Deque<Integer> q = new LinkedList<Integer>();
		
		int a=0;
		for(;a<k;a++)
		{
			if(arr[a]<0)
			{q.addLast(a);}
		}
		
		if(q.isEmpty())
		{System.out.print("0 ");}
		else
		{
			System.out.print(arr[q.peek()]+" ");
		}
		
		
		while(a<arr.length)
		{
			if(a>=k)
			{
				if(q.peek()<=a-k)
				{q.removeFirst();}
				
				if(arr[a]<0)
				{q.addLast(a);}
				
				if(q.isEmpty())
				{System.out.print("0 ");}
				else
				{
					System.out.print(arr[q.peek()]+" ");
				}
			
				
				
			}
			
		a++;}
	}
//op
}
