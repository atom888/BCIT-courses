/**
 * 
 */
package ca.bcit.comp1451.Session5LabA;

/**
 * @author A01034457
 *
 */
public class Novel extends ReadingMaterial {
	private String mainCharacterName;
	private String theme;
	private String novelistName;
	
	public Novel (String title, int numberOfPages, String mainCharacterName, String theme, String novelistName) {
		super(title, numberOfPages);
		setMainCharacterName(mainCharacterName);
		setTheme(theme);
		setNovelistName(novelistName);
	}

	/**
	 * @return the mainCharacterName
	 */
	public String getMainCharacterName() {
		return mainCharacterName;
	}

	/**
	 * @param mainCharacterName the mainCharacterName to set
	 */
	public void setMainCharacterName(String mainCharacterName) {
		if (mainCharacterName != null && !mainCharacterName.isEmpty()) {
			this.mainCharacterName = mainCharacterName;
		} else {
			this.mainCharacterName = "unknown main character name.";
		}
		
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		if (theme != null && !theme.isEmpty()) {
			this.theme = theme;
		} else {
			this.theme = "unknown theme."; 
		}
		
	}

	/**
	 * @return the novelistName
	 */
	public String getNovelistName() {
		return novelistName;
	}

	/**
	 * @param novelistName the novelistName to set
	 */
	public void setNovelistName(String novelistName) {
		if (novelistName != null && !novelistName.isEmpty()) {
			this.novelistName = novelistName;
		} else {
			this.novelistName = "unknown novelist name.";
		}
		
	}
	
	public void displayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("Main Character Name: " + getMainCharacterName());
		System.out.println("Theme : " + getTheme());
		System.out.println("Novelist Name: " + getNovelistName());
	}

}
