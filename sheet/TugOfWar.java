package sheet;

import java.util.ArrayList;

public class TugOfWar {

	public static void main(String[] args) {
		
		int [] arr = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
		int sum =0;
		int n = arr.length;
		for(int a=0;a<n;a++)
		{sum+=arr[a];}
		
		//System.out.println(sum);
		
		helper(arr, n, 0, 0, 0,"",sum);
		
		System.out.println(fans);
		System.out.println(sub);
	}
	
	public static ArrayList<Integer> ll = new ArrayList<>();
	public static ArrayList<Integer> sub = new ArrayList<>();
	public static int ans = Integer.MAX_VALUE;
	public static int fans=0;
	public static void helper(int [] arr, int n , int sum,int i,int j,String psf,int fsum)
	{
		if(j==n/2)
		{
		
		if(Math.abs(fsum/2-sum)<ans)
		{ans = Math.abs(fsum/2-sum);
			fans=sum;
		sub = new ArrayList<Integer>(ll);}
		return;}
		
		if(i==n)
		{return;}
		
		
		helper(arr, n, sum, i+1, j,psf,fsum);
		ll.add(arr[i]);
		helper(arr, n, sum+arr[i], i+1, j+1,psf+" "+arr[j],fsum);
		ll.remove(ll.size()-1);
	
		
	}

}
