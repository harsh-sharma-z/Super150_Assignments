import java.util.Scanner;
import java.util.Arrays;

public class Main {
	


	public static void main(String[] args) {
		startPrinting = false;

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		isInputStringFound = str;

		char[] strA = str.toCharArray();
		Arrays.sort(strA);
		String smallestString = new String(strA);

		print(smallestString, "");
	}


	public static void print(String str, String res) {
		if (str.equals("") && startPrinting) {
			System.out.println(res);
			return;
		}

		if (res.equals(isInputStringFound))
			startPrinting = true;

		for (int i = 0; i < str.length(); i ++)
			print(str.substring(0, i) + str.substring(i).substring(1), res + str.charAt(i));
	}


	static boolean startPrinting;
	static String isInputStringFound;
}
