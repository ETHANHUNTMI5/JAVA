package sheet;

public class PossiblePaths {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int n = arr.length;
		int m = arr[0].length;

		kar(arr, 0, 0, n, m, arr[0][0]+"");
	}
	
	public static void kar(int [][] arr, int i , int j,int n , int m , String psf)
	{
		if(i==n-1 && j==m-1)
		{System.out.println(psf);
		return;}
		
		
		if(i+1<n)
		{
			kar(arr, i+1, j, n, m, psf+arr[i+1][j]);
		}
		
		if(j+1<m)
		{
			kar(arr, i, j+1, n, m, psf+arr[i][j+1]);
		}
		
	}

}
