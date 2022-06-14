package challenges_Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumItUp2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int a = 0; a < arr.length; a++) {
			arr[a] = scn.nextInt();

		}

		bubble(arr);

		ArrayList<String> ans = new ArrayList<>();
		int target = scn.nextInt();
		Combi(arr, target, 0, 0, ans, "");
		System.out.println(ans);

		System.out.println(ans.get(0));

		for (int a = 1; a < ans.size(); a++) {
            
			 boolean te=tell(ans, a);
			 
			 if(te==true)
			 {System.out.println(ans.get(a));}
			 
		}

	}

	public static void bubble(int[] arr) {
		for (int a = 0; a < arr.length - 1; a++)

			for (int j = 0; j < arr.length - 1 - a; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

	}

	public static void Combi(int[] arr, int amount, int lastindex, int present, ArrayList<String> ans, String answer) {
		if (amount == present) {
			ans.add(answer);
			return;
		}

		if (present > amount) {
			return;
		}

		for (int i = lastindex; i < arr.length; i++) {

			Combi(arr, amount, i + 1, present + arr[i], ans, answer + arr[i] + " ");

		}

	}

	public static boolean tell(ArrayList<String> ans,int ind) {

		String s = ans.get(ind);
		for(int b=1;b<ind;b++)
		{
			if(ans.get(b).equals(s))
			{return false;}
		}
		
		 
	return true;}

}