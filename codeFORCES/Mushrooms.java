package codeFORCES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Mushrooms {

	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t1 = scn.nextInt();
		int t2 = scn.nextInt();
		int k = scn.nextInt();
		
	HashMap<Integer,  int []> map = new HashMap<Integer, int[]>();
	HashMap<Integer, Double> ans = new HashMap<Integer, Double>();
	for(int a=1;a<=n;a++)
	{
		int [] sb = new int [2];
		map.put(1,sb);
		int u =scn.nextInt();
		int v= scn.nextInt();
		sb[0]=u;
		sb[1]=v;
		
		int c1= u*t1;
		double d1 = (double)c1*(100-k)/100;
		double a1 =(double)d1 + v*t2;
		
		int c2= v*t1;
		double d2 = (double)c2*(100-k)/100;
		double a2 = (double)d2 + u*t2;
		
		// comapre a1 and a2
		if(a1>a2)
		{
			ans.put(a,a1);
		}
		else
		{
			ans.put(a,a2);
		}
		
	}
		
	ArrayList<Map.Entry<Integer, Double>> fans = new ArrayList<Map.Entry<Integer,Double>>(ans.entrySet());
	
	Collections.sort(fans,new Comparator<Map.Entry<Integer, Double>>() {

		@Override
		public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
			
			double dd = o2.getValue()-o1.getValue();
			
			if(dd>0)
			{return 1;}
			
			else if(dd<0)
			{return -1;}
			
			else
			{
				return o1.getKey()-o2.getKey();
			}
				
			
		}
	});
	
	for(Map.Entry<Integer, Double> keys :fans)
	{
		System.out.println(keys.getKey()+" "+String.format("%.2f", keys.getValue()));
	}
	}

}
