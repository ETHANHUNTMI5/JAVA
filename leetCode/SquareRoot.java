package leetCode;

public class SquareRoot {

	public static void main(String[] args) {

		int [] arr = new int[45];
		
		arr[0]=1;
		arr[1]=2;
		
		for(int a=2;a<=44;a++)
		{
			arr[a]=arr[a-1]+arr[a-2];
		}
	
		
	}
}

		