package check;

import constants.Constants;

public class Main {

	//課題①
	private static String firstName = "篠田";
	private static String lastName = "司";

	public static String getFirstName() {
		return firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	//課題②
	private static void printName(String fn, String ln) {
		System.out.println(fn + ln);
	}

	public static void main(String[] args) {
		//課題③

		System.out.print("printNameメソッド　→　");
		printName(Main.getFirstName(), Main.getLastName());

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rPet.introduce();
	}

}
