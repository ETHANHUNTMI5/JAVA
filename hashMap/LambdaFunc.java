package hashMap;

import java.util.PriorityQueue;



public class LambdaFunc {

	public static class Pair
	{
		int u;
		int v;
		Pair(int u, int v)
		{this.u=u;
		this.v=v;}
	}
	public static void main(String[] args)
	{
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
			if(a.u==b.u)
			{return b.v-a.v;}
			
			return a.u-b.u;
		});
		
		pq.add(new Pair(3,2));
		pq.add(new Pair(3,4));
		pq.add(new Pair(3,6));
		pq.add(new Pair(2,9));
		System.out.println(pq.peek().u+" "+pq.remove().v);
		System.out.println(pq.peek().u+" "+pq.remove().v);
		System.out.println(pq.peek().u+" "+pq.remove().v);
		System.out.println(pq.peek().u+" "+pq.remove().v);
	
	}
}