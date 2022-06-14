
    
package challenges_Graph;
import java.util.*;
public class Beau2 {

	
    
	 
	        public static void main(String args[] ) throws Exception {
	            Scanner sc = new Scanner(System.in);
	            
	            int n = sc.nextInt();
	            
	            int m = sc.nextInt();
	            
	            node[] node = new node[n];
	           
	            for(int i=0;i<m;i++){
	                int x = sc.nextInt()-1;
	                int y = sc.nextInt()-1;
	                
	                if(node[x] == null)
	                    node[x] = new node();
	                if(node[y] == null)
	                    node[y] = new node();
	                
	                node[x].judegare(node[y]);
	                node[y].judegare(node[x]);
	                
	            }
	            
	            
	            for(int i=0;i<n;i++){
	                if(node[i]!=null){
	                    if(node[i].visited == false){
	                        lelomuje(null,node[i]);
	                    }
	                }
	            }
	            
	            int counter = 0;
	            for(int i = 0;i<n;i++){
	                if(node[i]!=null){
	                    if(node[i].parent!=null){
	                        if(node[i].merebachche > node[i].parent.merebachche)
	                            counter++;
	                    }
	                }
	            }
	            
	            
	            
	            System.out.println(counter);
	            
	        }
	        public static void lelomuje(node parent,node child){
	            child.parent = parent;
	            child.visited = true;
	            int gineHueBachche = 0;
	            for(int i=0;i<child.adj.size();i++){
	                if(child.adj.get(i).visited == false){
	                    gineHueBachche++;
	                    lelomuje(child,child.adj.get(i));
	                }
	            }
	            child.merebachche = gineHueBachche;
	        }
	    }
	     
	    class node{
	        boolean visited = false;
	        int merebachche = 0;
	        node parent = null;
	        ArrayList<node> adj = new ArrayList<node>();
	        
	        public void judegare(node a){
	            adj.add(a);
	        }
	        
	    }