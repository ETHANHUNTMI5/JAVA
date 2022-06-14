package graphs;

import java.util.ArrayList;
import java.util.HashMap;
	
	public class GHeap<T extends Comparable<T>> {

		ArrayList<T>  data =  new ArrayList<T>();
			HashMap<T, Integer> map= new HashMap<T, Integer>();
			
			public void add(T item)
			{
				data.add(item);
				map.put(item,this.data.size()-1);
				upheapify(data.size()-1);
			
				
			}
			
			private void Swap(int i,int j)
			{
				T ith = data.get(i);
				T jth = data.get(j);
				
				data.set(i, jth);
				data.set(j,ith);
				
				map.put(ith,j);
				map.put(jth,i);
			}
			
			private void upheapify(int ci)
			{
				
				int pi= (ci-1)/2;
				
				if(isLarger(data.get(ci),data.get(pi) )>0)
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
				map.remove(rv);
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
			
	public void updatePrior(T pair)
	{
		int index= map.get(pair);
		upheapify(index);
	}
	
	// if t is having higher priority return +ve value
	public int isLarger(T t ,T o)
	{
		return t.compareTo(o);
		
	}
	}


