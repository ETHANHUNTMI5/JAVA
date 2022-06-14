package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CombinationSum {
public static ArrayList<ArrayList<Integer>> con=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		int [] arr = {10,1,2,7,6,1,5};
		int target = 8;
		//kar(arr, 0, "", target,0);
		
		ArrayList<Integer> bans= new ArrayList<Integer>();
		
		
		Arrays.sort(arr);
		soch(arr, target, 0, 0, bans);
		ArrayList<ArrayList<Integer>>fans = new ArrayList<ArrayList<Integer>>();
		fans.add(con.get(0));
		
		for(int a=1;a<con.size();a++)
		{
			if(!fans.contains(con.get(a)))
			{fans.add(con.get(a));}
		}
		
		System.out.println(fans);
		
}
//	public static void kar(int [] arr, int sum,String s,int target,int vi)
//	{
//		if(sum==target)
//		{
//			System.out.println(s);
//			return;
//		}
//		
//		if(sum>target)
//		{return;}
//		
//		for(int a=vi;a<arr.length;a++)
//		{
//			kar(arr, sum+arr[a], s+arr[a],target,a);
//		}
//		
//	}
//	
public static void soch(int [] arr,int target,int sum,int vi,ArrayList<Integer>bans)
{
	if(sum==target)
	{
		con.add(new ArrayList<Integer>(bans));
		
//		{System.out.println(bans);}
			
		return;
	}
	
	if(sum>target)
	{

//		if(bans.size()>=1)
//		{bans.remove(bans.size()-1);}
//		
		return;}
	
	for(int a=vi;a<arr.length;a++)
	{
		bans.add(arr[a]);
		soch(arr, target, sum+arr[a], a+1,bans);
		if(bans.size()>=1)
		{bans.remove(bans.size()-1);}
		
	}
	


}
}

