import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.io.FileOutputStream;
import java.io.FileDescriptor;

/**
 * This is the primary evaluation module for COMP 1409 Assignment Two
 * under Jason Harrison / James McCartney.
 * 
 * The student will observe that this module operates quite differently
 * from the one demonstrated in Assignment One.  Your task will be to
 * have RunTest respond with the message "Done! Total Issues Found: 0".
 * There are a large amount of alternative outcomes, which are
 * difficult to troubleshoot -- yet you will still be obligated to fix.
 * 
 * If you see:
 *      Line mismatch. Found: <a number>. Expected: <different number>
 * 
 * ... then your solution has diverged so greatly from expectations
 * that the tool is not able to begin to say how.  Usually, this will
 * be because your classes have less, or more, System.out.println()
 * statements than expected.  Go into your mutators, and ensure
 * that they do not have println()s at all.  It is expected,
 * in this assignment, that if any validation fails, it "fails silently";
 * that is, no changes result, and there is no output message.
 * 
 * If you see:
 *      no suitable constructor found for ClassName(<arguments>)
 *      constructor ClassName.ClassName() is not applicable;
 *      (actual and formal argument lists differ in length)
 *      
 * ... then one of your classes' constructors needs to be changed,
 * or possibly added.  TestAssignment expects that the constructors
 * will have specific parameter types in a specific order,
 * specified in the assignment requirements document.
 * 
 * If you see:
 *      Expected: <a String or number>
 *      Found: <different String or number>
 * 
 * ... these are typical "bugs", or flaws in your program.
 * Since the test module only tells you what output it expected
 * to see, versus what it actually saw, you may be missing some
 * context, and be uncertain as to where the problem occurred.
 * Do not be discouraged.
 * Yes, the test module could and should have been written
 * to give you more information, but you'll struggle with
 * incomplete reporting tools throughout your career.
 * Use the clues provided in pages 15 through 27 (Expected Output)
 * of the assignment document to narrow down what class is malfunctioning.
 * 
 * For example, the number "71" is the expected result
 * of Author.getAgeYearsOfDirector() for the imaginary person
 * born on December 18, 1946.  Because the age answer is dependent
 * on a 2017 reference point, and not the author's age at death,
 * you might get the numbers 70 or 66 instead.
 * Visit Author.getAgeYearsOfDirector() and make whatever change is needed
 * to produce the 71 answer.  [Note: We always program according
 * to design, regardless of whatever other information we have.
 * In this case, design says the current year is 2017.
 * If the design is mistaken, then design can be reviewed and corrected
 * by management -- but programmers should learn to follow instructions.]
 */
class RunTest
{
    private final static String NEWLINE_CHAR = System.getProperties().getProperty("line.separator"); // Get the println separator

    private static String expected = "Sunday" + NEWLINE_CHAR + "Sunday" + NEWLINE_CHAR + "Monday" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Wednesday" + NEWLINE_CHAR + "Wednesday" + NEWLINE_CHAR + "Thursday" + NEWLINE_CHAR + "Thursday" + NEWLINE_CHAR + "Friday" + NEWLINE_CHAR + "Friday" + NEWLINE_CHAR + "Saturday" + NEWLINE_CHAR + "Saturday" + NEWLINE_CHAR + "Saturday" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "March" + NEWLINE_CHAR + "Sunday" + NEWLINE_CHAR + "31" + NEWLINE_CHAR + "12" + NEWLINE_CHAR + "2001-06-29" + NEWLINE_CHAR + "Friday" + NEWLINE_CHAR + "30" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "Sunday" + NEWLINE_CHAR + "31" + NEWLINE_CHAR + "2017" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "January" + NEWLINE_CHAR + "2017" + NEWLINE_CHAR + "2017" + NEWLINE_CHAR + "2010" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "8" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "27" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A.N.Y." + NEWLINE_CHAR + "Steven Spielberg" + NEWLINE_CHAR + "S.S." + NEWLINE_CHAR + "Steven Allan Spielberg" + NEWLINE_CHAR + "S.A.S." + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A.N.Y." + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A.N.Y." + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A.N.Y." + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A.N.Y." + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A.N.Y." + NEWLINE_CHAR + "Steven" + NEWLINE_CHAR + "null" + NEWLINE_CHAR + "Spielberg" + NEWLINE_CHAR + "Allan" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "false" + NEWLINE_CHAR + "0" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "1946-12-18" + NEWLINE_CHAR + "Steven Spielberg" + NEWLINE_CHAR + "Steven Allan Spielberg" + NEWLINE_CHAR + "null" + NEWLINE_CHAR + "1946-12-18" + NEWLINE_CHAR + "Ralph Danger" + NEWLINE_CHAR + "Steven Allan Spielberg" + NEWLINE_CHAR + "null" + NEWLINE_CHAR + "1946-12-18" + NEWLINE_CHAR + "null" + NEWLINE_CHAR + "2000-06-13" + NEWLINE_CHAR + "2000-06-13" + NEWLINE_CHAR + "Steven Spielberg" + NEWLINE_CHAR + "1946-12-18" + NEWLINE_CHAR + "Ralph Danger" + NEWLINE_CHAR + "71" + NEWLINE_CHAR + "Untitled" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "A. Non Ymous" + NEWLINE_CHAR + "Back to the Future" + NEWLINE_CHAR + "1985-07-03" + NEWLINE_CHAR + "2017-01-01" + NEWLINE_CHAR + "Untitled" + NEWLINE_CHAR + "Steven Allan Spielberg" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Steven Allan Spielberg(S.A.S.) released Jurassic World on Tuesday, October 20, 2015" + NEWLINE_CHAR + "Steven Spielberg(S.S.) released Jurassic World on Tuesday, October 20, 2015, under the pseudonym Ralph Danger"+ NEWLINE_CHAR; 
   
    /**
     * RunTest has a private constructor!!
     * This is because it matches a variety of "Singleton" programming pattern.
     * We only intend for an object of this type to be created by the main()
     * method.  Run main(), leaving the parameter as {} - just as it is,
     * to perform the Assignment Two Evaluation Test.
     */
    private RunTest() {} 
    
    /**
     * Use this method to evaluate your project.
     * You can do so by right-clicking the green RunTest class and selecting
     * "main()" from the pop-up menu.
     * @param args      standard entry-point input for a Java program;
     *                  these particular args are ignored,
     *                  since the module has all the info it needs already,
     *                  but the parameter {} is still necessary
     *                  for this method to fit the shape of an
     *                  "executable" class
     */
    public static void main(String[] args) {
        PrintStream originalOut = new PrintStream(new FileOutputStream(FileDescriptor.out));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);
        
        //Run test assignment
        TestAssignment t = new TestAssignment();
        // read in lines of each file
        
        String actual = outContent.toString();
        System.setOut(originalOut);
        String[] exp = expected.split("\n");
        String[] act = actual.split("\n");

        // number of lines of each file
        int expected_length = exp.length;
        int actual_length = act.length;
        
        int issues_found = 0;
        if(expected_length != actual_length)
        {
            System.out.println("Line mismatch. Found: " + actual_length + ". Expected: " + expected_length);
            return;
        }
        
        for(int i = 0; i < expected_length; i++)
        {
            if(!exp[i].equals(act[i]))
            {
                System.out.println("Expected: \t" + exp[i] + "\nFound: \t\t" + act[i]);
                System.out.println("========================================================================");
                issues_found++;
            }
        }
        
        System.out.println("Done! Total Issues Found: " + issues_found);
    }
}