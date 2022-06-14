package String;

public class RabinKarp {

	public static void main(String[] args) {
		String s ="AABAACAADAABAABA";
        String p =  "AABAAC";
        
        int l = p.length();
        int prime =3;
        int m = (int) Math.pow(prime,l-1);
        
        int phash=0;
        int mul=1;
        int sshash=0;
        for(int a=0;a<p.length();a++)
        {
        	int c = p.charAt(a)-64;
        	int c2 = s.charAt(a)-64;
        	phash+=c*mul;
        	sshash+=c2*mul;
        	mul=mul*prime;
        	
        }

        //System.out.println(phash);
        
        for(int a=p.length();a<=s.length();a++)
        {
        	if(phash==sshash)
            {
        		if(check(s,p,a-p.length()))
        		{System.out.println(a-p.length());}
        		
            }
        	if(a==s.length())break;
        	
        	sshash = ((sshash-(s.charAt(a-p.length())-64))/prime)+m*(s.charAt(a)-64);
        	//System.out.println(sshash);
        }
        
	}

	public static boolean check(String s, String p,int i) {
		
		for(int a=0;a<p.length();a++)
		{
			if(s.charAt(a+i)!=p.charAt(a))
			{return false;}
		}
		
		return true;
	}

}
