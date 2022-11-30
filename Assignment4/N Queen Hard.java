
import java.util.Scanner;

public class Main {

	static int count;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[][] board = new boolean[n][n];
		nQueenProblem(board, n, 0);
		System.out.println(count);
	}


	public static void display(boolean[][] board) {
		for (boolean[] booleans : board) {
			for (int j = 0; j < board.length; j++)
				System.out.print((booleans[j] ? "Q" : "*") + " ");
			System.out.println();
		}
		System.out.println();
	}


	public static void nQueenProblem(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			count++;
			return;
		}


		for (int col = 0; col < board.length; col ++) {
			if (isSafe(board, row, col)) {
				board[row][col] = true;
				nQueenProblem(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean isSafe (boolean[][] board, int row, int col) {

	
		for (int i = 0; i < row; i ++)
			if (board[i][col])
				return false;

		
		int r = row, c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r --;
			c --;
		}

	
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c])
				return false;
			r --;
			c ++;
		}

		return true;
	}

}
