/** 
* Creates an instance of a Tree.
 *
 * @author Jason Liu
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaf1;
    private Triangle leaf2;
    private Triangle leaf3;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        leaf1 = new Triangle();
        leaf2 = new Triangle();
        leaf3 = new Triangle();
        trunk = new Square();
        
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
        leaf1.changeColor("green");
        leaf1.makeVisible();
        leaf1.changeSize(50, 50);
        leaf1.moveHorizontal(x);
        leaf1.moveVertical(y);
        
        //
        leaf2.changeColor("green");
        leaf2.makeVisible();
        leaf2.moveVertical(15);
        leaf2.changeSize(50, 50); 
        leaf2.moveHorizontal(x);
        leaf2.moveVertical(y);
        
        //
        leaf3.changeColor("green");
        leaf3.moveVertical(30);
        leaf3.makeVisible();
        leaf3.changeSize(50, 50);
        leaf3.moveHorizontal(x);
        leaf3.moveVertical(y);
        
        //
        trunk.changeColor("black");
        trunk.moveVertical(45);
        trunk.makeVisible();
        trunk.moveHorizontal(-20);
        trunk.changeSize(20);
        trunk.moveHorizontal(x);
        trunk.moveVertical(y);
        
        // translate the tree to the specified location
        
        
    }
    
}