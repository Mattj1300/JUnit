package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {

	// method one to rate the strength of the users password
	public static int howBad(int minReq, String[] passwordList) {
		int j = passwordList.length - 1;
		int rating = 0;
		for (int i = 0; i < passwordList.length; i = i + 1) {
			if (passwordList[j].length() < minReq || checkLetter(passwordList[j]).equals("y"))
				rating++;
			j--;
		}
		return rating;
	}

	// method two checks to make checks whether the string contains any non-letters
	public static String checkLetter(String password) {
		int count = -1;
		while (count++ < password.length() - 1) {
			char letter = password.charAt(count);

			if (!(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z'))
				return "n";
			
			count++;
		}
		return "y";
	}

	public static void main(String[] args) {

		System.out.println(checkLetter("bigmoose$"));
		System.out.println(checkLetter("emusareawesome"));
		System.out.println(checkLetter("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(howBad(8, passwords));
	}

}
