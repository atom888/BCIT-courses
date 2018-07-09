import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */

public class Square extends ShapeFigures
{
    private int size;


    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
    	super(310, 120, "red", false);
        setSize(60);
    }
    
    /**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		if (size > 0) {
			this.size = size;
		}
	}


    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newSize)
    {
        erase();
        setSize(newSize);
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        setColor(newColor);
        draw();
    }

    /**
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
    	boolean isVisible = isVisible();
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(), new Rectangle(getxPosition(), getyPosition(), getSize(), getSize()));
            canvas.wait(10);
        }
    }
}
