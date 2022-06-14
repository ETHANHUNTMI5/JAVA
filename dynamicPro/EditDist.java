package dynamicPro;

public class EditDist {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		System.out.println(EDistRec(s1, s2));
		System.out.println(EDistIA(s1, s2, new int[s1.length()+1][s2.length()+1]));

	}
	public static int EDistRec(String s1,String s2)
	{
		
		if(s1.length()==0 || s2.length()==0)
		{
			return Math.max(s1.length(), s2.length());
		}
		
		
		int ans=0;
		
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		
		
		if(s1.charAt(0)==s2.charAt(0))
		{
			ans = EDistRec(ros1, ros2);
		}
		else
		{
			int a=EDistRec(ros1, s2);
			int b=EDistRec(s1, ros2);
			int c=EDistRec(ros1,ros2);
			
			ans = Math.min(a, Math.min(b, c))+1;
		}
		return ans;
	}
	
	public static int EDistIA(String s1,String s2,int [][] arr)
	{
		
		
         for(int i = s1.length();i>=0;i--)
         {
        	 for(int j= s2.length();j>=0;j--)
        	 {
        		 if(i==s1.length())
        		 {arr[i][j]=s2.length()-j;
        		 continue;}
        		 
        		 if(j==s2.length())
        		 {arr[i][j]=s1.length()-i;
        		 continue;}
        		 
        		 if(s1.charAt(i)==s2.charAt(j))
        		 {
        			 arr[i][j]=arr[i+1][j+1];
        		 }
        		 else
        		 {arr[i][j]= 1+Math.min(arr[i+1][j],Math.min(arr[i][j+1], arr[i+1][j+1]));}
        	 }
        	 
         }
         
         return arr[0][0];
		
		
	}

}
