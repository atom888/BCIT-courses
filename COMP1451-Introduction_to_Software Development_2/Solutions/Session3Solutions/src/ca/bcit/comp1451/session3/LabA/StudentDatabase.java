package ca.bcit.comp1451.session3.LabA;


import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
/**
 * @author Rana
 *
 */
public class StudentDatabase {
	public static final int NUM_QUIZZES = 10;  
	public static final int MIN_GRADE  = 0;  
	public static final int MAX_GRADE  = 100;
	public static final int MIN = 1;

	private HashMap<String, int[]> quizMarks;	

	/**
	 *  constructor
	 */
	public StudentDatabase(){
		quizMarks = new HashMap<String, int[]>();
	}


	/**
	 * @param studentName
	 */
	public void addStudent(String studentName){ 

		if (studentName != null && studentName.length() > 0) {
			quizMarks.put(formatName(studentName), createQuizzes());  

		}
		else {
			System.out.println("Invalid name");
		}
	}


	/**
	 * Format a name so that the first letter of each
	 *  name portion is uppercase and the rest lowercase.
	 * 
	 * @param nameToFormat name to format
	 * @return the formatted name as a String
	 */
	public String formatName(String nameToFormat)
	{
		String formattedName = "";                    // start off blank
		if (nameToFormat != null && nameToFormat.length() > 0) { 
			String[] nameParts = nameToFormat.toUpperCase().split(" "); // separate the parts
			for (int i = 0; i < nameParts.length; i++) {
				// name is already uppercase so everything after the first letter
				// needs to be made lowercase 
				formattedName = formattedName + nameParts[i].substring(0,1) // first letter
						+ nameParts[i].substring(1).toLowerCase() + " "; // all the rest + space between

			}
		}
		return formattedName.trim(); // get rid of last space
	}


	/**
	 * Creates a new array to hold quizzes and initializes each to 
	 * MIN_GRADE.
	 * 
	 * @return array of int with space for NUM_QUIZZES grades
	 */
	private int[] createQuizzes()
	{
		int[] quizzes = new int[NUM_QUIZZES];
		for (int m : quizzes) {
			m = MIN_GRADE;
		}
		return quizzes;
	}

	/**
	 * Gets all the quiz marks for the specified student.
	 * 
	 * @param the student whose quiz marks we want
	 * @return quiz marks as an array of int or return null
	 */
	public int[] getQuizzes(String student)
	{
		if(student != null && !quizMarks.containsKey(formatName(student))){
			return quizMarks.get(formatName(student));
		}
		return null;
	}

	/**
	 * Changes one quiz mark for one student - student must be in the database,
	 * quiz to change must be valid, new mark must be valid.
	 * 
	 * @param studentName student whose grade we want to change
	 * @param whichQuiz the number of the quiz to be changed
	 * @param newMark the new grade to be assigne to the quiz
	 */
	public void changeQuizMark(String studentName, int whichQuiz, int newMark)
	{
		String name = formatName(studentName);
		if (! quizMarks.containsKey(name)) {
			System.out.println(name + " is not in the database.");
		}
		else if(whichQuiz < 0 || whichQuiz >= NUM_QUIZZES) {  // zero-indexed
			System.out.println(whichQuiz + " is not a valid quiz.");
		}
		else if (newMark < MIN_GRADE || newMark > MAX_GRADE) {
			System.out.println(newMark + " is not a valid grade.");
		}
		else {  // all OK so change quiz mark
			int[] studentQuizzes = getQuizzes(name);
			studentQuizzes[whichQuiz] = newMark;
			// getQuizzes(name)[whichQuiz] = newMark; // another way of doing the same thing
		}
	}

	/**
	 * Print out each student in the database, and that student's quiz marks
	 */
	public void showQuizMarks()
	{
		Set<String> names = quizMarks.keySet();
		if (quizMarks.size() > 0) {
			for(String student : names) {
				int[] quizzes = getQuizzes(student);
				System.out.println("Quiz marks for: "+ student);
				for(int q : quizzes){
					System.out.print(q + " ");
				}
				System.out.println();
			//	System.out.println(Arrays.toString(quizMarks.get(student))); // another way to display the array content
			}
			
		}
		else {
			System.out.println("No students enrolled yet.");
		}
	}
	

}

