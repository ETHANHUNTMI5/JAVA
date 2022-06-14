package heap;

import java.util.ArrayList;

public class Heap {
	
	ArrayList<Integer>  data =  new ArrayList<Integer>();
	
	
	public void add(int item)
	{
		data.add(item);
		upheapify(data.size()-1);
	
		
	}
	
	private void Swap(int i,int j)
	{
		int ith = data.get(i);
		int jth = data.get(j);
		
		data.set(i, jth);
		data.set(j,ith);
	}
	
	private void upheapify(int ci)
	{
		
		int pi= (ci-1)/2;
		
		if(data.get(pi)>data.get(ci))
		{Swap(ci, pi);
		upheapify(pi);}
	}
	
	public int size()
	{
		return this.data.size();
	}
	
	public boolean isEmpty()
	{
		return this.size()==0;
	}

	public void display() {
		System.out.println(data);
	}

	public int remove()
	{
		Swap(0, this.data.size()-1);
		int rv=this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
	}
	private void downheapify(int pi)
	{
		int lci= 2*pi+1;
		int rci= 2*pi+2;
		
		int mini= pi;
		
		if(lci<data.size() && data.get(lci)<data.get(mini))
		{
			mini= lci;
		}
		
		if(rci<this.data.size() && data.get(rci)<data.get(mini))
		{
			mini= rci;
		}
		
		if(mini!=pi)
		{Swap(pi, mini);
		downheapify(mini);}
		
	}
	public int get()
	{
		return this.data.get(0);
	}
}

