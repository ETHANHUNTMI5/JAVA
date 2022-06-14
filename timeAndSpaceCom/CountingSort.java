package timeAndSpaceCom;

public class CountingSort {

	public static void main(String[] args) {
		int [] arr = {1, 4, 1, 2, 7, 5, 2};
        // min = 0 and max = 9(say)
		
		int [] count = new int[10];
		int n = arr.length;
		
		for(int a=0;a<n;a++)
		{
			count[arr[a]]++;
		}
		
		for(int a=1;a<10;a++)
		{
			count[a]+=count[a-1];
		}
		
		for(int i: count)
		{System.out.print(i+" ");}
	
		int [] ans = new int[n];
		for(int a=n-1;a>=0;a--)
		{
			int g = arr[a];
			ans[count[g-1]]=g;
			count[g-1]=count[g-1]+1;
		}
		System.out.println();
		for(int i: ans)
		{System.out.print(i+" ");}
	}

}
