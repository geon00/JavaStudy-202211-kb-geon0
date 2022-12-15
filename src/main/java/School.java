public class School {

	private static School instance;

	private String schoolName;

	private School() {

	}

	public static School getInstance() {

		if (instance == null) {

			synchronized (School.class) {

				instance = new School();
			}

		}

		return instance;
	}

}