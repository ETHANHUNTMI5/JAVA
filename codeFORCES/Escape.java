package codeFORCES;

import java.util.Scanner;

public class Escape {

	public static void main(String[] args) {
	   
		Scanner scn = new Scanner(System.in);
		double pSpeed = scn.nextDouble();
		double dSpeed = scn.nextDouble();
		double t = scn.nextDouble();
		double f = scn.nextDouble();
		double c = scn.nextDouble();
		
		double distance = t*pSpeed;
		int count = 0 ;
		if(dSpeed<=pSpeed){
		    System.out.println("0");return;
		}
		while(distance<c){
		    double met = distance/(dSpeed - pSpeed);
		    distance += met*pSpeed;
		    if(distance>=c){
		       break;
		    }
		    count++;
		    double tt=distance/dSpeed + f;
		    distance +=tt*pSpeed;
		    System.out.println(distance);
		}
		System.out.println(count);
	}
}