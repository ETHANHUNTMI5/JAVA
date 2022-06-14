package sheet;

public class LongestRoute {

	public static int ans=0;
	public static void main(String[] args) {
		
		int [][] arr = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                         { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
                         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		int n = arr.length;
		int m = arr[0].length;
		 
		helper(arr, 0,0,1,7,0,new boolean [n][m]);
		System.out.println(ans);

	}
	public static void helper(int [][] arr, int xi, int xj, int yi, int yj,int k,boolean [][] vis) {
		
		if(xi<0 || xi>=arr.length || xj<0 || xj>=arr[0].length || arr[xi][xj]==0 || vis[xi][xj])
		{return;}
		
		if(xi==yi && xj==yj)
		{
			ans = Math.max(ans, k);
			return;
		}
		
		
		
		
		
		
		vis[xi][xj]=true;
		
		helper(arr, xi, xj+1, yi, yj, k+1, vis);
		
		helper(arr, xi+1, xj, yi, yj, k+1, vis);
		
		helper(arr, xi, xj-1, yi, yj, k+1, vis);
		
		helper(arr, xi-1, xj, yi, yj, k+1, vis);
		
		vis[xi][xj]=false;
		k--;
		
		
	}
	

}
