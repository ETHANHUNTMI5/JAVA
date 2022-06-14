package codeFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class Polyhedrons {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		
		map.put("Tetrahedron",4);
		map.put("Octahedron",8);
		map.put("Cube",6);
		map.put("Dodecahedron",12);
		map.put("Icosahedron",20);
		int ans=0;
		for(int a=1;a<=n;a++)
		{
			String s = scn.nextLine();
		  ans = ans +map.get(s);
		}

		System.out.println(ans);
	}

}
