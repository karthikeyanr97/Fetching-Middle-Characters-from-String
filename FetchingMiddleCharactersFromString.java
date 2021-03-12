import java.util.Scanner;

public class FetchingMiddleCharactersFromString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the even length of String:");
		String word = scanner.nextLine();
		String result = getMiddleChars(word);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getMiddleChars(String word) {
		return "" + word.charAt((word.length() / 2) - 1) + word.charAt(word.length() / 2);
	}
}
