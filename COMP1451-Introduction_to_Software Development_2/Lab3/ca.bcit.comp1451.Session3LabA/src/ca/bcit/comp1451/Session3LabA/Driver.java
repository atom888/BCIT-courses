/**
 * 
 */
package ca.bcit.comp1451.Session3LabA;

/**
 * @author A01034457
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentDatabase theStudentDataBase = new StudentDatabase();
		
		theStudentDataBase.addStudent("chester");
		theStudentDataBase.addStudent("jack");
		theStudentDataBase.addStudent("hannah");
		
		System.out.println("Single Display");
		theStudentDataBase.displayQuizzes("chester");
		System.out.println("---------------");
		
		theStudentDataBase.changeQuizMark("hannah", 3, 10);
		theStudentDataBase.changeQuizMark("jack", 2, 8);
		
		theStudentDataBase.showQuizMarks();

		

	}

}
