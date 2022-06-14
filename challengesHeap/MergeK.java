package challengesHeap;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeK {
	  ArrayList<Integer> data = new ArrayList<Integer>();

	
	  public void Add(int data)
	  {
		  this.data.add(data);
		  Upheapify(this.data.size()-1);
		  
	  }

	  private void Upheapify(int ci)
	  {
		  int pi = (ci-1)/2;
		  
		  if(this.data.get(pi)>this.data.get(ci))
		  {
			  Swap(pi, ci);
			  Upheapify(pi);
		  }
	  }
	  
	  private void Swap(int i , int j)
	  {
		  int ith= this.data.get(i);
		  int jth = this.data.get(j);
		  
		  
		  this.data.set(i, jth);
		  this.data.set(j, ith);
	  
	  }
	  
	  public int remove()
	  {
		  Swap(0, this.data.size()-1);
		  int rv = this.data.remove(this.data.size()-1);
		  downheapify(0);
		  return rv;
		  
	  }
	  
	private void downheapify(int pi) {
		
		int lci = 2*pi+1;
		int rci = 2*pi+2;
		
		int mini = pi;
		
		if(lci<this.data.size() &&this.data.get(lci)<this.data.get(mini))
		{
			mini= lci;
		}
		if(rci<this.data.size() &&this.data.get(rci)<this.data.get(mini))
		{
			mini= rci;
		}
		
		if(pi!=mini)
		{
			Swap(pi, mini);
			downheapify(mini);
		}
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    int k = scn.nextInt();
	    int n = scn.nextInt();
	    
	    int [] arr = new int[k*n];
	    MergeK heap = new MergeK();
	    
	    for(int a=0;a<arr.length;a++)
	    {arr[a]=scn.nextInt();
	     heap.Add(arr[a]);
	    }
	    int [] ans = new int[k*n];
   
	    for(int a=0;a<ans.length;a++)
	    {
	    	ans[a]= heap.remove(); 
	    }
	
	    for(int i : ans)
	    {System.out.print(i +" ");}
	}

}
