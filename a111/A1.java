package a111;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class A1 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] a = new int[n];
        int x = scn.nextInt(); // x max
        int y = scn.nextInt(); // y min
        TreeSet<Integer> setx = new TreeSet<>();
        TreeSet<Integer> sety = new TreeSet<>();
        TreeSet<Integer> setout = new TreeSet<>();
        for(int i=0;i<n;i++) {
            a[i] = scn.nextInt();
            if(a[i] == x) setx.add(i);
            if(a[i] == y) sety.add(i);
            if(a[i] > x || a[i] < y) setout.add(i);
        }
        	
     
        
        long res =0;
        for(int i=0; i<n; i++) {
            var a1 = setx.ceiling(i);
            var a2 = sety.ceiling(i);
            var a3 = setout.ceiling(i);
            if(a1 != null && a2!=null) {
                if(a3 == null) a3 = n;
                int bound = Math.max((int)a1, (int)a2);
                if(bound < (int)a3) {
                    res += (long)((long)a3 - bound);
                }
            }
       }
        System.out.println(res);
	}
}