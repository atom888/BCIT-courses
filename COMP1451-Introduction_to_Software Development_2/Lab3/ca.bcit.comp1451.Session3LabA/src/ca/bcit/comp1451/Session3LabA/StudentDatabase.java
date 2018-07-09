/**
 * 
 */
package ca.bcit.comp1451.Session3LabA;

import java.util.Arrays;
/**
 * @author A01034457
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDatabase {
	private HashMap<String, int[]> quizMarks;
	
	public static final int NUM_QUIZZES = 10;
	public static final int MIN_GRADE = 0;
	public static final int MAX_GRADE = 10;
	public static final int MIN_QUIZ = 1;
	public static final int MAX_QUIZ = 10;
	
	public StudentDatabase() {
		quizMarks = new HashMap<String, int[]>();
	}
	
	private String formatName(String name) {
		String result = "";
		if(name != null) {
			result = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return result;
	}
	
	public void addStudent(String studentName) {
		int[] defaultQuiz = new int[NUM_QUIZZES];
		
		if(!quizMarks.containsKey(formatName(studentName))) {
			quizMarks.put(formatName(studentName), defaultQuiz);
		}
	}
	
	public void displayQuizzes(String student) {
		Set<Map.Entry<String, int[]>> studentSet = quizMarks.entrySet();
		for (Entry<String, int[]> s: studentSet) {
			for(int i=0; i< s.getValue().length;i++  ) { 
				System.out.print(s.getValue()[i]+"  , ");
				if(i == (s.getValue().length-1)) {
					System.out.print(s.getValue()[i]+" ");
				}
			}
		}
	}
	
	public void changeQuizMark(String studentName, int whichQuiz, int newMark) {
		Set<Map.Entry<String, int[]>> studentSet = quizMarks.entrySet();
		
		if (!quizMarks.containsKey(studentName) && (whichQuiz > MIN_QUIZ && whichQuiz < MAX_QUIZ) && (newMark > MIN_GRADE && newMark < MAX_GRADE)) {
			for (Entry<String, int[]> s : studentSet) {
				if (s.getKey().equals(formatName(studentName))) {
					int [] studentQuiz = s.getValue();
					studentQuiz[whichQuiz] = newMark;
					quizMarks.put(studentName, studentQuiz);
				}
			}
		} else {
			System.out.println("Sorry, either the name of the student, the quiz selected, or the grade provided was incorrect");
		}
	}
	
	public void showQuizMarks() {

		Set<Map.Entry<String, int[]>> displaySet = quizMarks.entrySet();
		for (Entry<String, int[]> d: displaySet) {
			System.out.println("Quiz marks for: "+ d.getKey());
			System.out.println(Arrays.toString(d.getValue()));
			System.out.println("==============================");
			
		}
		
	}
}
