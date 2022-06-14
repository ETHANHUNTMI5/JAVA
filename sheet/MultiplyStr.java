package sheet;

import java.util.Arrays;

public class MultiplyStr {

	public static void main(String[] args) {
		
		String num1 =100+"";
		String num2 =3+"";
		 int l1 = num1.length();
	     int l2 = num2.length();
	       
		int [] arr1 = new int[l1];
	    int [] arr2 = new int[l2];
				
		     
	    for(int a=0;a<l1;a++)
	    {
	    	arr1[a]= num1.charAt(a)-'0';
	    	
	    }
	    
	    for(int a=0;a<l2;a++)
	    {
	    	arr2[a]= num2.charAt(a)-'0';
	    	
	    }
	    
	    
	     
	        int [] ans = new int[l1+l2];
	  
	        int a= l1+l2-1;
	        
       
	       
	      int b = l2-1;
	      int p =0;  
	        while(b>=0)
	        {
	            int mul = arr2[b];
	 
	            for(int t = l1-1;t>=0;t--)
	            {
	                int num = arr1[t];
	                
	              
	                int gg = ans[a-p+t-l1+1]+(mul*num);
	                
	                if(gg>=10)
	                    {
	                	
	                	ans[a-p+t-l1+1]=  gg%10;
	                    ans[a-p+t-l1]+= gg/10;
	                    }
	                    else
	                    {
	                    ans[a-p+t-l1+1]= gg;
	                    }
	                
	            }
	            
	            
	        p++;
	        b--;}
	        
	        
	       String op=""; 
	      for(int c=0;c<ans.length;c++)
	      {
	    	  if(c==0 && ans[c]==0)
	    	  {continue;}
	    	  
	    	  op+=ans[c];
	      }
	     System.out.println(op);
	        
	    }
	}