package recursionPrint;

public class SubSequences {

	public static void main(String[] args) {
print("abc","");
	}

	public static void print(String str,String res)
	{
		
		if(str.length()==0)
		{System.out.println(res+" ");
		return;}
		
		
		char ch = str.charAt(0);
	    String s2 = str.substring(1);	
		
	    print(s2,res);
		print(s2,res+ch);
		
	}
	
}
