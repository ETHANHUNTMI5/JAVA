package textProcessing;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {

ArrayList<T>  data =  new ArrayList<T>();
	
	
	public void add(T item)
	{
		data.add(item);
		upheapify(data.size()-1);
	
		
	}
	
	private void Swap(int i,int j)
	{
		T ith = data.get(i);
		T jth = data.get(j);
		
		data.set(i, jth);
		data.set(j,ith);
	}
	
	private void upheapify(int ci)
	{
		
		int pi= (ci-1)/2;
		
		if(data.get(pi).compareTo(data.get(ci))>0)
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

	public T remove()
	{
		Swap(0, this.data.size()-1);
		T rv=this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
	}
	private void downheapify(int pi)
	{
		int lci= 2*pi+1;
		int rci= 2*pi+2;
		
		int mini= pi;
		
		if(lci<data.size() && data.get(lci).compareTo(data.get(mini))<0)
		{
			mini= lci;
		}
		
		if(rci<this.data.size() && data.get(rci).compareTo(data.get(mini))<0)
		{
			mini= rci;
		}
		
		if(mini!=pi)
		{Swap(pi, mini);
		downheapify(mini);}
		
	}
	public T get()
	{
		return this.data.get(0);
	}
	
}


