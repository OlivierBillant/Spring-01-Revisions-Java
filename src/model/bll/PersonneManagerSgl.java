package model.bll;

public class PersonneManagerSgl {
	private static PersonneManager instance;

	public static PersonneManager getInstance() {
		if (instance == null) {
			instance = new PersonneManager();
		}
		return instance;
	}
}
