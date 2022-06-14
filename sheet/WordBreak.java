package sheet;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static Set<String> ss = null;
	public static void main(String[] args) {
		String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};
                 

			ss = new HashSet<>(); 
			for (String temp :temp_dictionary)
				{ss.add(temp);}
			
			String word= "ilikesam";
			System.out.println(bta(word));
			System.out.println(bta(word, 0));
			System.out.println(btaT(word, 0, new boolean[word.length()]));
			System.out.println(BU(word));

	}
	
	public static boolean bta(String s)
	{
		
		if(s.length()==0)return true;
		
		if(ss.contains(s))return true;
		
		
		for(int a=0;a<s.length();a++)
		{
			String pre = s.substring(0,a);
			if(ss.contains(pre) && bta(s.substring(a)))
			{return true;}
			
		}
		
	return false;}

	public static boolean bta(String s, int vi)
	{
		
		if(vi==s.length())return true;
		
		
		
		for(int a=vi;a<=s.length();a++)
		{
			String pre = s.substring(vi,a);
			
			
			if(ss.contains(pre) && bta(s,a))
			{return true;}
			
		}
	return false;}
	
	
	public static boolean btaT(String s, int vi,boolean[] strg)
	{
		
		if(vi==s.length())return true;
		
		if(strg[vi])return true;
		
		for(int a=vi;a<=s.length();a++)
		{
			String pre = s.substring(vi,a);
			
			
			if(ss.contains(pre) && btaT(s,a,strg))
			{return strg[vi]=true;}
			
		}
	return strg[vi]=false;}

	public static boolean BU(String s)
	{boolean[] dp = new boolean[s.length() + 1];
    
    
    dp[0] = true;
 
    for(int i = 0; i <= s.length(); i++){
        for(int j = 0; j < i; j++){
            if(dp[j] && ss.contains(s.substring(j, i))){
                dp[i] = true;
                break;
            }
        }
    }
    return dp[s.length()];}
}
