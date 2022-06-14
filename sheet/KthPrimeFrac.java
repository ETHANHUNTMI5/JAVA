package sheet;

import java.util.PriorityQueue;

public class KthPrimeFrac {

	static class Node
	{
		int si;
		int ei;
		double val;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,4,5,7};
		int k =1;
		int n = arr.length;
		double [] arr2 = new double[n];
		PriorityQueue<Node> heap = new PriorityQueue<>((a,b)->Double.compare(a.val, b.val));
		
		
		for(int a=0;a<n;a++)
		{
			arr2[a] = (double)arr[a]/arr[n-1];
			Node nn = new Node();
			nn.si=a;
			nn.ei=n-1;
			nn.val=arr2[a];
			heap.add(nn);
		}
		
		for(double d: arr2)
		{System.out.print(d+" ");}
		System.out.println();
		
		while(k!=1)
		{
			Node gn = heap.remove();
			Node nn = new Node();
			if(gn.ei!=0)
			{
				if(Double.compare((double)arr[gn.si]/arr[gn.ei-1],(double)arr[gn.si+1]/arr[gn.ei])>0)
				{
					 nn.si = gn.si+1;
					 nn.ei = gn.ei;
					 nn.val = (double)arr[nn.si]/arr[nn.ei];
					   
				}
				if(Double.compare((double)arr[gn.si+1]/arr[gn.ei],(double)arr[gn.si]/arr[gn.ei-1])>0)
				{
					 nn.si = gn.si;
					 nn.ei = gn.ei-1;
					 nn.val = (double)arr[nn.si]/arr[nn.ei];
					   
				}
				
		   
			}
			
			else
			{
				 nn.si = gn.si+1;
				 nn.ei = gn.ei;
				 nn.val = (double)arr[nn.si]/arr[nn.ei];
				
			}
			
			heap.add(nn);
		k--;}
		
		
		Node ans = heap.remove();
		System.out.println(arr[ans.si]+" "+arr[ans.ei]);
		
	}

}
