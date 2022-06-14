package sheet;

public class Max_cons_1 {

	public static void main(String[] args) {
	
		int [] arr ={0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
		
		int n = arr.length;
		
		
		int [] one = new int[n];
		int [] two = new int[n];
		
		if(arr[0]==1)
		{one[0]=1;
		two[0]=1;}
		
		
		for(int a=1;a<n;a++)
		{
			if(arr[a]==1)
			{
				one[a]=one[a-1]+1;
			}
			two[a]=Math.max(one[a],two[a-1]);
			
		
		}
		for(int i : one)
		{System.out.print(i+" ");}
		System.out.println();
		for(int i : two)
		{System.out.print(i+" ");}
	
		System.out.println();
		System.out.println(two[n-1]);
	}

}
