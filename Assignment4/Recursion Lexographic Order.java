import java.util.Scanner;

public class Main {


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
System.out.print("0 ");
		for (int i = 1; i <= 9; i ++)

			print(n, "" + i);
	}

	public static void print(int n, String res) {


		if (Integer.parseInt(res) > n)
			return;


		System.out.print(res+" ");


		for (int i = 0; i <= 9; i ++)
			print(n, res + i);


	}
}
