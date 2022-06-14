package leetCode;

import java.util.ArrayList;

public class Phone {

	public static void main(String[] args) {

		String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		String s ="23";
		int num = Integer.parseInt(s);
		if(s.length()==0)
		{System.out.println("0");}
		else
		{
		int m = num;
		int b = 0;
		ArrayList<Integer> ll = new ArrayList<Integer>();
		
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;

			num = num / 10;
		}

		while (rev != 0) {
			b = rev % 10;
			ll.add(b);

			rev = rev / 10;
		}
		

		System.out.println(kar(arr, 0, ll));
		}
	}

	public static ArrayList<String> kar(String[] arr, int vi,ArrayList<Integer>arr2) {
		if (vi == arr2.size()- 1) {
			ArrayList<String> bl = new ArrayList<String>();

			for (int a = 0; a < arr[arr2.get(vi)].length(); a++) {
				bl.add(arr[arr2.get(vi)].charAt(a) + "");
			}
			
           return bl;
		}

		ArrayList<String> rr = kar(arr, vi + 1,arr2);

		ArrayList<String> mr = new ArrayList<String>();

		for (int a = 0; a < rr.size(); a++) {
			String ss = arr[arr2.get(vi)];
			
			for(int b=0;b<ss.length();b++)
			{
				mr.add(ss.charAt(b)+rr.get(a));
			}
			
		}

	return mr;}
}
