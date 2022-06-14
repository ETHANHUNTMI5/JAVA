package challengesHashAndTries;

import java.util.ArrayList;
import java.util.Scanner;

public class RANGEXOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		while (t-- != 0) {
		int qt = sc.nextInt();
		if (qt == 0) {
		int aa = sc.nextInt();
		ans.add(aa);
		} else if (qt == 1) {
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int an = 1;
		int ii = -1;
		for (int i = l - 1; i < r; i++) {
		if (an < (x ^ ans.get(i))) {
		ii = ans.get(i);
		}
		}
		System.out.println(ii);

		}
		}
		}

		}
