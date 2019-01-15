
/**
 * It draws a complete house on screen using individual shapes
 *
 * @author Jason Liu
 * @version January 11, 2019
 */
public class MyHouse extends MyHouse
{
    // instance variablews - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    
    /**
     * The job of a constructer is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
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
        base. changeSize(200);
        
        //Draw base
        
        //Draw the roof
    }
}
