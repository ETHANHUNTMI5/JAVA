package backtracking;

import java.util.Scanner;

public class CoinChangeCoinRespect {

	public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int target = scn.nextInt();
		 
		int [] arr = {2,3,5,6};
	   CoinRes(arr, 0, target, 0, "");
	 
	}
public static void CoinRes(int [] arr,int vdex,int amount,int current,String ans)
{
	if(current==amount)
	{System.out.println(ans);
	return;}
	
	if(current>amount || vdex==arr.length)
	{return;}
	
   
	
  //yes 
		CoinRes(arr,vdex , amount, current+arr[vdex], ans+arr[vdex]);
	//no
		CoinRes(arr, vdex+1, amount, current, ans);
		
  


}
	
}
