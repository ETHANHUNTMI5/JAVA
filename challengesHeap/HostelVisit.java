package challengesHeap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class HostelVisit {

	static class Heap
	{
		ArrayList<Integer> heap = new ArrayList<Integer>();
	
	
	public void add2(int data)
	{
	heap.add(data);
	upheapify(heap.size()-1);
		
	}
	
	public void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		
		if(heap.get(ci)<heap.get(pi))
		{Swap(ci, pi);
		upheapify(pi);}
		
		
	}
	
	public void Swap(int i, int j)
	{
		int ith = heap.get(i);
		int jth = heap.get(j);
		
		heap.set(i, jth);
		heap.set(j, ith);
		
	}
	
	public void remove()
	{
		Swap(0, heap.size()-1);
		heap.remove(heap.size()-1);
		
		downheapify(0);
		
	}
	
	public void downheapify(int pi)
	{
		int lci = 2*pi+1;
		int rci = 2*pi+2;
		
		int mini=pi;
		
		if(heap.get(lci)<heap.get(mini) && lci<heap.size())
		{
			mini = lci;
		}
		if(heap.get(rci)<heap.get(mini) && rci<heap.size())
		{
			mini = rci;
		}
		
		if(mini!=pi)
		{	Swap(mini, pi);
		downheapify(mini);
		}
	}
	}
	public static void main(String[] args) {
		
		

	Heap list = new Heap();
	
	Scanner scn = new Scanner(System.in);
	ArrayList<Integer> l= new ArrayList<Integer>();
	int n = scn.nextInt();
	int k = scn.nextInt();
	
	for(int a=0;a<n;a++)
	{
		int x=scn.nextInt();
		
		if(x==1)
		{
			int y = scn.nextInt();
			int z = scn.nextInt();
			int p = z*z +y*y;
		    l.add(p);
			
			
		}
		else
		{
			Collections.sort(l);
			int m = l.get(k-1);
			System.out.println(m);
			
			
		}
	}
		
	}
	
	}
	

