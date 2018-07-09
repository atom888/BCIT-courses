/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.erase();
        wall.setColor("red");
        wall.setxPosition(200);
        wall.setyPosition(140);
        wall.setSize(120);
        wall.setVisible(true);
        wall.draw();
        
        window = new Square();
        window.erase();
        window.setColor("black");
        window.setxPosition(220);
        window.setyPosition(170);
        window.setSize(40);
        window.setVisible(true);
        window.draw();

        roof = new Triangle();  
        roof.erase();
        roof.setColor("green");
        roof.setHeight(60);
        roof.setWidth(180);
        roof.setxPosition(260);
        roof.setyPosition(100);
        roof.setVisible(true);
        roof.draw();
       

        sun = new Circle();
        sun.erase();
        sun.setColor("yellow");
        sun.setxPosition(100);
        sun.setyPosition(40);
        sun.setDiameter(80);
        sun.setVisible(true);
        sun.draw();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
