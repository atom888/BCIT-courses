
/**
 * This Movie class will provided information about the director, the year the movie was released, and the movie title
 *
 * @author Adam Dipinto
 * @version V1.0 June 6 2017
 */
public class Movie
{
    public Director director;
    public Date released;
    public Name name;
    private String title;

    /**
     * Default constructor for objects of class Movie
     */
    public Movie()
    {
        director = new Director();
        released = new Date();
        title = "Untitled";
    }
    
    /**
     * Movie Constructor for objects of class Movie
     * @param newDirector - sets the director if not null
     * @param newReleased - sets the release date if not null
     * @param newTitle - sets the title of movie if not null
    */
    public Movie(Director newDirector, Date newReleased, String newTitle)
    {
        if (newDirector != null) {
            director = newDirector;
        } else {
            director = new Director();
        }
        
        if (newReleased != null) {
            released = newReleased;
        } else {
            released = new Date();
        }
        
        if (newTitle != null) {
            title = newTitle;
        } else {
            title = "Untitled";
        }
    }
    /**
     * @return getDirectorName - returns the full name of the director
    */
    public String getDirectorName()
    {
        name = new Name();
        return name.getFullName(); 
    }
    /**
     * @return getDayOfTheWeekMovieWasReleased - returns the day the movie was released 
    */
    public String getDayOfTheWeekMovieWasReleased() {
        Date d = new Date();
        return d.getDayOfTheWeek();
    }
    /**
     * printDetails - provides a print detailed messaged about the director, title of movie, and the release date
    */
    public void printDetails() {
        director = new Director();
        released = new Date();
        name = new Name();
        /*if (director.getPseudonym() != null) {
        System.out.println(director.getDirectorFullName() + " (" + name.getInitials() +") " + "released " + getTitle() + " on " + 
        getDayOfTheWeekMovieWasReleased() + ", " + released.getMonthName(released.getMonth()) + " " + released.getDay() + ", " + released.getYear() + " under the pseudonym " + director.getPseudonym() );
        } else { */
        System.out.println(director.getDirectorFullName() + " (" + name.getInitials() +") " + "released " + getTitle() + " on " + 
        getDayOfTheWeekMovieWasReleased() + ", " + released.getMonthName(released.getMonth()) + " " + released.getDay() + ", " + released.getYear() );
    
    }
    /**
     * @return getTitle - returns the title name of the movie
    */
    public String getTitle() {
        return title;
    }
    /**
     * @return getDirector - returns the full name of the director
    */
    public Director getDirector() {
        return director;
    }
    /**
     * @return getDateReleased - returns the date of when the movie was released
    */
    public Date getDateReleased() {
        return released;
    }
    /**
     * @param newTitle - sets the title of the movie
    */
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    /**
     * @param newDirector - sets the name of the director of the movie
    */
    public void setDirector(Director newDirector) {
        director = newDirector;
    }
    /**
     * @param newReleased - sets the release date of the movie
    */
    public void setDateReleased(Date newReleased) {
        released = newReleased;
    }
}
