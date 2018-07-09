/**
 * 
 */
package ca.bcit.comp1451.session3.LabA;

/**
 * @author Rana
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			StudentDatabase studentdBase = new StudentDatabase();
			studentdBase.addStudent("aDaM");
			studentdBase.addStudent("mAx");
			studentdBase.addStudent("jAnE");
			studentdBase.showQuizMarks();
			studentdBase.changeQuizMark("aDaM",5,90);
			studentdBase.changeQuizMark("jAnE", 9, 50);
			studentdBase.showQuizMarks();

		

	}

}
