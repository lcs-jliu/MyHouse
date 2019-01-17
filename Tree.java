/** 
* Creates an instance of a Tree.
 *
 * @author Jason Liu
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle Leaf1;
    private Triangle Leaf2;
    private Triangle Leaf3;
    private Square Trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        Leaf1 = new Triangle();
        Leaf2 = new Triangle();
        Leaf3 = new Triangle();
        Trunk = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        Leaf1.changeColor("green");
        Leaf1.makeVisible();
        Leaf1.changeSize(50, 50); 
        
        //
        Leaf2.changeColor("green");
        Leaf2.makeVisible();
        Leaf2.moveVertical(15);
        Leaf2.changeSize(50, 50); 
        
        //
        Leaf3.changeColor("green");
        Leaf3.moveVertical(30);
        Leaf3.makeVisible();
        Leaf3.changeSize(50, 50); 
        
        //
        Trunk.changeColor("black");
        Trunk.moveVertical(45);
        Trunk.makeVisible();
        Trunk.moveHorizontal(-20);
        Trunk.changeSize(20);
        
        
        // translate the tree to the specified location
        
        
    }
    
}