/**
 * 
 */
package ca.bcit.comp1451.session10.LabASolution;

/**
 * @author Rana
 *
 */
public class NumberReader {

	private InputReader reader;

	public NumberReader() {
		reader = new InputReader();
	}

	public void calculateSum(){
		System.out.println(" enter numbers to add, 0 to stop");
		int number = -1;
		int sum = 0;

		while(number != 0){
			try{
				number = reader.getNumber();
				sum+= number;
			}
			catch(InvalidInputException exc){
				System.out.println(exc.getMessage());
			}
			catch( Exception exc){
				System.out.println(exc.getMessage());
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new NumberReader().calculateSum();

	}

}
