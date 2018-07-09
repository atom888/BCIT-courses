import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */

public class Circle extends ShapeFigures
{
    private int diameter;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
    	super(230, 90, "blue", false);
        setDiameter(68);
    }
    
    /**
	 * @return the diameter
	 */
	public int getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(int diameter) {
		if (diameter > 0) {
			this.diameter = diameter;
		}
	}

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newDiameter)
    {
        erase();
        setDiameter(newDiameter);
        draw();
    }

    /**
     * Draw the circle with current specifications on screen.
     */
    public void draw()
    {
    	boolean isVisible = isVisible();
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(), new Ellipse2D.Double(getxPosition(), getyPosition(), 
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }
}
