import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		count = 0;

		Scanner sc = new Scanner(System.in);

		String inp = sc.next();

		print(inp, 0, "");

		System.out.print("\n" + count);
	}




	public static void print(String inp, int idx, String res) {

		if (res.length() == inp.length()) {

			System.out.print(res + " ");
			count++;
			return;
			
		}

		String pressedString = mapping[inp.charAt(idx) - '0'];


		for (int i = 0; i < pressedString.length(); i ++) {

			print(inp, idx + 1, res + pressedString.charAt(i));

		}
	}


	static String[] mapping = new String[]{"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
	static int count;
}
