

/**
 * 
 */

/**
 * @author adamdipinto
 *
 */
public abstract class ShapeFigures {
	
	private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
	/**
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 * @param isVisible
	 */
	public ShapeFigures(int xPosition, int yPosition, String color, boolean isVisible) {
		setxPosition(xPosition);
		setyPosition(yPosition);
		setColor(color);
		setVisible(isVisible);
	}
	/**
	 * @return the xPosition
	 */
	public int getxPosition() {
		return xPosition;
	}
	/**
	 * @param xPosition the xPosition to set
	 */
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	/**
	 * @return the yPosition
	 */
	public int getyPosition() {
		return yPosition;
	}
	/**
	 * @param yPosition the yPosition to set
	 */
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		if (color != null && !color.isEmpty()) {
			this.color = color;
		}
	}
	/**
	 * @return the isVisible
	 */
	public boolean isVisible() {
		return isVisible;
	}
	/**
	 * @param isVisible the isVisible to set
	 */
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	/**
     * Erase the shape on screen.
     */
    public void erase()
    {
    	boolean isVisible = isVisible();
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        setVisible(true);
        draw();
    }
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        setVisible(false);
    }
    
    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the circle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        int xPosition = getxPosition();
        xPosition += distance;
        setxPosition(xPosition);
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        int yPosition = getyPosition();
        yPosition += distance;
        setyPosition(yPosition);
        draw();
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;
    	int xPosition = getxPosition();	

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            setxPosition(xPosition);
            draw();
        }
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;
        int yPosition = getyPosition();
        
        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            setyPosition(yPosition);
            draw();
        }
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
    
    public abstract void draw();
	
}
