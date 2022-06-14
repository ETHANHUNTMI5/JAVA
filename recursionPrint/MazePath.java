package recursionPrint;

public class MazePath {

	public static void main(String[] args) {

	//Maze(0, 0, 2, 2, "");

		System.out.println(Mazecount(0, 0, 2, 2));
	}
public static void Maze(int cr,int cc, int lr,int lc,String s)
{
   if(cr>lr || cc>lc)
   {return;}

    if(cc==lc && cr==lr)
    {System.out.println(s);
    	return;}

    Maze(cr+1, cc, lr, lc, s+"V");
    
    Maze(cr, cc+1, lr, lc, s+"H");

    Maze(cr+1, cc+1, lr, lc, s+"D");

    
}

public static int Mazecount(int cr,int cc, int lr,int lc)
{
   if(cr>lr || cc>lc)
   {return 0;}

    if(cc==lc && cr==lr)
    {
    	return 1;}
    int count=0;

    count=count+Mazecount(cr+1, cc, lr, lc);
    
    count=count+Mazecount(cr, cc+1, lr, lc);

    count=count+Mazecount(cr+1, cc+1, lr, lc);

    return count;
    
}


}
