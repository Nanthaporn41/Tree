package RMUTI;
import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class App 
{
    public static void main( String[] args )
    {	
    	        Node e = new Node("e", null,null);
    	        Node d = new Node("f", null,null);
    	        Node g = new Node("g", null,null);
    	        Node f = new Node("f", null,null);
    	
    			Node c = new Node("c", g,f);
    			Node b = new Node("b", e,d);
    			
    			Node root = new Node("a", b,c);
    			
    			TreeDraw drawTree = new TreeDraw(root);
    			drawTree.binaryTreeDraw();
    		}

    	}
