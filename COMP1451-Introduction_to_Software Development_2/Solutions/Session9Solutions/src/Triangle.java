import java.awt.*;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */

public class Triangle extends GeometricShapes
{
    private int height;
    private int width;
    

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangle()
    {
    	super(210,140,"green",false);
        height = 60;
        width = 70;
       
    }

  
    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    

    /**
     * Draw the triangle with current specifications on screen.
     */
    @Override
    public void draw()
    {
        if(isVisible()) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { getxPosition(), getxPosition() + (width/2), getxPosition() - (width/2) };
            int[] ypoints = { getyPosition(), getyPosition() + height, getyPosition() + height };
            canvas.draw(this, getColor(), new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

    
}
