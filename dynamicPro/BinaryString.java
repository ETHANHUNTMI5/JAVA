package dynamicPro;

public class BinaryString {

	public static void main(String[] args) {
      
		int n = 90;
		
		int[] ones = new int[n];
		int[] zeroes = new int[n];
		
		
		//binary strings of length n with no consecutive 1
		
		ones[0]=1;//ending with 1
		zeroes[0]=1;// ending with 0
		
		for(int i=1;i<n;i++)
		{
			ones[i]=zeroes[i-1];
			zeroes[i]=zeroes[i-1]+ones[i-1];
			
		}

		System.out.println(ones[n-1]+zeroes[n-1]);
		
		
	}

}
