/**
 * 
 */
package ca.bcit.comp1451.session05LabSolutions.LabA;

/**
 * @author A00749008
 *
 */
public class Novel extends ReadingMaterial {

	private String mainCharacterName;
	private String theme;
	private String novelistName;

	/**
	 * non-default Novel constructor
	 * 
	 * @param title
	 * @param numberOfPages
	 * @param mainCharacterName
	 * @param theme
	 * @param novelistName
	 */

	public Novel(String title, int numberOfPages, String mainCharacterName, String theme, String novelistName) {
		super(title, numberOfPages);
		setMainCharacterName(mainCharacterName);
		setTheme(theme);
		setNovelistName(novelistName);

	}

	/**
	 * Method getMainCharacterName
	 * 
	 * @return the mainCharacterName
	 */
	public String getMainCharacterName() {
		return mainCharacterName;
	}

	/**
	 * Method setMainCharacterName
	 * 
	 * @param mainCharacterName
	 *            the mainCharacterName to set
	 */
	public void setMainCharacterName(String mainCharacterName) {
		if (mainCharacterName != null && !mainCharacterName.isEmpty()) {
			this.mainCharacterName = mainCharacterName;
		} else {
			mainCharacterName = "unknown";
		}

	}

	/**
	 * Method getTheme
	 * 
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * Method setTheme;
	 * 
	 * @param theme
	 *            the theme to set
	 */
	public void setTheme(String theme) {
		if (theme != null && !theme.isEmpty()) {
			this.theme = theme;
		}
		else{
			theme = "unknown";
		}
	}

	/**
	 * Method getNovelistName
	 * 
	 * @return the novelistName
	 */
	public String getNovelistName() {
		return novelistName;
	}

	/**
	 * Method setNovelistName
	 * 
	 * @param novelistName the novelistName to set
	 *         
	 */
	public void setNovelistName(String novelistName) {
		if (novelistName != null && !novelistName.isEmpty()) {
			this.novelistName = novelistName;
		}
		else{
			novelistName = "unknown";
		}
	}

	public void displayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("Main Character's Name: " + mainCharacterName);
		System.out.println("Theme: " + theme);
		System.out.println("NovelistName: " + novelistName);

	}

}
