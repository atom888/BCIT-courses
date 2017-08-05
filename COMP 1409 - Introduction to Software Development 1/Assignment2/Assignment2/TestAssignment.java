
/**
 * This TestAssignment Class will test the classes in this package (Date, Name, Director, Movie, TestDate).
 * 
 * @author James McCartney
 * @version 1.0
 */
public class TestAssignment
{
    /*
     * This default constructor for the TestAssignment tests the various classes. Expected output below.
     */
    public TestAssignment()
    {

        TestDate td = new TestDate();

        Date d = new Date();
        System.out.println(d.getFormattedDate());
        // calls private method getPaddedMonth()
        // calls private method getPaddedDay()
        System.out.println(Date.getMonthName(3));
        System.out.println(d.getDayOfTheWeek());
        // calls private method isLeapYear()
        System.out.println(d.getNumberOfDaysInThisMonth ());
        System.out.println(Date.getMonthNumber("December"));

        Date d2 = new Date(2001, 6, 29);
        System.out.println(d2.getFormattedDate());
        System.out.println(d2.getDayOfTheWeek());
        System.out.println(d2. getNumberOfDaysInThisMonth ());

        Date d3 = new Date(1995, 14, 8);  // invalid date; month is > 12 System.out.println(d3.getFormattedDate());
        System.out.println(d3.getFormattedDate());
        System.out.println(d3.getDayOfTheWeek());
        System.out.println(d3.getNumberOfDaysInThisMonth());

        System.out.println(d3.getYear());
        System.out.println(d3.getMonth());
        System.out.println(Date.getMonthName(d3.getMonth()));

        d3.setYear(3500);   // too high; don’t set it
        System.out.println(d3.getYear());
        d3.setYear(-3); // too low; don’t set it
        System.out.println(d3.getYear());
        d3.setYear(2010);   
        System.out.println(d3.getYear());
        d3.setMonth(13);    // too high; don’t set it
        System.out.println(d3.getMonth());
        d3.setMonth(0); // too low ; don’t set it
        System.out.println(d3.getMonth());
        d3.setMonth(8); 
        System.out.println(d3.getMonth());

        d3.setDay(32);  // too high; don’t set it
        System.out.println(d3.getDay());
        d3.setDay(0);   // too low ; don’t set it
        System.out.println(d3.getDay());
        d3.setDay(27);  
        System.out.println(d3.getDay());

        Name n = new Name();
        System.out.println(n.getFullName());
        // calls makePrettyName()
        System.out.println(n.getInitials());
        Name n2 = new Name("sTEven", "SpielberG", null);
        System.out.println(n2.getFullName()); 
        System.out.println(n2.getInitials());
        Name nn = new Name("sTEven","SpielberG", "aLLan");
        System.out.println(nn.getFullName());
        System.out.println(nn.getInitials());

        Name n3 = new Name(null, "spielberg", "allan");
        System.out.println(n3.getFullName());
        System.out.println(n3.getInitials()); // first cannot be null

        Name n4 = new Name("steVEn", null, "alLAn"); 
        System.out.println(n4.getFullName()); // last cannot be null
        System.out.println(n4.getInitials());

        Name n5 = new Name("", "spielberg", "Allan"); // too short
        System.out.println(n5.getFullName());
        System.out.println(n5.getInitials());

        Name n6 = new Name(null, "spielberg", "alLAn"); // null first not allowed 
        System.out.println(n6.getFullName());
        System.out.println(n6.getInitials());

        Name n7 = new Name("Steven", "spielberg", "01234567890123456789012345678901234567890123456789");
        System.out.println(n7.getFullName()); // too long
        System.out.println(n7.getInitials());

        Name n8 = new Name("sTEven", "SpielberG", null);
        System.out.println(n8.getFirstName());
        System.out.println(n8.getMiddleName());
        System.out.println(n8.getLastName());

        Name n9 = new Name("sTEven", "SpielberG", "alLAn");
        System.out.println(n9.getMiddleName());

        Director a = new Director(); // default dates and names
        System.out.println(a.getDateBorn().getFormattedDate());//default
        System.out.println(a.getName().getFullName()); //default
        System.out.println(a.getDateDied().getFormattedDate());//default
        System.out.println(a.getName().getFullName()); //default
        System.out.println(a.isDirectorAlive()); 
        System.out.println(a.getAgeYearsOfDirector()); // note: it is 2017 now

        Date d1 = new Date(1946, 12, 18);
        Director a1 = new Director(null, d1, null); // null name not allowed
        System.out.println(a1.getName().getFullName());

        Name n1 = new Name("sTEven", "SpielberG", null);
        Director a2 = new Director(n1, null, null); // null born not allowed
        System.out.println(a2.getDateBorn().getFormattedDate());

        Director a3 = new Director(n1, d1, null); 
        System.out.println(a3.getDateBorn().getFormattedDate());
        System.out.println(a3.getName().getFullName()); 

        Name name = new Name("sTEven", "SpielberG", "alLAn");
        Date born = new Date(1946, 12, 18);
        Name pseudonym = new Name("RalpH", "DanGEr", null);
        Director a4 = new Director(name, born, null, pseudonym);
        System.out.println(a4.getName().getFullName());
        System.out.println(a4.getDateDied());
        System.out.println(a4.getDateBorn().getFormattedDate());
        System.out.println(a4.getPseudonym().getFullName());

        Name name1 = new Name("sTEven", "SpielberG", "alLAn");
        Date born1 = new Date(1946, 12, 18);
        Director a5 = new Director(name1, born1, null); // no pseudonym
        System.out.println(a5.getName().getFullName());
        System.out.println(a5.getDateDied());
        System.out.println(a5.getDateBorn().getFormattedDate());
        System.out.println(a5.getPseudonym());

        Name name2 = new Name("sTEven", "SpielberG", "alLAn");
        Date born2 = new Date(1946, 12, 18);
        Date died = new Date(2000, 6, 13);
        Director a6 = new Director(name2, born2, died);
        System.out.println(a6.getDateDied().getFormattedDate());

        Director a7 = new Director("steven", "spielberg", null, 1946, 12, 18, 2000, 6, 13, "ralph", "danger", null);
        System.out.println(a7.getDateDied().getFormattedDate());
        System.out.println(a7.getName().getFullName());
        System.out.println(a7.getDateBorn().getFormattedDate());
        System.out.println(a7.getPseudonym().getFullName());
        

        Name name3 = new Name("sTEven", "SpielberG", "alLAn");
        Date born3 = new Date(1946, 12, 18);
        Date died3 = new Date(2017, 2, 1);
        Director a8 = new Director(name3, born3, died3);
        System.out.println(a8.getAgeYearsOfDirector()); // note: it’s 2017 now

        Movie bb = new Movie(); // default title is "Untitled"
        System.out.println(bb.getTitle()); 
        System.out.println(bb.getDirector().getName().getFullName());
        System.out.println(bb.getDirector().getPseudonym().getFullName());
        System.out.println(bb.getDirector().getDateBorn().getFormattedDate());
        System.out.println(bb.getDirector().getDateDied().getFormattedDate());
        System.out.println(bb.getDateReleased().getFormattedDate());

        Date date = new Date(1985, 7, 3);
        String title = "Back to the Future";
        Movie b2 = new Movie(null, date, title);    // Director is null
        System.out.println(b2.getDirector().getName().getFullName());
        System.out.println(b2.getTitle ());
        System.out.println(b2. getDateReleased().getFormattedDate());

        Movie b3 = new Movie(null, null, null); // Date, title are null 
        System.out.println(b3. getDateReleased().getFormattedDate());
        System.out.println(b3.getTitle ());
        Name name4 = new Name("sTEven", "SpielberG", "alLan");
        Date born4 = new Date(1946, 12, 18);
        Date died4 = new Date(2000, 6, 13);
        Director aa = new Director(name4, born4, died4);
        Date released4 = new Date(2015, 10, 20);
        Movie b4 = new Movie(aa, released4, "Jurassic World");
        System.out.println(b4.getDirectorName ());
        System.out.println(b4.getDayOfTheWeekMovieWasReleased());
        b4.printDetails();
        Name name5 = new Name("sTEven", "SpielberG", null);
        Date born5 = new Date(1946, 12, 18);
        Date died5 = new Date(2000, 6, 13);
        Name pseudonym5 = new Name("Ralph", "Danger", null);
        Director aaa = new Director(name5, born5, died5, pseudonym5);
        Date released5 = new Date(2015, 10, 20);
        Movie b5 = new Movie(aaa, released5, "Jurassic World");
        b5.printDetails();
        // use the getDayOfTheWeekMovieWasReleased() method

        /* Expected output of TestAssignment constructor:
         * Sunday
         * Sunday
         * Monday
         * Tuesday
         * Tuesday
         * Tuesday
         * Wednesday
         * Wednesday
         * Thursday
         * Thursday
         * Friday
         * Friday
         * Saturday
         * Saturday
         * Saturday
         * 2013-01-01
         * March
         * Tuesday
         * 31
         * 12
         * 2001-06-29
         * Friday
         * 30
         * 2013-01-01
         * Tuesday
         * 31
         * 2013
         * 1
         * January
         * 2013
         * 2013
         * 2010
         * 1
         * 1
         * 8
         * 1
         * 1
         * 27
         * A. Non Ymous
         * A.N.Y.
         * Stephen King
         * S.K.
         * Stephen Edwin King
         * S.E.K.
         * A. Non Ymous
         * A.N.Y.
         * A. Non Ymous
         * A.N.Y.
         * A. Non Ymous
         * A.N.Y.
         * A. Non Ymous
         * A.N.Y.
         * A. Non Ymous
         * A.N.Y.
         * Stephen
         * null
         * King
         * Edwin
         * 2013-01-01
         * A. Non Ymous
         * 2013-01-01
         * A. Non Ymous
         * false
         * 0
         * A. Non Ymous
         * 2013-01-01
         * 1947-09-21
         * Stephen King
         * Stephen Edwin King
         * null
         * 1947-09-21
         * Richard Bachman
         * Stephen Edwin King
         * null
         * 1947-09-21
         * null
         * 2000-06-13
         * 2000-06-13
         * Stephen King
         * 1947-09-21
         * Richard Bachman
         * 66
         * Untitled
         * A. Non Ymous
         * A. Non Ymous
         * 2013-01-01
         * 2013-01-01
         * 2013-01-01
         * A. Non Ymous
         * It
         * 2000-04-29
         * 2013-01-01
         * Untitled
         * Stephen Edwin King
         * Monday
         * Stephen Edwin King(S.E.K.) wrote Carrie on Monday, October 31, 1988
         * Stephen King(S.K.) wrote Carrie on Monday, October 31, 1988, under the pseudonym Richard Bachman
         *
         */
    }
}
