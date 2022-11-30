import java.util.*;


public class Main{

    public static void main(String[] args) {	

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

		System.out.println("\n"+chessboardproblem(n, n- 1, n- 1, 0, 0, ""));

	}

	public static int  chessboardproblem(int n, int er, int ec, int cr, int cc, String ans)
	{
	
		if (cc== ec && cr ==er) 
		{
			System.out.print(ans+ "{" + cr+"-" + cc+ "} ");
			return 1;
	    }
		if ( cr >= n ||cc >= n) 
		{
			return 0;
		}
		int count=0;

		count+=chessboardproblem(n, er, ec, cr+ 2, cc+ 1, ans +"{"+ cr+"-"+cc+"}K");

		count+=chessboardproblem(n, er,ec, cr+ 1, cc+ 2, ans+ "{" +cr+ "-" +cc+"}K");

    
		if (cc== 0 || cr== 0 ||cc ==n- 1 ||cr== n- 1) {
	
			for (int i = 1; i <= er; i++) 
			{
				count+=chessboardproblem(n, er, ec, cr, cc+ i, ans+ "{" +cr+ "-" + cc+ "}R");
            }
		
			for (int i = 1; i <= er; i++) 
			{
			    count+=chessboardproblem(   n, er,ec, cr+ i, cc, ans+ "{" + cr+ "-" +cc+ "}R");
			    
			}
		}
		
		
	    if (cc== cr||cc+ cr==er) {
			
			for (int i=1; i<=er; i++) 
			{
				count+=chessboardproblem(n, er, ec, cr+ i, cc+ i, ans+ "{" + cr+ "-" +cc+ "}B");

			}
	}
		
		
		
		return count;

    	}
    }
