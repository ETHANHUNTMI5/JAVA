package sheet;

public class MaxProduct {

	public static void main(String[] args) {
	
		int [] arr = {-2};
		
		int n = arr.length;
		
		int m1 =arr[0];
		int m2 = arr[0];
		int m3 = arr[0];
		System.out.println(m1+" "+m2+" "+m3);
		int gmax=m2;
		for(int a=1;a<n;a++)
		{

			m3=arr[a];
			
			
			int m4 = m1;
			m1 = Math.min(arr[a]*m1, Math.min(arr[a]*m2, m3));
			m2 = Math.max(arr[a]*m4,Math.max(arr[a]*m2, m3));
			System.out.println(m1+" "+m2+" "+m3);
			if(m2>gmax)
			{gmax=m2;}
			if(m3==0)
			{
				m1=1;
				m2=1;
				continue;
			}
			
		}
		
		System.out.println(gmax);
		
	}

}
