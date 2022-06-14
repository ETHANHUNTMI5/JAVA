package sheet;

import java.util.HashMap;

import java.util.Stack;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		String s = "abacb";
	
HashMap<Character,Integer> map = new HashMap<>();
        boolean[] visited = new boolean[26];
        int n = s.length();
        
        for(int a=0;a<n;a++)
        {
            char cc = s.charAt(a);
            
            if(!map.containsKey(cc))
            {
                map.put(cc,1);
            }
            else
            {
                map.put(cc,map.get(cc)+1);
            }
        
        }
        System.out.println(map);
	
        Stack<Character> ss = new Stack<>();
        
        ss.push(s.charAt(0));
        map.put(s.charAt(0),map.get(s.charAt(0))-1);
        visited[s.charAt(0)-'a']=true;
        int a=1;
        System.out.println(map);
        while(a!=n)
        {
        	char cc = s.charAt(a);
        	map.put(cc,map.get(cc)-1);
        	
        	
        	if(visited[cc-'a'])
        	{a++;
        		continue;}
        	
        	
        		while(!ss.isEmpty() && cc< ss.peek() && map.get(ss.peek())>0)
        		{
        			visited[ss.peek()-'a'] = false;
        			ss.pop();
        		}
        		
        	
        	
        	
        	ss.push(cc);

        	visited[cc-'a'] = true;
        	
        
       System.out.println(a+" "+ss+" "+map);
       a++;
       
       
        }
//        System.out.println(ss);
//        System.out.println(map);
String ans="";
        while(!ss.isEmpty())
        {ans=ss.pop()+ans;}
        System.out.println(ans);
	}

}
