package sheet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Klist {

	static class Pair 
	{
		int lno;
		int idx;
		int val;
		Pair(int lno, int idx , int val)
		{
			this.lno=lno;
			this.idx= idx;
			this.val= val;
		}
	}
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		ArrayList<Integer> three = new ArrayList<Integer>();
		
		one.add(4);
		one.add(10);		one.add(15);		one.add(24);		one.add(26);
		
		two.add(0);two.add(9);two.add(12);two.add(20);
		
		three.add(5);three.add(18);three.add(22);three.add(30);
		
		nums.add(one);
		nums.add(two);
		nums.add(three);
		 int [] ans = new int[2];
	        
	        int l = nums.size();
	        
	        
	        PriorityQueue<Pair> heap = new PriorityQueue<>(new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {

					return o1.val-o2.val;
				}
			});
	        
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	    
	        for(int a=0;a<l;a++)
	        {
	             int i = nums.get(a).get(0);
	            
	            if(i>max)
	            {
	                max = i;
	            }
	            
	            heap.add(new Pair(a,0,i));
	        }
	        System.out.println(heap);
	        ans[0] = min;
	        ans[1] = max;
	        
	        
	        while(!heap.isEmpty())
	        {
	          Pair get= heap.remove();
	          ans[0] = get.val;

	          int glno = get.lno;
	          int gidx = get.idx;
	          System.out.println("yo "+gidx+" "+glno);
	            
	          if(gidx==nums.get(glno).size()-1)
	          {
                     System.out.println("nikal");
                     System.out.println(ans[0]+" "+ans[1]);
                     return;
	          }
	            
	          ans[1] = Math.max(ans[1],nums.get(glno).get(gidx+1));  
	          heap.add(new Pair(glno,gidx+1,nums.get(glno).get(gidx+1)));
	            
	          
	            
	            
	        }
	        
	        System.out.println(ans[0]+" "+ans[1]);
	        
	        
	        
		
		
		
		
	}

}
