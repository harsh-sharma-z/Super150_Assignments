import java.util.Scanner;
public class Main {
	static int count;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		count = countTwin(s);

		System.out.println(count);
	}

	public static int countTwin(String s) {
		if (s.length() < 3)
			return 0;

		int count = 0;
		if (s.charAt(0) == s.charAt(2) && s.charAt(1) != s.charAt(0))
			count ++;

		return count + countTwin(s.substring(1));
	}
}
