package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Subsets2 {

public static ArrayList<ArrayList<Integer>> fans= new ArrayList<ArrayList<Integer>>();
public static Set<ArrayList<Integer>> kkp = new HashSet<ArrayList<Integer>>();
public static void main(String[] args) {

		int [] arr = {4,4,4,1,4};
		ArrayList<Integer> base = new ArrayList<Integer>();
		fans.add(base);
		
		kar(arr, 0);
		System.out.println(fans);
		
		for(int a=0;a<fans.size();a++)
		{
			kkp.add(fans.get(a));
		}
		
		ArrayList<ArrayList<Integer>> sub = new ArrayList<ArrayList<Integer>>(kkp);
		System.out.println(sub);
		}

public static void kar(int [] arr ,int vi)
{
	if(vi==arr.length)
	{
		return;
	}
	

  int k = fans.size();

  int get = arr[vi];
  
  for(int i=0;i<k;i++)
  {
	  ArrayList<Integer> r = new ArrayList<Integer>(fans.get(i));
	  
	  ArrayList<Integer> kk = new ArrayList<Integer>(r);
	  kk.add(get);
	  ArrayList<Integer> bc = new ArrayList<Integer>(kk);
	  Collections.sort(bc);
	  fans.add(new ArrayList<Integer>(bc));
	  
	  
  }
  kar(arr, vi+1);
  
}
}
