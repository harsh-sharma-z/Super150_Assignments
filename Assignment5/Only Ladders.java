import java.util.*;
public class Main {
	
    public static HashMap<Integer,Integer> uwu;


    public static int c;

    public static void dis(int n, int i, String s){
        if(i>n)
            return;

        if(i==n){
            System.out.print(s+"END , ");
            c++;
        }


        if(uwu.containsKey(i))
            dis(n,uwu.get(i),s+(char)('0'+i)+" ");
        else
            for(int j=1;j<7;j++)
                dis(n,i+j,s+(char)('0'+i)+" ");

    }

    public static void prime(int n) {
        boolean ar[] = new boolean[n + 1];
        ar[0] = true;
        ar[1] = true;
        for (int i = 2; i < n + 1; i++)
            if (!ar[i])
                for (int j = i * i; j < n + 1; j = j + i)
                    ar[j] = true;
        int i = 0;

        int j = ar.length - 1;

        while (true) 
		{
            while (ar[i])
                i++;

            while (ar[j])
                j--;

            if (i >= j)
                break;

            uwu.put(i, j);
			
            i++;
            j--;
        }
    }



        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            uwu=new HashMap<>();
            int num=sc.nextInt();
            c=0;
            prime(num);
            dis(num,0,"");
            System.out.print("\n"+c);
        }
}
