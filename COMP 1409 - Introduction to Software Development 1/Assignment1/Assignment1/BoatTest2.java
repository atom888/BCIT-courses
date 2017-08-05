import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.ComparisonFailure;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Properties;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class BoatTest2
{
    private final static String NEWLINE_CHAR = System.getProperties().getProperty("line.separator"); // Get the println separator
    private final static String EXPECTED_GET_BAD_YEARED_BOAT_DETAILS = "Sorry. There is an error with this boat's model year." + NEWLINE_CHAR;
    private final static String EXPECTED_GET_BAD_NAMED_BOAT_DETAILS = "Sorry. There is an error with this boat's model name." + NEWLINE_CHAR;
    private final static String EXPECTED_GET_BAD_HORSEPOWERED_BOAT_DETAILS = "Sorry. There is an error with this boat's horsepower." + NEWLINE_CHAR;
    private final static String EXPECTED_GET_BAD_MANUFACTURER_BOAT_DETAILS = "Sorry. There is an error with this boat's manufacturer." + NEWLINE_CHAR;

    private final static int DEFAULT_MODEL_YEAR = 0;
    private final static String DEFAULT_MODEL_NAME = null;
    private final static double DEFAULT_HORSEPOWER = 0.0;
    private final static boolean DEFAULT_TWIN_ENGINE = false;

    private final static int GOOD_MODEL_YEAR = 1998;
    private final static String GOOD_MODEL_NAME = "Outlaw";
    private final static double GOOD_HORSEPOWER = 200.0;
    private final static boolean GOOD_TWIN_ENGINE = true;
    private final static String GOOD_MANUFACTURER = "Yamaha";
    private final static String GOOD_BODYTYPE = "powerboat";
   
    public BoatTest2()
    {
    }
    @BeforeClass
    public static void testSetup() {
      }
    
    @AfterClass
    public static void testCleanup() {
        // Teardown for data used by the unit tests
    }
    
    @Test
    public void TestFieldsHaveCorrectModifiers() {      
        
        testFieldIsPrivate("modelName");
        testFieldIsPrivate("modelYear");
        testFieldIsPrivate("horsepower");
        testFieldIsPrivate("BODYTYPE");
        testFieldIsPrivate("isTwinEngine");
        testFieldIsPrivate("manufacturer");
        testFieldIsPrivate("webpage");

        testFieldIsStatic("BODYTYPE");
        testFieldIsStatic("webpage");

        testFieldIsConstant("BODYTYPE");
    }
    
    private void testFieldIsPrivate(String fieldName)
    {
        if(fieldName == null)
        {
            return;
        }
        try{
            //load the Boat at runtime
            Class cls = Class.forName("Boat");
            Object obj = cls.newInstance();

            //call the printItString method, pass a String param 
            Field method = cls.getDeclaredField(fieldName);
            int modifiers = method.getModifiers();
            assertEquals("Field " + fieldName + " is not private -1 mark. \n", true, Modifier.isPrivate(modifiers));
        } 
        catch (NoSuchFieldException e) {
            throw new AssertionError("Field must be named exactly \"" + fieldName + "\" -1 mark. \n");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void testFieldIsConstant(String fieldName)
    {
        if(fieldName == null)
        {
            return;
        }
        try{
            //load the Boat at runtime
            Class cls = Class.forName("Boat");
            Object obj = cls.newInstance();

            //call the printItString method, pass a String param 
            Field method = cls.getDeclaredField(fieldName);
            int modifiers = method.getModifiers();
            assertEquals("Field " + fieldName + " is not marked constant -1 mark. \n", true, Modifier.isFinal(modifiers));
        } 
        catch (NoSuchFieldException e) { // Field does not exist
            throw new AssertionError("Field must be named exactly \"" + fieldName + "\" -1 mark. \n");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void testFieldIsStatic(String fieldName)
    {
        if(fieldName == null)
        {
            return;
        }
        try{
            //load the Boat at runtime
            Class cls = Class.forName("Boat");
            Object obj = cls.newInstance();

            //call the printItString method, pass a String param 
            Field method = cls.getDeclaredField(fieldName);
            int modifiers = method.getModifiers();
            assertEquals("Field " + fieldName + " is not static -1 mark. \n", true, Modifier.isStatic(modifiers));
        } 
        catch (NoSuchFieldException e) {
            throw new AssertionError("Field must be named exactly \"" + fieldName + "\" -1 mark. \n");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestStaticAccessorMethods()
    {
        Class noparams[] = {};

        try{
            //load the Boat at runtime
            Class cls = Class.forName("Boat");
            Object obj = cls.newInstance();

            //call the printItString method, pass a String param 
            Method getManufacturer = cls.getDeclaredMethod("getManufacturer", noparams);
            Method getBodyType = cls.getDeclaredMethod("getBodyType", noparams);
            Method getWebpage = cls.getDeclaredMethod("getWebpage", noparams);
            int manufactuerModifiers = getManufacturer.getModifiers();
            int bodyTypeModifiers = getBodyType.getModifiers();
            int webpageModifiers = getWebpage.getModifiers();

            assertEquals("Method \"getWebpage()\" is not marked static. -1 mark. \n", true, Modifier.isStatic(webpageModifiers));
            
            assertEquals("Method \"getBodyType()\" is not marked static. -1 mark. \n", true, Modifier.isStatic(bodyTypeModifiers));
        } 
        catch (NoSuchMethodException e) { // Field does not exist
            throw new AssertionError("Method \"" + e.getLocalizedMessage() + "\" does not exist, or is spelled wrong. -1 mark. \n");
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void TestConstructorModelYearLowValuePrintln()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        String exceptedModelYearLowValueOutput =    "1950 is too early, sorry" + NEWLINE_CHAR;

        Boat boat1 = new Boat(1950, "Speedster", 200.0,"Outlaw", true); // Create an object with JUST a bad year

        assertEquals("Constructor does not output the correct error string when 1950 is given as the year. -2 marks. \n",
                    exceptedModelYearLowValueOutput, outContent.toString());    
        //Flush the collected content
        outContent.reset();
        ps.flush();
    }

    @Test
    public void TestConstructorModelNameEmptyPrintln()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        String expectedModelNameLowValueOutput =    "a model name was not provided, sorry" + NEWLINE_CHAR;

        Boat boat2 = new Boat(1973, "", 300.0,"Bayliner", true);
        assertEquals("Constructor does not output the correct error string when an empty string is given as the model name. -3 marks. \n",
                    expectedModelNameLowValueOutput, outContent.toString());

        //Flush the collected content
        outContent.reset();
        ps.flush();
    }

    @Test
    public void TestConstructorHorsepowerLowValuePrintln()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        String expectedHorsepowerLowValueOutput =    "20.0 is too little, sorry" + NEWLINE_CHAR;

        Boat boat3 = new Boat(1990, "Outlaw", 20.0, "Bayliner",true);
        assertEquals("Constructor does not output the correct error string when 20.0 is given as the horsepower. -2 marks. \n",
                    expectedHorsepowerLowValueOutput, outContent.toString());

        //Flush the collected content
        outContent.reset();
        ps.flush();
    }

    @Test
    public void TestConstructorModelYearHighValuePrintln()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        String exceptedModelYearHighValueOutput =    "2020 is too late, sorry" + NEWLINE_CHAR;

        Boat boat1 = new Boat(2020, "Outlaw", 200.0,"Bayliner", true); // Create an object with JUST a bad year

        assertEquals("Constructor does not output the correct error string when 2020 is given as the year. -2 marks. \n",
                    exceptedModelYearHighValueOutput, outContent.toString());    
        //Flush the collected content
        outContent.reset();
        ps.flush();
    }

    @Test
    public void TestConstructorHorsepowerHighValuePrintln()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        String expectedHorsepowerHighValueOutput =    "800.0 is too much, sorry" + NEWLINE_CHAR;

        Boat boat3 = new Boat(1990, "Outlaw", 800.0,"Bayliner", true);
        assertEquals("Constructor does not output the correct error string when 800.0 is given as the horsepower. -2 marks. \n",
                    expectedHorsepowerHighValueOutput, outContent.toString());

        //Flush the collected content
        outContent.reset();
        ps.flush();
    }

    @Test
    public void TestConstructorYearParameter() {
        try {
            Calendar now = Calendar.getInstance();
            int currYear = now.get(Calendar.YEAR);
            int excessiveYear = currYear + 2;
            
            Boat boat1 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME,  GOOD_HORSEPOWER, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE);
            Boat boat2 = new Boat(1973,            GOOD_MODEL_NAME,  GOOD_HORSEPOWER, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // Low end (inclusive) of the ranges
            Boat boat3 = new Boat(currYear,        GOOD_MODEL_NAME,  GOOD_HORSEPOWER, GOOD_MANUFACTURER,DEFAULT_TWIN_ENGINE); // High end (inclusive) of the ranges
            Boat boat4 = new Boat(1972,            GOOD_MODEL_NAME, GOOD_HORSEPOWER, GOOD_MANUFACTURER,DEFAULT_TWIN_ENGINE); // Below low extreme
            Boat boat5 = new Boat(excessiveYear,   GOOD_MODEL_NAME, GOOD_HORSEPOWER, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // Above high extreme
            
            assertEquals("Model Year is not set correctly in the Constructor. -2 marks.\n", GOOD_MODEL_YEAR, boat1.getModelYear());
            assertEquals("Model Year does not accept a valid input value of 1973. -2 marks.\n", 1973, boat2.getModelYear());
            assertEquals("Model Year does not accept a valid input value of " + (currYear) + ". -2 marks.\n", currYear, boat3.getModelYear());
            assertEquals("Model Year does not reject an invalid input value of 1972. -2 marks.\n", 0, boat4.getModelYear());
            assertEquals("Model Year does not reject an invalid input value of " + (excessiveYear) + ". -2 marks.\n", 0, boat5.getModelYear());
        }
        catch (java.lang.Exception e)
        {
            throw new AssertionError("Unidentified crash prevents modelYear from being assigned. -2 marks. \n");
        }
    }

    @Test
    public void TestConstructorNameParameter() {
        try {
            Boat boat1 = new Boat(GOOD_MODEL_YEAR,   null, GOOD_HORSEPOWER, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE);
            assertEquals("Validation for Model Name does not accept a null correctly. -2 marks.\n", null, boat1.getModelName());
        }
        catch (java.lang.Exception e)
        {
            throw new AssertionError("Constructor crashes when modelName is null. -2 marks. \n");
        }
        
        try {
            Boat boat2 = new Boat(GOOD_MODEL_YEAR,   "", GOOD_HORSEPOWER,GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE);
            assertEquals("Validation for Model Name does not accept an empty string (i.e. \"\") correctly. -2 marks.\n", null, boat2.getModelName());
        }
        catch (java.lang.Exception e)
        {
            throw new AssertionError("Constructor crashes when you pass in an empty string (\"\"). -2 marks. \n");
        }
        
        try {
            Boat boat3 = new Boat(GOOD_MODEL_YEAR,   GOOD_MODEL_NAME, GOOD_HORSEPOWER,GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE);
            assertEquals("Model Name is not set correctly in the Constructor. -2 marks.\n", "Outlaw", boat3.getModelName());
        }
        catch (java.lang.NullPointerException e)
        {
            throw new AssertionError("Unidentified crash prevents modelName from being assigned. -2 marks. \n");
        }
    }

    @Test
    public void TestConstructorHorsepowerParameter() {
        try {
            Boat boat1 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME, 200.0, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE);
            Boat boat2 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME, 50.0, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // Low end (inclusive) of the ranges
            Boat boat3 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME, 390.0, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // High end (inclusive) of the ranges
            Boat boat4 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME, 49.0, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // Below low extreme
            Boat boat5 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME, 391.0,GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // Above high extreme
            assertEquals("Horsepower does not accept a valid input value of 200.0. -2 marks.\n", 200.0, boat1.getHorsepower(), 0.1);
            assertEquals("Horsepower does not accept a valid input value of 50.0. -2 marks.\n", 50.0, boat2.getHorsepower(), 0.1);
            assertEquals("Horsepower does not accept a valid input value of 390.0. -2 marks.\n", 390.0, boat3.getHorsepower(), 0.1);
            assertEquals("Horsepower does not reject an invalid input value of 49.0. -2 marks.\n", 0.0, boat4.getHorsepower(), 0.1);
            assertEquals("Horsepower does not reject an invalid input value of 391.0. -2 marks.\n", 0.0, boat5.getHorsepower(), 0.1);
        }
        catch (java.lang.Exception e)
        {
             throw new AssertionError("Unidentified crash prevents horsepower from being assigned. -2 marks. \n");
        }
    }

    @Test
    public void TestConstructorTwinEngineParameter() {
        try {
            Boat boat1 = new Boat(GOOD_MODEL_YEAR, GOOD_MODEL_NAME, 300.0, GOOD_MANUFACTURER, GOOD_TWIN_ENGINE);
            assertEquals("Twin Engine does not accept a valid input value of true. -1 mark.\n", true, boat1.getIsTwinEngine());
        }
        catch (java.lang.Exception e)
        {
             throw new AssertionError("Unidentified crash prevents isTwinEngine from being assigned. -1 mark. \n");
        }
    }
    
    

    @Test
    public void TestGetDetailsStringWithGoodValues()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        String expectedOutput =     "This powerboat is a 1992 Outlaw with 200.0hp and does not have a twin-engine. " + 
                                    "It is manufactured by Yamaha and you can read more at http://www.Boat.com/specs/" + 
                                    NEWLINE_CHAR;

        Boat boat1 = new Boat(1992, "Outlaw", 200.0, GOOD_MANUFACTURER, false); // Create an object with JUST a bad year
        boat1.setWebpage("http://www.Boat.com/specs/");
        boat1.getBoatDetails();
        assertEquals("Constructor does not output the details string correctly. -4 marks. \n",
                    expectedOutput, outContent.toString());    
        //Flush the collected content
        outContent.reset();
        ps.flush();
    }

    private String obtainGetDetailsOutput(Boat testSubject)
    {
        String theOutput;
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);

        //Flush the collected content
        outContent.reset();
        ps.flush();
        
        try
        {
            testSubject.getBoatDetails();
            theOutput = outContent.toString();
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            //Flush the collected content
            outContent.reset();
            ps.flush();
        }
        
        return theOutput;
    } // end method

    @Test
    public void TestGetDetailsStringWithBadYear()
    {
        Boat boat1;
        try {
             boat1 = new Boat(); // Create an object with JUST a bad year
             boat1.setModelName(GOOD_MODEL_NAME);
             boat1.setHorsepower(GOOD_HORSEPOWER);
             boat1.setManufacturer(GOOD_MANUFACTURER);
        }
        catch (Exception e)
        {
            throw new AssertionError("A crash during Boat object construction prevents this test. -2 marks. \n");
        }
        
        try {
            assertEquals("Print details does not output the correct error string when 1950 is given as the year. -2 marks. \n",
                    EXPECTED_GET_BAD_YEARED_BOAT_DETAILS, obtainGetDetailsOutput(boat1));
        }
        catch (Exception e)
        {
            throw new AssertionError("Print Details crashes when the model name is null. -2 marks. \n");
        }
    }
    
    @Test
    public void TestGetDetailsStringWithBadName()
    {
        Boat boat1;
        try {
             boat1 = new Boat(); // Create an object with JUST a bad name
             boat1.setModelYear(GOOD_MODEL_YEAR);
             boat1.setHorsepower(GOOD_HORSEPOWER);
             boat1.setManufacturer(GOOD_MANUFACTURER);
        }
        catch (Exception e)
        {
            throw new AssertionError("A crash during Boat object construction prevents this test. -2 marks. \n");
        }
        
        try {
            assertEquals("Print Details does not output the correct error string when the model name is null. -2 marks. \n",
                    EXPECTED_GET_BAD_NAMED_BOAT_DETAILS, obtainGetDetailsOutput(boat1));
        }
        catch (Exception e)
        {
            throw new AssertionError("Print Details crashes when the model name is null. -2 marks. \n");
        }
    }

    @Test
    public void TestGetDetailsStringWithBadHorsepower()
    {
        Boat boat1;
        try {
             boat1 = new Boat(); // Create an object with JUST a bad horsepower
             boat1.setModelYear(GOOD_MODEL_YEAR);
             boat1.setModelName(GOOD_MODEL_NAME);
             boat1.setManufacturer(GOOD_MANUFACTURER);
        }
        catch (Exception e)
        {
            throw new AssertionError("A crash during Boat object construction prevents this test. -2 marks. \n");
        }
        
        try {
            assertEquals("Print Details does not output the correct error string when the model name is null. -2 marks. \n",
                    EXPECTED_GET_BAD_HORSEPOWERED_BOAT_DETAILS, obtainGetDetailsOutput(boat1));
        }
        catch (Exception e)
        {
            throw new AssertionError("Print Details crashes when horsepower is 0.0. -2 marks. \n");
        }
    }

     @Test
    public void TestGetDetailsStringWithBadManufacturer()
    {
        Boat boat1;
        try {
             boat1 = new Boat(); // Create an object with JUST a bad name
             boat1.setModelYear(GOOD_MODEL_YEAR);
             boat1.setHorsepower(GOOD_HORSEPOWER);
             boat1.setModelName(GOOD_MODEL_NAME);
        }
        catch (Exception e)
        {
            throw new AssertionError("A crash during Boat object construction prevents this test. -2 marks. \n");
        }
        
        try {
            assertEquals("Print Details does not output the correct error string when the model name is null. -2 marks. \n",
                    EXPECTED_GET_BAD_MANUFACTURER_BOAT_DETAILS, obtainGetDetailsOutput(boat1));
        }
        catch (Exception e)
        {
            throw new AssertionError("Print Details crashes when the model name is null. -2 marks. \n");
        }
    }

    
    @Test
    public void TestGetDetailsStringWithBadEverything()
    {
        Boat boat1;
        try {
             boat1 = new Boat(DEFAULT_MODEL_YEAR, DEFAULT_MODEL_NAME, DEFAULT_HORSEPOWER, GOOD_MANUFACTURER, DEFAULT_TWIN_ENGINE); // as you can see from the constant names, none of these are "good"
        }
        catch (Exception e)
        {
            return;
        }
        
        try {
            String output = obtainGetDetailsOutput(boat1);
            boolean hasOneErrorButNothingElse = EXPECTED_GET_BAD_YEARED_BOAT_DETAILS.equals(output)
                || EXPECTED_GET_BAD_NAMED_BOAT_DETAILS.equals(output)
                || EXPECTED_GET_BAD_HORSEPOWERED_BOAT_DETAILS.equals(output);
            
            assertEquals("Print Details does not output the correct error string when multiple bad fields are encountered. -5 marks. \n", true, hasOneErrorButNothingElse);
        }
        catch (Exception e)
        {
            return;
        }
    }

    @Test
    public void TestGetDetailsStringWithNonCasedModelName()
    {
        final String WEBSITE = "http://www.Boat.com/specs/";
        final String EXPECTED_GET_GOOD_BOAT_DETAILS =     "This powerboat is a 1992 Outlaw with 200.0hp and does not have a twin-engine. "
            + "It is manufactured by Yamaha and you can read more at " + WEBSITE + NEWLINE_CHAR;
        
        Boat boat1;
        try {
             boat1 = new Boat(1992, GOOD_MODEL_NAME, 200.0,GOOD_MANUFACTURER, false);
        }
        catch (Exception e)
        {
            throw new AssertionError("A crash during Boat object construction prevents this test. -2 marks. \n");
        }
        
        boat1.setWebpage(WEBSITE);
        
        try {
            assertEquals("Print Details does not output the correct error string when the model name is passed in as Outlaw. -2 marks. \n",
                    EXPECTED_GET_GOOD_BOAT_DETAILS, obtainGetDetailsOutput(boat1));
        }
        catch (Exception e)
        {
            throw new AssertionError("Print Details crashes when horsepower is 0.0. -2 marks. \n");
        }
    }
}