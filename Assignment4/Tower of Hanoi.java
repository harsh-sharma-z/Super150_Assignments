import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rings = sc.nextInt();

		String src = "A", dest = "B", help = "C";

		solve(rings, src, dest, help);

	}

	public static void solve(int rings, String src, String dest, String help) {


		if (rings == 0)
			return;

		solve(rings-1, src, help, dest);

		System.out.println("Moving ring " + rings + " from " + src + " to " + dest);

		solve(rings-1, help, dest, src);

	}
}
