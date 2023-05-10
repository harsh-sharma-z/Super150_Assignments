import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0)

            long n=sc.nextLong();

            System.out.println(trade(n));
        

    }
    public static long trade(long n) {
        if(n<=10){
            return n;
        }
            long c1 = trade(n/2);
            long c2 = trade(n/3);
            long c3 = trade(n/4);
            long sum = c1+c2+c3;
            return (Math.max(n, sum));

    }
}


