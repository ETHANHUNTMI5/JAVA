package leetCode;

import java.util.ArrayList;

public class Subsets {

	public static ArrayList<Integer> ll = new ArrayList<Integer>();
	public static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		ArrayList<Integer> base = new ArrayList<Integer>();
		ans.add(base);

		kar(arr, 0);
		
		System.out.println(ans);
	}

	public static void kar(int [] arr,int si)
	{
		
		
		if(si==arr.length)
		{
			return;
		}
		
		int num = arr[si];
		
		int k = ans.size();
		
		for(int a=0;a<k;a++)
		{
			ArrayList<Integer> r = new ArrayList<Integer>(ans.get(a));
			
			
			r.add(num);
			ans.add(new ArrayList<Integer>(r));
			r.clear();
		}
 
		kar(arr, si+1);
		
	}
}
		