package dp;

public class UglyNum {

	public static void main(String[] args) {
		int n = 150;
		
		int i2=0,i3=0,i5=0;
		int n2=2;
		int n3=3;
		int n5=5;
				
		int [] arr = new int[n];
		
		arr[0]=1;
		
		for(int a=1;a<n;a++)
		{
			arr[a] = Math.min(n2, Math.min(n3, n5));
			
			if(arr[a]==n2)
			{
				i2++;
				n2 = arr[i2]*2;
			}
			if(arr[a]==n3)
			{
				i3++;
				n3 = arr[i3]*3;
			}
			if(arr[a]==n5)
			{
				i5++;
				n5 = arr[i5]*5;
			}
			System.out.println(arr[a]);
		}
	}

}
