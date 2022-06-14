package sheet;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Potions {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		
		long [] arr = new long[(int) n];
		
		for(long a=0;a<n;a++)
		{
			arr[(int) a] = scn.nextInt();
		}
		
		PriorityQueue<Long> heap = new PriorityQueue<>();
		long sum=0;
		for(long a=0;a<n;a++)
		{
			sum+=arr[(int) a];
			heap.add(arr[(int) a]);
			
			while(sum<0)
			{
				sum-=heap.poll();
			}
		}
		System.out.println(heap.size());
	}
}