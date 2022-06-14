package challenges_DP;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMoney {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int[] val = new int[sum]; 
		for(int i =0;i<sum;i++) { 
		val[i]= sc.nextInt();
		}

			System.out.println(minMoneyNeeded(val, n, sum));

		}

		public static int minMoneyNeeded(int[] price, int n , int sum) {
			
			ArrayList<Integer> val = new ArrayList<>();
			ArrayList<Integer> wt = new ArrayList<>();
			
			int size =0;
			for (int i = 0; i < sum; i++) 
		    { 
		        if (price[i] != -1) 
		        { 
		            val.add(price[i]); 
		            wt.add(i + 1); 
		            size++; 
		        } 
		    } 
			n = size;
			int[][] dp = new int[n+1][sum+1];
			for(int i =1;i<=sum;i++) {
				dp[0][i]=Integer.MAX_VALUE;
			}
			
			for(int i =1;i<=n;i++) {
				dp[i][0]=0;
			}
			
			
			for(int i =1;i<=n;i++) {
				for(int j = 1 ; j<= sum ;j++) {
					
					 if(j<wt.get(i-1)) {
						dp[i][j]=  dp[i-1][j];
					}else {
						dp[i][j] = Math.min(val.get(i-1)+dp[i][j-wt.get(i-1)], dp[i-1][j]);     
					}
				}
			}
			
			
			//here it states that ifwe are not able to find the min price then the last value will be infinity and we have to return -1 as per the question
			return (dp[n][sum] == Integer.MAX_VALUE)? -1 :dp[n][sum];
			
			
		}
		}


