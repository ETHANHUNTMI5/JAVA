package sheet;

public class KthPerm {

	public static void main(String[] args) {
		int n= 5;
		int k= 2; // this is 0 indexed rank
		StringBuilder sb = new StringBuilder();
		for(int a=1;a<=n;a++)
		{
			sb.append(a+"");
		}
		String s = sb.toString();
		char[] arr = s.toCharArray();
		kar(arr,n, k, "", new boolean[n]);
	}
	public static void kar(char [] arr,int n ,int k,String ans,boolean [] vis)
	{
		if(n==1)
		{
			
		for(int a=0;a<arr.length;a++)
			{
				if(vis[a]==false)
				{ans+=arr[a];}
			}
			
			System.out.println(ans);
		return;	
		}
		
		
		int f =fact(n-1);
		
		int val = k/f;
		int rem = k-(val)*f;
		
		
		int y=0;
		

		y = -1;
		int idx = 0;
		
		
		for(int a=0;a<vis.length;a++)
		{
			
			if(vis[a] == false)
				y += 1;
			
			if(y==val)
				{
				idx = a;
				break;}
		}
		y = idx;
		char c = arr[y];
		
		vis[y]=true;
		kar(arr,n-1, rem, ans+c, vis);
//		vis[y]=false;
		
		
		
	}
	
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		int ans=1;
		for(int a=1;a<=n;a++)
		{ans*=a;}
	
	return ans;}

}
