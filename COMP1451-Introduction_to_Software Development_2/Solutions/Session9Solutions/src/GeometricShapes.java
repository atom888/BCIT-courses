
public abstract class GeometricShapes {
	
	private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    
    
	public GeometricShapes(int xPosition, int yPosition, String color, boolean isVisible) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.color = color;
		this.isVisible = isVisible;
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
		this.color = color;
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
    
	 public void makeVisible()
	    {
	        isVisible = true;
	        draw();
	    }
	    
	    /**
	     * Make this circle invisible. If it was already invisible, do nothing.
	     */
	    public void makeInvisible()
	    {
	        erase();
	        isVisible = false;
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
	        xPosition += distance;
	        draw();
	    }

	    /**
	     * Move the circle vertically by 'distance' pixels.
	     */
	    public void moveVertical(int distance)
	    {
	        erase();
	        yPosition += distance;
	        draw();
	    }

	    /**
	     * Slowly move the circle horizontally by 'distance' pixels.
	     */
	    public void slowMoveHorizontal(int distance)
	    {
	        int delta;

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
	            draw();
	        }
	    }

	    /**
	     * Slowly move the circle vertically by 'distance' pixels.
	     */
	    public void slowMoveVertical(int distance)
	    {
	        int delta;

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
	            draw();
	        }
	    }
	    
	    /**
	     * Change the color. Valid colors are "red", "yellow", "blue", "green",
	     * "magenta" and "black".
	     */
	    public void changeColor(String newColor)
	    {
	        color = newColor;
	        draw();
	    }
	    
	    /**
	     * Erase the circle on screen.
	     */
	    public void erase()
	    {
	        if(isVisible) {
	            Canvas canvas = Canvas.getCanvas();
	            canvas.erase(this);
	        }
	    }
	    
	    public abstract void draw();


}
