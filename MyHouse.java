
/**
 * It draws a complete house on screen using individual shapes
 *
 * @author Jason Liu
 * @version January 11, 2019
 */
public class MyHouse
{
    // instance variablews - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square door1;
    private Square door2;
    private Square window;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;
    /**
     * The job of a constructer is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        door1 = new Square();
        door2 = new Square();
        window = new Square();
        tree1 = new Tree(500,180);
        tree2 = new Tree(200,180);
        tree3 = new Tree(300,180);
        tree4 = new Tree(400,180);
        tree5 = new Tree(0,180);
    }

    /**
     * Draw the house for us.
     */
    public void drawHouse()
    {
        // put your code here
        sun.moveHorizontal(230);
        sun.moveVertical(-100);
        sun.changeSize(100);
        sun.changeColor("yellow");
        sun.makeVisible();
        
        //Draw base
        base.changeSize(120);
        base.makeVisible();
        base.moveVertical(130);
        base.moveHorizontal(30);

        //Draw the roof
        roof.changeSize(50 , 200);
        roof.makeVisible();
        roof.moveHorizontal(100);
        roof.moveVertical(120);
        
        //Draw the door
        door1.changeColor("blue");
        door2.changeColor("blue");
        door1.makeVisible();
        door1.changeSize(30);
        door2.makeVisible();
        door2.changeSize(30);
        door1.moveHorizontal(90);
        door2.moveHorizontal(90);
        door1.moveVertical(220);
        door2.moveVertical(200);
        
        //Draw the window
        window.makeVisible();
        window.changeColor("yellow");
        window.moveHorizontal(50);
        window.moveVertical(160);
    }
}
