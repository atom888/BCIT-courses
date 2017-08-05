
/**
 * Write a description of class Math here.
 *
 * @author Adam Dipinto
 * @version V1.0 May 22 2017
 */
public class Math
{
    
    private int x;
    private int y;
    private final int TRIPLE = 3;

    /**
     * Constructor for objects of class Math
     */
    public Math(int newX, int newY)
    {
       x = newX;
       y = newY;
    }

    /**
     * Divide methods
     *
     * @param  y and x
     * @return  the value of x / y - unless y is zero
     */
    public int divide(int x, int y)
    {
        if (y == 0) {
            System.out.println("ERROR");
            return 0;
        } else {
            return x / y;
        }
        
    }
    /**
     * Max methods
     *
     * @param  y and x
     * @return  the value that is the largest
     */
    public int max (int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    /**
     * Remainder methods
     *
     * @param  y and x
     * @return  provides the remainder between x and y - unless y is zero
     */
    public int remainder(int x, int y) {
        if (y == 0) {
            System.out.println("ERROR");
            return 0;
        }
        return x % y;

    }
    /**
     * Triple methods
     *
     * @param  x
     * @return x multiplied by three
     */
    public int triple (int x) {
        return x * TRIPLE;
    }
    /**
     * getX
     *
     *
     * @return  X
     */
    public int getX () {
        return x;
    }
    /**
     * getY
     *
     *
     * @return  Y
     */
    public int getY () {
        return y;
    }
    /**
     * setX
     *
     *
     * sets the new value of x to x
     */
    public void setX(int newX) {
        x = newX;
    } 
    /**
     * setY
     *
     *
     * sets the new value of y to y
     */
    public void setY(int newY) {
        y = newY;
    }
    /**
     * method - isValidOperation
     *
     *
     * @returns true if the operator provided is listed - if not an error will appear.
     */
    public boolean isValidOperation(String operation) {
        switch(operation) {
            case "*":
                return true;
            case "/":
                return true;
            case "%":
                return true;
            case "+":
                return true;
            case "-":
                return true;  
            default:
                System.out.println("Please pick the proper operator");
                return false;
        }
    }
}
