package leetCode;

import java.util.ArrayList;

public class SpiralMat {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int left =0;
		int right = arr[0].length-1;
		System.out.println(right);
		int up=0;
        int down = arr.length-1;
        
        ArrayList<Integer> ll = new ArrayList<Integer>();
         int t=0;
        int count=0;
        
        while(count<arr[0].length*arr.length && up<=down && left<=right)
        {
        	
        	if(t==0)
        	{
        		int l =left;
        		
        		while(l<=right)
        		{
        			ll.add(arr[up][l]);
        			count++;
        			l++;
        		
        		}
        		
        		t=1;
        		up++;
        		
        	}
        	
        	else if(t==1)
        	{
        		int l =up;
        		
        		while(l<=down)
        		{
        			ll.add(arr[l][right]);
        			count++;
        			l++;
            	}
        		
        		t=2;
        		right--;
        		
        	}
        	
        	else if(t==2)
        	{
        		int l =right;
        		
        		while(l>=left)
        		{
        			ll.add(arr[down][l]);
        			count++;
        			l--;
            	}
        		
        		t=3;
        		down--;
        		
        	}
        	
        	else 
        	{
        		int l =down;
        		
        		while(l>=up)
        		{
        			ll.add(arr[l][left]);
        			count++;
            	System.out.println(ll);
            		l--;}
        		
        		t=0;
        		left++;
        		
        	}
        	
        	System.out.println(count);
        	
        	
        	
        }
        
        System.out.println(ll);
        
        System.out.println(count);
        
        
        
        
        
        
	}}