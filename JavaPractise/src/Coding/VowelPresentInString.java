package Coding;

public class VowelPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(stringContainsVowels("TorkMotors"));
  System.out.println(stringContainsVowels("Kratos"));
	}

	private static boolean stringContainsVowels(String input) {
		// TODO Auto-generated method stub
		return input.toUpperCase().matches(".*[AEIOU].*");
	}

}
