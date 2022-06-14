package a111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class H1 {
public static class Pair
{
long h;
long w;
Pair(long h,long w)
{
	this.h = h;
	this.w =w;}
}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long m = scn.nextLong();
		PriorityQueue<Pair> heap = new PriorityQueue<>((a,b)->{
			if(a.h==b.h)return (int) (b.w-a.w);
			return (int) (b.h-a.h);
		});
		long [][] arr = new long[(int) n][2];
		
		for(int a=0;a<n;a++)
		{
			arr[a][0] = scn.nextLong();
			
		}
		for(int a=0;a<n;a++)
		{
			arr[a][1] = scn.nextLong();
			
		}
		ArrayList<Pair> ll = new ArrayList<>();
		
		for(long a=0;a<m;a++)
		{
			long x = scn.nextLong();
			ll.add(new Pair(x,-1));
		}
		
		for(int a=0;a<m;a++)
		{
			long x = scn.nextLong();
			ll.get(a).w=x;
			heap.add(ll.get(a));
		}
		
		Arrays.sort(arr,(a,b)->{
			return (int) (b[1]*b[0]-a[1]*a[0]);
		});
		
		for(int a=0;a<n;a++)
		{
			System.out.println(arr[a][0]+" "+arr[a][1]);
		}
		
		boolean b = true;
		for(int a=0;a<=n-1;a++)
		{
			long gx = arr[a][0];
			long gy = arr[a][1];
			
			
			if(heap.isEmpty())
			{b= false;
			System.out.println("No");
			break;}
			
			Pair get = heap.remove();
			
			long yox = get.h;
			long yoy = get.w;
			System.out.println(a+" "+yox+" "+yoy);
			while(!heap.isEmpty() && yox<gx && yoy<gy)
			{
				get = heap.remove();
				yox = get.h;
				yoy = get.w;
			}
			
			if(yox>=gx && yoy>=gy)continue;
			
			if(heap.isEmpty())
			{b= false;
			System.out.println("No");}
		}
		
		if(b)
		{System.out.println("Yes");}
		
	}
}