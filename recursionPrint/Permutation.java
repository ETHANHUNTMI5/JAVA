package recursionPrint;

public class Permutation {

	public static void main(String[] args) {
		
		getPer("abc", "");
	}
;
	public static void getPer(String ques,String ans)
	{
		if(ques.length()==0)
		{System.out.println(ans +" ");
		return;}
		
		for(int a=0;a<ques.length();a++)
		{
			char ch =ques.charAt(a);
			String s2 = ques.substring(0,a)+ques.substring(a+1);
			
			getPer(s2, ans+ch);
			
		}
		
	}
}
