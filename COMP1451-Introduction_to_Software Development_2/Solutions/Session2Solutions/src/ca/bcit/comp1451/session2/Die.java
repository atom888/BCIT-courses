/**
 * 
 */
package src.ca.bcit.comp1451.session2;

/**
 * @author Rana
 *
 */
import java.util.Random;
public class Die {
	 public static final int FACE_VALUE_LIMIT = 6;
	 public static final int SHIFT_FACTOR = 1;
	 private int faceValue;
	 private Random random;
	 /**
	 *  constructor
	 */
	public Die(){
		random = new Random();
		 roll();
		 
	 }
	 
	/**
	 * @return the die face value
	 */
	public int roll(){
		faceValue = random.nextInt(FACE_VALUE_LIMIT)+ SHIFT_FACTOR;
		return faceValue;
	}

	/**
	 * @return the faceValue
	 */
	public int getFaceValue() {
		return faceValue;
	}

	/**
	 * @return the random
	 */
	public Random getRandom() {
		return random;
	}

	 
	}



